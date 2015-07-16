/*
 * (c) Центр ИТ, 2015. Все права защищены.
 */
package uml2xsd;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * DAO для работы с тестовой БД сообщений для демонстрации валидации OCL между сообщениями.
 * <p/>
 * Настройки подключения берутся из следующих параметров запуска JVM:
 * <p/>
 * -Docltest.user=пользователь
 * -Docltest.password=пароль
 * -Docltest.host=хост
 * -Docltest.port=порт
 * -Docltest.database=название_БД
 * -Docltest.fileencoding=кодировка_xml_файлов
 * <p/>
 * <p/>
 * Где срезал углы:
 * - Использованы только стандартные классы JDK.
 * - Управления транзакциями нет.
 * - Подключение java.sql.Connection создаётся на каждый запрос, пулинга коннектов нет.
 * - Все проверяемые исключения заворачиваются в RuntimeException.
 *
 * @author Сергей Петунин
 * @created 16.07.15 20:31
 */
public class MessageDao {

    private static final Logger log = Logger.getLogger(MessageDao.class.getName());

    /* SQL для вставки сообщения в БД. */
    private static final String STMT_SAVE_MESSAGE = "INSERT INTO messages (data) VALUES (?)";

    /* SQL для поиска сообщения по полю BizMsgIdr */
    private static final String STMT_MESSAGE_EXISTS = "SELECT count(*) FROM messages WHERE (xpath('//MeetingInstruction/AppHdr/BizMsgIdr/text()', data))[1]::TEXT = ?";

    /* Параметры подключения к БД и кодировки сообщений, задаются через опции запуска VM, -Docltest.user=ocltest и т.д. */
    private static String paramUser = System.getProperty("ocltest.user"),   // пользователь БД
            paramPassword = System.getProperty("ocltest.password"),         // пароль пользователя БД
            paramHost = System.getProperty("ocltest.host"),                 // хост БД
            paramPort = System.getProperty("ocltest.port"),                 // порт БД
            paramDatabase = System.getProperty("ocltest.database"),         // название БД
            paramFileEncoding = System.getProperty("ocltest.fileencoding"); // кодировка XML-файлов

    /**
     * Сохранение сообщения в БД из локального файла.
     * Кодировка файла должна соответствовать опции -Docltest.fileencoding.
     * Сообщение должно быть валидным XML.
     * Валидация XML происходит при разборе сообщения в Java.
     *
     * @param filename путь к файлу
     */
    public static void saveFromFile(String filename) {
        log.info(String.format("Запись сообщения в базу из файла: %s", filename));
        try {
            save(new String(Files.readAllBytes(Paths.get(filename)), paramFileEncoding));
        } catch (IOException e) {
            throw new RuntimeException(String.format("Не удалось считать файл %s", filename), e);
        }
    }

    /**
     * Сохранение сообщения в БД из строки.
     * Сообщение должно быть валидным XML.
     * Валидация XML происходит при разборе сообщения в Java.
     *
     * @param message содержимое сообщения
     */
    public static void save(String message) {
        log.info(String.format("Сохранение сообщения в базу: %s ...", message.substring(0, Math.min(message.length(), 100))));
        try (
                Connection conn = createConnection();
                PreparedStatement stmt = conn.prepareStatement(STMT_SAVE_MESSAGE)
        ) {

            SQLXML xml = conn.createSQLXML();
            xml.setString(reparseMessage(message));
            stmt.setSQLXML(1, xml);

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Определяет наличие сообщения по его бизнес-идентификатору.
     *
     * @param bizMsgIdr бизнес-идентификатор сообщения (поле MeetingInstruction/AppHdr/BizMsgIdr).
     * @return true, если сообщение с таким идентификатором присутствует в базе.
     */
    public static boolean existsByBizMsgIdr(String bizMsgIdr) {
        log.info("Проверка наличия сообщения с бизнес-идентификатором: " + bizMsgIdr);
        try (
                Connection conn = createConnection();
                PreparedStatement stmt = conn.prepareStatement(STMT_MESSAGE_EXISTS)
        ) {

            stmt.setString(1, bizMsgIdr);
            ResultSet set = stmt.executeQuery();
            set.next();
            return set.getLong(1) > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Переразбор XML-сообщения с целью преобразования кодировки в UTF-8.
     *
     * @param message сообщение
     * @return сообщение, преобразованное в кодировку UTF-8.
     */
    private static String reparseMessage(String message) {
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(message.getBytes("UTF-8")));
            DOMImplementation impl = doc.getImplementation();
            DOMImplementationLS implLS = (DOMImplementationLS) impl.getFeature("LS", "3.0");
            LSSerializer lsSerializer = implLS.createLSSerializer();
            LSOutput lsOutput = implLS.createLSOutput();
            lsOutput.setEncoding("UTF-8");
            Writer stringWriter = new StringWriter();
            lsOutput.setCharacterStream(stringWriter);
            lsSerializer.write(doc, lsOutput);
            return stringWriter.toString();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Connection createConnection() {
        Properties props = new Properties();
        props.put("user", paramUser);
        props.put("password", paramPassword);
        try {
            return DriverManager.getConnection(String.format("jdbc:postgresql://%s:%s/%s", paramHost, paramPort, paramDatabase), props);
        } catch (SQLException e) {
            System.err.println();
            throw new RuntimeException(String.format("Не удалось подключиться к БД со следующими параметрами: " +
                            "user = %s, password = %s, host = %s, port = %s, database = %s",
                    paramUser, paramPassword, paramHost, paramPort, paramDatabase), e);
        }
    }

}

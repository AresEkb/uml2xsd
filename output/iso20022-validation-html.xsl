<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fn="http://www.w3.org/2005/xpath-functions"
                xmlns:vr="urn:iso20022:validation-result"
                xmlns="http://www.w3.org/1999/xhtml"
                exclude-result-prefixes="#all">
  
  <xsl:output encoding="UTF-8" />
  
  <xsl:template match="/">
    <xsl:variable name="result">
      <xsl:apply-templates />
    </xsl:variable>
    <html>
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Результаты валидации сообщения</title>
        <style type="text/css">
          table { border: 1px solid black; border-collapse: collapse; }
          tr { vertical-align: top; }
          td, th { border: 1px solid black; padding: 5px; }
        </style>
      </head>
      <body>
        <xsl:choose>
          <xsl:when test="$result/vr:error">
            <p>Были обнаружены следующие ошибки.</p>
            <table>
              <thead>
                <tr><th>№</th><th>Код</th><th>Расположение</th><th>Бизнес-описание правила</th><th>Ошибка</th></tr>
              </thead>
              <tbody>
                <xsl:for-each select="$result/vr:error">
                  <tr>
                    <td><xsl:number /></td>
                    <td><xsl:value-of select="vr:ruleName" /></td>
                    <td>
                      <xsl:if test="fn:string-length(vr:businessElement) > 0">
                        <xsl:value-of select="vr:businessElement" /><br/><br/>
                      </xsl:if>
                      <xsl:value-of select="vr:element" /></td>
                    <td><xsl:value-of select="vr:definition" /></td>
                    <td>
                      <xsl:value-of select="vr:message" />
                    </td>
                  </tr>
                </xsl:for-each>
              </tbody>
            </table>
          </xsl:when>
          <xsl:otherwise>
            <p>Ошибки не обнаружены.</p>
          </xsl:otherwise>
        </xsl:choose>
        <xsl:choose>
          <xsl:when test="$result/vr:valid">
            <p>Следующие элементы успешно прошли валидацию.</p>
            <table>
              <thead>
                <tr><th>№</th><th>Код</th><th>Расположение</th><th>Бизнес-описание правила</th><th>Результат</th></tr>
              </thead>
              <tbody>
                <xsl:for-each select="$result/vr:valid">
                  <tr>
                    <td><xsl:number /></td>
                    <td><xsl:value-of select="vr:ruleName" /></td>
                    <td>
                      <xsl:if test="fn:string-length(vr:businessElement) > 0">
                        <xsl:value-of select="vr:businessElement" /><br/><br/>
                      </xsl:if>
                      <xsl:value-of select="vr:element" /></td>
                    <td><xsl:value-of select="vr:definition" /></td>
                    <td>
                      <xsl:value-of select="vr:message" />
                    </td>
                  </tr>
                </xsl:for-each>
              </tbody>
            </table>
          </xsl:when>
          <xsl:otherwise>
            <p>Элементы, успешно прошедшие валидацию, отсутствуют.</p>
          </xsl:otherwise>
        </xsl:choose>
      </body>
    </html>
  </xsl:template>

</xsl:stylesheet>

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fn="http://www.w3.org/2005/xpath-functions"
                xmlns:vr="urn:iso20022:validation:result"
                xmlns="http://www.w3.org/1999/xhtml"
                exclude-result-prefixes="#all">
  
  <xsl:output encoding="UTF-8" />
  
  <xsl:template match="/">
    <xsl:variable name="errors">
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
          <xsl:when test="$errors/vr:error">
            <table>
              <thead>
                <tr><th>№</th><th>Элемент</th><th>Ошибка</th></tr>
              </thead>
              <tbody>
                <xsl:for-each select="$errors/vr:error">
                  <tr>
                    <td><xsl:number /></td>
                    <td><xsl:value-of select="vr:element" /></td>
                    <td><xsl:text>[</xsl:text><xsl:value-of select="vr:ruleName" /><xsl:text>]</xsl:text><br/><br/><xsl:value-of select="vr:message" /></td>
                  </tr>
                </xsl:for-each>
              </tbody>
            </table>
          </xsl:when>
          <xsl:otherwise>
            <p>Ошибки не обнаружены.</p>
          </xsl:otherwise>
        </xsl:choose>
      </body>
    </html>
  </xsl:template>

</xsl:stylesheet>

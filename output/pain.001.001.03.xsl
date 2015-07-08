<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:result="urn:iso20022:validation:result" exclude-result-prefixes="#all" xpath-default-namespace="urn:iso:std:iso:20022:tech:xsd:pain.001.001.03" version="2.0">
  <xsl:import href="iso20022-validation.xsl"/>
  <xsl:template match="/ Document / CstmrCdtTrfInitn / GrpHdr / InitgPty / Id / OrgId | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / Cdtr / Id / OrgId | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / RmtInf / Strd / Invcee / Id / OrgId | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / RmtInf / Strd / Invcr / Id / OrgId | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / UltmtCdtr / Id / OrgId | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / UltmtDbtr / Id / OrgId | / Document / CstmrCdtTrfInitn / PmtInf / Dbtr / Id / OrgId | / Document / CstmrCdtTrfInitn / PmtInf / UltmtDbtr / Id / OrgId">
    <xsl:if test="fn:not(fn:count( BICOrBEI ) = 0 and fn:count( Othr ) = 1 or fn:count( BICOrBEI ) = 1 and fn:count( Othr ) = 0)">
      <result:error>
        <result:ruleName>IdRule2</result:ruleName>
        <result:element>
          <xsl:call-template name="genPath"/>
        </result:element>
        <result:message>(BICOrBEI-&gt;size() = 0 and Other-&gt;size() = 1) or&#13;
(BICOrBEI-&gt;size() = 1 and Other-&gt;size() = 0)</result:message>
      </result:error>
    </xsl:if>
    <xsl:if test="fn:not((fn:not(fn:count( BICOrBEI ) = 1) or fn:count( Othr ) = 0) and (fn:not(fn:count( Othr ) = 1) or fn:count( BICOrBEI ) = 0))">
      <result:error>
        <result:ruleName>IdRule3</result:ruleName>
        <result:element>
          <xsl:call-template name="genPath"/>
        </result:element>
        <result:message>(BICOrBEI-&gt;size() = 1 implies Other-&gt;size() = 0) and&#13;
(Other-&gt;size() = 1 implies BICOrBEI-&gt;size() = 0)</result:message>
      </result:error>
    </xsl:if>
    <xsl:if test="fn:not(fn:count( BICOrBEI ) + fn:count( Othr ) = 1)">
      <result:error>
        <result:ruleName>IdRule1</result:ruleName>
        <result:element>
          <xsl:call-template name="genPath"/>
        </result:element>
        <result:message>BICOrBEI-&gt;size() + Other-&gt;size() = 1</result:message>
      </result:error>
    </xsl:if>
    <xsl:apply-templates/>
  </xsl:template>
  <xsl:template match="/ Document / CstmrCdtTrfInitn / GrpHdr / InitgPty | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / Cdtr | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / RmtInf / Strd / Invcee | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / RmtInf / Strd / Invcr | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / UltmtCdtr | / Document / CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / UltmtDbtr | / Document / CstmrCdtTrfInitn / PmtInf / Dbtr | / Document / CstmrCdtTrfInitn / PmtInf / UltmtDbtr">
    <xsl:if test="fn:not(fn:string-length( Nm ) &lt;= 70)">
      <result:error>
        <result:ruleName>NameRule</result:ruleName>
        <result:element>
          <xsl:call-template name="genPath"/>
        </result:element>
        <result:message>Name.size() &lt;= 70</result:message>
      </result:error>
    </xsl:if>
    <xsl:apply-templates/>
  </xsl:template>
</xsl:stylesheet>

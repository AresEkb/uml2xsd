<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:result="urn:iso20022:validation:result" exclude-result-prefixes="#all" xpath-default-namespace="urn:iso:std:iso:20022:tech:xsd:pain.002.001.03" version="2.0">
  <xsl:import href="iso20022-validation.xsl"/>
  <xsl:template match="/ Document / CstmrPmtStsRpt / GrpHdr / InitgPty / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlGrpInfAndSts / StsRsnInf / Orgtr / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / StsRsnInf / Orgtr / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / Cdtr / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / CdtrSchmeId / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / Dbtr / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlCdtrSchmeId / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlDbtr / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcee / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcr / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / UltmtCdtr / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / UltmtDbtr / Id / OrgId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / StsRsnInf / Orgtr / Id / OrgId">
    <xsl:if test="fn:not(fn:count( BICOrBEI ) + fn:count( Othr ) = 1)">
      <result:error>
        <result:ruleName>IdRule1</result:ruleName>
        <result:element>
          <xsl:call-template name="genPath"/>
        </result:element>
        <result:message>BICOrBEI-&gt;size() + Other-&gt;size() = 1</result:message>
      </result:error>
    </xsl:if>
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
    <xsl:apply-templates/>
  </xsl:template>
  <xsl:template match="/ Document / CstmrPmtStsRpt / GrpHdr / InitgPty | / Document / CstmrPmtStsRpt / OrgnlGrpInfAndSts / StsRsnInf / Orgtr | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / StsRsnInf / Orgtr | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / Cdtr | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / CdtrSchmeId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / Dbtr | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlCdtrSchmeId | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlDbtr | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcee | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcr | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / UltmtCdtr | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / OrgnlTxRef / UltmtDbtr | / Document / CstmrPmtStsRpt / OrgnlPmtInfAndSts / TxInfAndSts / StsRsnInf / Orgtr">
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

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:result="urn:iso20022:validation:result" exclude-result-prefixes="#all" xpath-default-namespace="urn:iso:std:iso:20022:tech:xsd:pain.002.001.03" version="2.0">
  <xsl:import href="iso20022-validation.xsl"/>
  <xsl:template match="/ Document / InitgPty / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / UltmtCdtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcee / Id / OrgId | / Document / StsRsnInf / Orgtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / UltmtDbtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / CdtrSchmeId / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / Dbtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcr / Id / OrgId | / Document / StsRsnInf / Orgtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / Cdtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlCdtrSchmeId / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlDbtr / Id / OrgId | / Document / TxInfAndSts / StsRsnInf / Orgtr / Id / OrgId">
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
  </xsl:template>
  <xsl:template match="/ Document / TxInfAndSts / OrgnlTxRef / CdtrSchmeId / Id / OrgId | / Document / StsRsnInf / Orgtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / Cdtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlCdtrSchmeId / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / UltmtCdtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / Dbtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / UltmtDbtr / Id / OrgId | / Document / TxInfAndSts / StsRsnInf / Orgtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcee / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlDbtr / Id / OrgId | / Document / StsRsnInf / Orgtr / Id / OrgId | / Document / InitgPty / Id / OrgId">
    <xsl:if test="fn:not(fn:count( BICOrBEI ) + fn:count( Othr ) = 1)">
      <result:error>
        <result:ruleName>IdRule1</result:ruleName>
        <result:element>
          <xsl:call-template name="genPath"/>
        </result:element>
        <result:message>BICOrBEI-&gt;size() + Other-&gt;size() = 1</result:message>
      </result:error>
    </xsl:if>
  </xsl:template>
  <xsl:template match="/ Document / InitgPty / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlCdtrSchmeId / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / UltmtCdtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / CdtrSchmeId / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / Cdtr / Id / OrgId | / Document / StsRsnInf / Orgtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlDbtr / Id / OrgId | / Document / TxInfAndSts / StsRsnInf / Orgtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / UltmtDbtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / Dbtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcr / Id / OrgId | / Document / StsRsnInf / Orgtr / Id / OrgId | / Document / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcee / Id / OrgId">
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
  </xsl:template>
  <xsl:template match="/ Document / TxInfAndSts / OrgnlTxRef / UltmtDbtr | / Document / TxInfAndSts / OrgnlTxRef / CdtrSchmeId | / Document / TxInfAndSts / OrgnlTxRef / Dbtr | / Document / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcee | / Document / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlCdtrSchmeId | / Document / TxInfAndSts / OrgnlTxRef / UltmtCdtr | / Document / InitgPty | / Document / TxInfAndSts / OrgnlTxRef / MndtRltdInf / AmdmntInfDtls / OrgnlDbtr | / Document / TxInfAndSts / OrgnlTxRef / RmtInf / Strd / Invcr | / Document / TxInfAndSts / StsRsnInf / Orgtr | / Document / StsRsnInf / Orgtr | / Document / TxInfAndSts / OrgnlTxRef / Cdtr | / Document / StsRsnInf / Orgtr">
    <xsl:if test="fn:not(fn:string-length( Nm ) &lt;= 70)">
      <result:error>
        <result:ruleName>NameRule</result:ruleName>
        <result:element>
          <xsl:call-template name="genPath"/>
        </result:element>
        <result:message>Name.size() &lt;= 70</result:message>
      </result:error>
    </xsl:if>
  </xsl:template>
</xsl:stylesheet>

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fn="http://www.w3.org/2005/xpath-functions"
                xmlns="urn:iso20022:validation:result"
                xpath-default-namespace="urn:iso:std:iso:20022:tech:xsd:pain.001.001.03"
                exclude-result-prefixes="#all">
  
  <xsl:import href="iso20022-validation.xsl"/>
  
  <xsl:template match="/Document/CstmrCdtTrfInitn/GrpHdr/InitgPty/Id/OrgId | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/Cdtr/Id/OrgId | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/RmtInf/Strd/Invcee/Id/OrgId | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/RmtInf/Strd/Invcr/Id/OrgId | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/UltmtCdtr/Id/OrgId | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/UltmtDbtr/Id/OrgId | /Document/CstmrCdtTrfInitn/PmtInf/Dbtr/Id/OrgId | /Document/CstmrCdtTrfInitn/PmtInf/UltmtDbtr/Id/OrgId">
    <xsl:if test="fn:not(fn:count( BICOrBEI ) + fn:count( Othr ) = 1)">
      <error>
        <ruleName>IdRule1</ruleName>
        <element>
          <xsl:call-template name="genPath"/>
        </element>
        <message>BICOrBEI->size() + Other->size() = 1</message>
      </error>
    </xsl:if>
    <xsl:if test="fn:not(fn:count( BICOrBEI ) = 0 and fn:count( Othr ) = 1 or fn:count( BICOrBEI ) = 1 and fn:count( Othr ) = 0)">
      <error>
        <ruleName>IdRule2</ruleName>
        <element>
          <xsl:call-template name="genPath"/>
        </element>
        <message>(BICOrBEI->size() = 0 and Other->size() = 1) or (BICOrBEI->size() = 1 and Other->size() = 0)</message>
      </error>
    </xsl:if>
    <xsl:if test="fn:not((fn:not(fn:count( BICOrBEI ) = 1) or fn:count( Othr ) = 0) and (fn:not(fn:count( Othr ) = 1) or fn:count( BICOrBEI ) = 0))">
      <error>
        <ruleName>IdRule3</ruleName>
        <element>
          <xsl:call-template name="genPath"/>
        </element>
        <message>(BICOrBEI->size() = 1 implies Other->size() = 0) and (Other->size() = 1 implies BICOrBEI->size() = 0)</message>
      </error>
    </xsl:if>
    <xsl:apply-templates/>
  </xsl:template>
  
  <xsl:template match="/Document/CstmrCdtTrfInitn/GrpHdr/InitgPty | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/Cdtr | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/RmtInf/Strd/Invcee | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/RmtInf/Strd/Invcr | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/UltmtCdtr | /Document/CstmrCdtTrfInitn/PmtInf/CdtTrfTxInf/UltmtDbtr | /Document/CstmrCdtTrfInitn/PmtInf/Dbtr | /Document/CstmrCdtTrfInitn/PmtInf/UltmtDbtr">
    <xsl:if test="fn:not(fn:string-length( Nm ) &lt;= 70)">
      <error>
        <ruleName>NameRule</ruleName>
        <element>
          <xsl:call-template name="genPath"/>
        </element>
        <message>Name.size() &lt;= 70</message>
      </error>
    </xsl:if>
    <xsl:apply-templates/>
  </xsl:template>
  
  <xsl:template match="/Document/CstmrCdtTrfInitn">
    <xsl:if test="fn:not( GrpHdr/CtrlSum = fn:sum( PmtInf/CdtTrfTxInf/Amt/InstdAmt ) )">
      <error>
        <ruleName>ControlSumRule</ruleName>
        <element>
          <xsl:call-template name="genPath"/>
        </element>
        <message>GroupHeader.ControlSum = PaymentInformation.CreditTransferTransactionInformation.Amount.InstructedAmount->sum()</message>
      </error>
    </xsl:if>
    <xsl:if test="fn:not( GrpHdr/NbOfTxs = fn:count( PmtInf/CdtTrfTxInf ) )">
      <error>
        <ruleName>NumberOfTransactionsRule</ruleName>
        <element>
          <xsl:call-template name="genPath"/>
        </element>
        <message>GroupHeader.NumberOfTransactions = PaymentInformation.CreditTransferTransactionInformation->size()</message>
      </error>
    </xsl:if>
    <xsl:apply-templates/>
  </xsl:template>

</xsl:stylesheet>

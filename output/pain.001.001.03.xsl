<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:fn="http://www.w3.org/2005/xpath-functions" exclude-result-prefixes="#all" xpath-default-namespace="urn:iso:std:iso:20022:tech:xsd:pain.001.001.03" version="2.0" id="pain.001.001.03">
  <xsl:import href="iso20022-validation.xsl"/>
  <xsl:variable name="elementNames" select="fn:doc('pain.001.001.03-metadata.xml')" as="item()*"/>
  <xsl:template match="/ Document / CstmrCdtTrfInitn">
    <xsl:call-template name="validate">
      <xsl:with-param name="code">rule2</xsl:with-param>
      <xsl:with-param name="isValid" select="GrpHdr / NbOfTxs = fn:count( PmtInf / CdtTrfTxInf )"/>
      <xsl:with-param name="definition">&lt;NbOfTxs&gt; = количеству секций &lt;CdtTrfTxInf&gt; в сообщении.</xsl:with-param>
      <xsl:with-param name="ocl">GroupHeader.NumberOfTransactions = PaymentInformation.CreditTransferTransactionInformation-&gt;size()</xsl:with-param>
      <xsl:with-param name="error">
        <xsl:text>Ошибка в поле «Общее число поручений в сообщении»: число поручений (</xsl:text>
        <xsl:value-of select="GrpHdr / NbOfTxs"/>
        <xsl:text>) не совпадает с количеством секций CreditTransferTransactionInformation (</xsl:text>
        <xsl:value-of select="fn:count( PmtInf / CdtTrfTxInf )"/>
        <xsl:text>).</xsl:text>
      </xsl:with-param>
      <xsl:with-param name="valid">
        <xsl:text>Значение поля «Общее число поручений в сообщении» (</xsl:text>
        <xsl:value-of select="GrpHdr / NbOfTxs"/>
        <xsl:text>) совпадает с количеством секций CreditTransferTransactionInformation (</xsl:text>
        <xsl:value-of select="fn:count( PmtInf / CdtTrfTxInf )"/>
        <xsl:text>).</xsl:text>
      </xsl:with-param>
    </xsl:call-template>
    <xsl:call-template name="validate">
      <xsl:with-param name="code">rule3</xsl:with-param>
      <xsl:with-param name="isValid" select="GrpHdr / CtrlSum = fn:sum( PmtInf / CdtTrfTxInf / Amt / InstdAmt )"/>
      <xsl:with-param name="definition">&lt;CtrlSum&gt; = сумме значений во всех полях &lt;Amt&gt;/&lt;InstdAmt&gt; в сообщении.</xsl:with-param>
      <xsl:with-param name="ocl">GroupHeader.ControlSum = PaymentInformation.CreditTransferTransactionInformation.Amount.InstructedAmount-&gt;sum()</xsl:with-param>
      <xsl:with-param name="error">
        <xsl:text>Ошибка в поле «Общая сумма поручений в сообщении»: общая сумма поручений (</xsl:text>
        <xsl:value-of select="GrpHdr / CtrlSum"/>
        <xsl:text>) не совпадает с суммой платежей (</xsl:text>
        <xsl:value-of select="fn:sum( PmtInf / CdtTrfTxInf / Amt / InstdAmt )"/>
        <xsl:text>).</xsl:text>
      </xsl:with-param>
      <xsl:with-param name="valid">
        <xsl:text>Значение поля «Общая сумма поручений в сообщении» (</xsl:text>
        <xsl:value-of select="GrpHdr / CtrlSum"/>
        <xsl:text>) совпадает с суммой платежей (</xsl:text>
        <xsl:value-of select="fn:sum( PmtInf / CdtTrfTxInf / Amt / InstdAmt )"/>
        <xsl:text>).</xsl:text>
      </xsl:with-param>
    </xsl:call-template>
    <xsl:for-each select="GrpHdr / InitgPty / Id / OrgId / Othr">
      <xsl:call-template name="validate">
        <xsl:with-param name="code">rule4</xsl:with-param>
        <xsl:with-param name="isValid" select="fn:not( SchmeNm / Cd = 'TXID') or fn:matches( Id , '^(\d{5}|\d{10}|\d{12})$')"/>
        <xsl:with-param name="definition">Если &lt;SchmeNm&gt;/&lt;Cd&gt; ='TXID', то &lt;Id&gt; содержит только цифры, имеет длину 5/10/12.</xsl:with-param>
        <xsl:with-param name="ocl">GroupHeader.InitiatingParty.Identification.OrganisationIdentification.Other-&gt;forAll(&#13;
  SchemeName.Code = 'TXID' implies Identification.matches('^(\\d{5}|\\d{10}|\\d{12})$'))</xsl:with-param>
        <xsl:with-param name="error">
          <xsl:text>Ошибка в поле «Идентификатор (ИНН/КИО)»: длина поля (</xsl:text>
          <xsl:value-of select="fn:string-length( Id )"/>
          <xsl:text>) некорректна.</xsl:text>
        </xsl:with-param>
        <xsl:with-param name="valid">
          <xsl:text>Значение поля «Идентификатор (ИНН/КИО)» (</xsl:text>
          <xsl:value-of select="Id"/>
          <xsl:text>) корректно для &lt;SchmeNm&gt;/&lt;Cd&gt; = '</xsl:text>
          <xsl:value-of select="SchmeNm / Cd"/>
          <xsl:text>'.</xsl:text>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:for-each>
    <xsl:for-each select="PmtInf / Dbtr / Id / OrgId / Othr">
      <xsl:call-template name="validate">
        <xsl:with-param name="code">rule5.1</xsl:with-param>
        <xsl:with-param name="isValid" select="fn:not( SchmeNm / Cd = 'TXID') or fn:matches( Id , '^(\d{5}|\d{10}|\d{12})$')"/>
        <xsl:with-param name="definition">Если &lt;SchmeNm&gt;/&lt;Cd&gt; ='TXID', то &lt;Id&gt; содержит только цифры, имеет длину 5/10/12;
&lt;Id&gt; содержится в справочнике Плательщиков.</xsl:with-param>
        <xsl:with-param name="ocl">PaymentInformation.Debtor.Identification.OrganisationIdentification.Other -&gt;forAll(&#13;
  SchemeName.Code = 'TXID' implies Identification.matches('^(\\d{5}|\\d{10}|\\d{12})$'))</xsl:with-param>
        <xsl:with-param name="error">
          <xsl:text>Ошибка в поле «Идентификатор (ИНН/КИО)»: длина поля (</xsl:text>
          <xsl:value-of select="fn:string-length( Id )"/>
          <xsl:text>) некорректна.</xsl:text>
        </xsl:with-param>
        <xsl:with-param name="valid">
          <xsl:text>Значение поля «Идентификатор (ИНН/КИО)» (</xsl:text>
          <xsl:value-of select="Id"/>
          <xsl:text>) корректно.</xsl:text>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:for-each>
    <xsl:for-each select="PmtInf / CdtTrfTxInf / PmtId">
      <xsl:call-template name="validate">
        <xsl:with-param name="code">rule6</xsl:with-param>
        <xsl:with-param name="isValid" select="fn:matches( EndToEndId , '^\d{1,6}$') and fn:not(fn:matches( EndToEndId , '000$'))"/>
        <xsl:with-param name="definition">&lt;EndToEndId&gt; числовое значение в диапазоне от 1 до 999999, последние три символа != '000'.</xsl:with-param>
        <xsl:with-param name="ocl">PaymentInformation.CreditTransferTransactionInformation.PaymentIdentification-&gt;forAll(&#13;
  EndToEndIdentification.matches('^\\d{1,6}$') and not EndToEndIdentification.matches('000$'))</xsl:with-param>
        <xsl:with-param name="error">
          <xsl:text>Ошибка в поле «Номер платежного поручения»: значение поля (</xsl:text>
          <xsl:value-of select="EndToEndId"/>
          <xsl:text>) некорректно.</xsl:text>
        </xsl:with-param>
        <xsl:with-param name="valid">
          <xsl:text>Значение поля «Номер платежного поручения» (</xsl:text>
          <xsl:value-of select="EndToEndId"/>
          <xsl:text>) корректно.</xsl:text>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:for-each>
    <xsl:for-each select="PmtInf / CdtTrfTxInf / Cdtr">
      <xsl:call-template name="validate">
        <xsl:with-param name="code">rule7.1</xsl:with-param>
        <xsl:with-param name="isValid" select="fn:string-length( Nm ) + fn:string-length( CtctDtls / Nm ) &lt;= 160"/>
        <xsl:with-param name="definition">Сумма длин значений в &lt;Cdtr&gt;/&lt;Nm&gt; и в &lt;Cdtr&gt;/&lt;CtctDtls&gt;/&lt;Nm&gt; не превышает 160 символов;
В &lt;Cdtr&gt; содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.</xsl:with-param>
        <xsl:with-param name="ocl">PaymentInformation.CreditTransferTransactionInformation.Creditor-&gt;forAll(&#13;
  Name.size() + ContactDetails.Name.size() &lt;= 160)</xsl:with-param>
        <xsl:with-param name="error">
          <xsl:text>Ошибка в поле «Наименование получателя»: сумма полей Creditor.Name и Creditor.ContactDetails.Name превышает 160 символов.</xsl:text>
        </xsl:with-param>
        <xsl:with-param name="valid">
          <xsl:text>Сумма полей Creditor.Name и Creditor.ContactDetails.Name (</xsl:text>
          <xsl:value-of select="fn:string-length( Nm ) + fn:string-length( CtctDtls / Nm )"/>
          <xsl:text>) не превышает 160 символов.</xsl:text>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:for-each>
    <xsl:for-each select="PmtInf / CdtTrfTxInf / Cdtr">
      <xsl:call-template name="validate">
        <xsl:with-param name="code">rule7.2</xsl:with-param>
        <xsl:with-param name="isValid" select="fn:matches( Nm , '^[ -}Ёё№А-Яа-я]+$')"/>
        <xsl:with-param name="definition">Сумма длин значений в &lt;Cdtr&gt;/&lt;Nm&gt; и в &lt;Cdtr&gt;/&lt;CtctDtls&gt;/&lt;Nm&gt; не превышает 160 символов;
В &lt;Cdtr&gt; содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.</xsl:with-param>
        <xsl:with-param name="ocl">PaymentInformation.CreditTransferTransactionInformation.Creditor-&gt;forAll(&#13;
  Name.matches('^[ -}Ёё№А-Яа-я]+$'))</xsl:with-param>
        <xsl:with-param name="error">
          <xsl:text>Ошибка в поле «Наименование получателя»: поле содержит недопустимые символы (</xsl:text>
          <xsl:value-of select="fn:distinct-values(fn:string-to-codepoints(fn:replace( Nm , '[ -}Ёё№А-Яа-я]', '')))"/>
          <xsl:text>).</xsl:text>
        </xsl:with-param>
        <xsl:with-param name="valid">
          <xsl:text>Значение поля «Наименование получателя» (</xsl:text>
          <xsl:value-of select="Nm"/>
          <xsl:text>) корректно.</xsl:text>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:for-each>
    <xsl:for-each select="PmtInf / CdtTrfTxInf / Cdtr / CtctDtls">
      <xsl:call-template name="validate">
        <xsl:with-param name="code">rule7.3</xsl:with-param>
        <xsl:with-param name="isValid" select="fn:matches( Nm , '^[ -}Ёё№А-Яа-я]+$')"/>
        <xsl:with-param name="definition">Сумма длин значений в &lt;Cdtr&gt;/&lt;Nm&gt; и в &lt;Cdtr&gt;/&lt;CtctDtls&gt;/&lt;Nm&gt; не превышает 160 символов;
В &lt;Cdtr&gt; содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.</xsl:with-param>
        <xsl:with-param name="ocl">PaymentInformation.CreditTransferTransactionInformation.Creditor.ContactDetails-&gt;forAll(&#13;
  Name.matches('^[ -}Ёё№А-Яа-я]+$'))</xsl:with-param>
        <xsl:with-param name="error">
          <xsl:text>Ошибка в поле «Наименование получателя»: поле содержит недопустимые символы (</xsl:text>
          <xsl:value-of select="fn:distinct-values(fn:string-to-codepoints(fn:replace( Nm , '[ -}Ёё№А-Яа-я]', '')))"/>
          <xsl:text>).</xsl:text>
        </xsl:with-param>
        <xsl:with-param name="valid">
          <xsl:text>Значение поля «Наименование получателя» (</xsl:text>
          <xsl:value-of select="Nm"/>
          <xsl:text>) корректно.</xsl:text>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:for-each>
    <xsl:for-each select="PmtInf / CdtTrfTxInf">
      <xsl:call-template name="validate">
        <xsl:with-param name="code">rule8</xsl:with-param>
        <xsl:with-param name="isValid" select="fn:not( PmtTpInf / CtgyPurp [ Cd = 'TAXS'] and Tax / Cdtr [fn:not(fn:not( TaxTp ) or fn:matches( TaxTp , '^(0|\d{9})$'))])"/>
        <xsl:with-param name="definition">Если &lt;CdtTrfTxInf&gt;\&lt;PmtTpInf&gt;\&lt;CtgyPurp&gt;\&lt;Cd&gt; равно "TAXS", &lt;TaxTp&gt;= '9 цифр' | '0' | не указано.</xsl:with-param>
        <xsl:with-param name="ocl">PaymentInformation.CreditTransferTransactionInformation-&gt;forAll(&#13;
  PaymentTypeInformation.CategoryPurpose-&gt;exists(Code = 'TAXS')&#13;
  implies&#13;
  Tax.Creditor-&gt;forAll(TaxType-&gt;isEmpty() or TaxType.matches('^(0|\\d{9})$')))</xsl:with-param>
        <xsl:with-param name="error">
          <xsl:text>Ошибка в поле «КПП получателя»: значение поля (</xsl:text>
          <xsl:value-of select="Tax / Cdtr / TaxTp"/>
          <xsl:text>) недопустимо.</xsl:text>
        </xsl:with-param>
        <xsl:with-param name="valid">
          <xsl:text>Значение поля «КПП получателя» (</xsl:text>
          <xsl:value-of select="Tax / Cdtr / TaxTp"/>
          <xsl:text>) корректно.</xsl:text>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:for-each>
    <xsl:for-each select="PmtInf / CdtTrfTxInf / RmtInf">
      <xsl:call-template name="validate">
        <xsl:with-param name="code">rule9.1</xsl:with-param>
        <xsl:with-param name="isValid" select="fn:sum( Ustrd /fn:string-length(.)) &lt;= 210"/>
        <xsl:with-param name="definition">Сумма длин значений всех элементов &lt;Ustrd&gt; не превышает 210 символов;
В каждом элементе &lt;Ustrd&gt; содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.</xsl:with-param>
        <xsl:with-param name="ocl">PaymentInformation.CreditTransferTransactionInformation.RemittanceInformation-&gt;forAll(Unstructured.size()-&gt;sum() &lt;= 210)</xsl:with-param>
        <xsl:with-param name="error">
          <xsl:text>Ошибка в поле «Назначение платежа»: сумма длин значений (</xsl:text>
          <xsl:value-of select="fn:sum( Ustrd /fn:string-length(.))"/>
          <xsl:text>) превышает 210 символов.</xsl:text>
        </xsl:with-param>
        <xsl:with-param name="valid">
          <xsl:text>Сумма для значений поля «Назначение платежа» (</xsl:text>
          <xsl:value-of select="fn:sum( Ustrd /fn:string-length(.))"/>
          <xsl:text>) не превышает 210 символов.</xsl:text>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:for-each>
    <xsl:for-each select="PmtInf / CdtTrfTxInf / RmtInf / Ustrd">
      <xsl:call-template name="validate">
        <xsl:with-param name="code">rule9.2</xsl:with-param>
        <xsl:with-param name="isValid" select="fn:matches(., '^[ -}Ёё№А-Яа-я]+$')"/>
        <xsl:with-param name="definition">Сумма длин значений всех элементов &lt;Ustrd&gt; не превышает 210 символов;
В каждом элементе &lt;Ustrd&gt; содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.</xsl:with-param>
        <xsl:with-param name="ocl">PaymentInformation.CreditTransferTransactionInformation.RemittanceInformation.Unstructured-&gt;forAll(matches('^[ -}Ёё№А-Яа-я]+$'))</xsl:with-param>
        <xsl:with-param name="error">
          <xsl:text>Ошибка в поле «Назначение платежа»: поле содержит недопустимые символы (</xsl:text>
          <xsl:value-of select="fn:distinct-values(fn:string-to-codepoints(fn:replace(., '[ -}Ёё№А-Яа-я]', '')))"/>
          <xsl:text>).</xsl:text>
        </xsl:with-param>
        <xsl:with-param name="valid">
          <xsl:text>Значение поля «Назначение платежа» (</xsl:text>
          <xsl:value-of select="."/>
          <xsl:text>) корректно.</xsl:text>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:for-each>
    <xsl:apply-templates/>
  </xsl:template>
</xsl:stylesheet>

package com.centreit.repiso.ocl.validator.validation;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.w3c.dom.Node;
import com.centreit.repiso.ocl.validator.validation.BaseValidator;
import com.centreit.repiso.ocl.validator.validation.Helper;
import com.centreit.repiso.ocl.validator.validation.Result;

@Generated("uml2xsd")
public class CustomerCreditTransferInitiationV03 extends BaseValidator {
    private Node root;

    public void init(String message) {
        root = Helper.parse(message);
    }

    @RuleMetadata(id = "rule1", description = "Идентификатор сообщения должен быть уникальным.", ocl = "GroupHeader.MessageIdentification->notEmpty()\nimplies\nnot CustomerCreditTransferInitiationV03.allInstances()->exists(\nGroupHeader.MessageIdentification = self.GroupHeader.MessageIdentification)")
    public void checkRule1(List<Result> results) {
        throw new UnsupportedOperationException();
    }

    @RuleMetadata(id = "rule2", description = "<NbOfTxs> = количеству секций <CdtTrfTxInf> в сообщении.", ocl = "GroupHeader.NumberOfTransactions = PaymentInformation.CreditTransferTransactionInformation->size()")
    public void checkRule2(List<Result> results) {
        results.add(Helper.validate(root, "GrpHdr / NbOfTxs = fn:count( PmtInf / CdtTrfTxInf )",
                Helper.format(root,
                        "Ошибка в поле «Общее число поручений в сообщении»: число поручений (%s) не совпадает с количеством секций CreditTransferTransactionInformation (%s).",
                        "GrpHdr / NbOfTxs", "fn:count( PmtInf / CdtTrfTxInf )"),
                Helper.format(root,
                        "Значение поля «Общее число поручений в сообщении» (%s) совпадает с количеством секций CreditTransferTransactionInformation (%s).",
                        "GrpHdr / NbOfTxs", "fn:count( PmtInf / CdtTrfTxInf )")));
    }

    @RuleMetadata(id = "rule3", description = "<CtrlSum> = сумме значений во всех полях <Amt>/<InstdAmt> в сообщении.", ocl = "GroupHeader.ControlSum = PaymentInformation.CreditTransferTransactionInformation.Amount.InstructedAmount->sum()")
    public void checkRule3(List<Result> results) {
        results.add(Helper.validate(root, "GrpHdr / CtrlSum = fn:sum( PmtInf / CdtTrfTxInf / Amt / InstdAmt )",
                Helper.format(root,
                        "Ошибка в поле «Общая сумма поручений в сообщении»: общая сумма поручений (%s) не совпадает с суммой платежей (%s).",
                        "GrpHdr / CtrlSum", "fn:sum( PmtInf / CdtTrfTxInf / Amt / InstdAmt )"),
                Helper.format(root,
                        "Значение поля «Общая сумма поручений в сообщении» (%s) совпадает с суммой платежей (%s).",
                        "GrpHdr / CtrlSum", "fn:sum( PmtInf / CdtTrfTxInf / Amt / InstdAmt )")));
    }

    @RuleMetadata(id = "rule4", description = "Если <SchmeNm>/<Cd> =\'TXID\', то <Id> содержит только цифры, имеет длину 5/10/12.", ocl = "GroupHeader.InitiatingParty.Identification.OrganisationIdentification.Other->forAll(\n  SchemeName.Code = \'TXID\' implies Identification.matches(\'^(\\\\d{5}|\\\\d{10}|\\\\d{12})$\'))")
    public void checkRule4(List<Result> results) {
        for (Node context : Helper.iterate(root, "GrpHdr / InitgPty / Id / OrgId / Othr")) {
            results.add(Helper.validate(context,
                    "fn:not( current ()/ SchmeNm / Cd = \'TXID\') or fn:matches( current ()/ Id , \'^(\\d{5}|\\d{10}|\\d{12})$\')",
                    Helper.format(context, "Ошибка в поле «Идентификатор (ИНН/КИО)»: длина поля (%s) некорректна.",
                            "fn:string-length( Id )"),
                    Helper.format(context,
                            "Значение поля «Идентификатор (ИНН/КИО)» (%s) корректно для <SchmeNm>/<Cd> = \'%s\'.", "Id",
                            "SchmeNm / Cd")));
        }
    }

    @RuleMetadata(id = "rule5.1", description = "Если <SchmeNm>/<Cd> =\'TXID\', то <Id> содержит только цифры, имеет длину 5/10/12;\n<Id> содержится в справочнике Плательщиков.", ocl = "PaymentInformation.Debtor.Identification.OrganisationIdentification.Other ->forAll(\n  SchemeName.Code = \'TXID\' implies Identification.matches(\'^(\\\\d{5}|\\\\d{10}|\\\\d{12})$\'))")
    public void checkRule5_1(List<Result> results) {
        for (Node context : Helper.iterate(root, "PmtInf / Dbtr / Id / OrgId / Othr")) {
            results.add(Helper.validate(context,
                    "fn:not( current ()/ SchmeNm / Cd = \'TXID\') or fn:matches( current ()/ Id , \'^(\\d{5}|\\d{10}|\\d{12})$\')",
                    Helper.format(context, "Ошибка в поле «Идентификатор (ИНН/КИО)»: длина поля (%s) некорректна.",
                            "fn:string-length( Id )"),
                    Helper.format(context, "Значение поля «Идентификатор (ИНН/КИО)» (%s) корректно.", "Id")));
        }
    }

    @RuleMetadata(id = "rule5.2", description = "Если <SchmeNm>/<Cd> =\'TXID\', то <Id> содержит только цифры, имеет длину 5/10/12;\n<Id> содержится в справочнике Плательщиков.", ocl = "PaymentInformation.Debtor.Identification.OrganisationIdentification.Other->forAll(\n  othr | othr.SchemeName = \'TXID\' and othr.Identification->notEmpty()\n  implies\n  Payer.allInstances()->exists(Identification = othr.Identification))")
    public void checkRule5_2(List<Result> results) {
        throw new UnsupportedOperationException();
    }

    @RuleMetadata(id = "rule6", description = "<EndToEndId> числовое значение в диапазоне от 1 до 999999, последние три символа != \'000\'.", ocl = "PaymentInformation.CreditTransferTransactionInformation.PaymentIdentification->forAll(\n  EndToEndIdentification.matches(\'^\\\\d{1,6}$\') and not EndToEndIdentification.matches(\'000$\'))")
    public void checkRule6(List<Result> results) {
        for (Node context : Helper.iterate(root, "PmtInf / CdtTrfTxInf / PmtId")) {
            results.add(Helper.validate(context,
                    "fn:matches( current ()/ EndToEndId , \'^\\d{1,6}$\') and fn:not(fn:matches( current ()/ EndToEndId , \'000$\'))",
                    Helper.format(context,
                            "Ошибка в поле «Номер платежного поручения»: значение поля (%s) некорректно.",
                            "EndToEndId"),
                    Helper.format(context, "Значение поля «Номер платежного поручения» (%s) корректно.",
                            "EndToEndId")));
        }
    }

    @RuleMetadata(id = "rule7.1", description = "Сумма длин значений в <Cdtr>/<Nm> и в <Cdtr>/<CtctDtls>/<Nm> не превышает 160 символов;\nВ <Cdtr> содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.", ocl = "PaymentInformation.CreditTransferTransactionInformation.Creditor->forAll(\n  Name.size() + ContactDetails.Name.size() <= 160)")
    public void checkRule7_1(List<Result> results) {
        for (Node context : Helper.iterate(root, "PmtInf / CdtTrfTxInf / Cdtr")) {
            results.add(Helper.validate(context,
                    "fn:string-length( current ()/ Nm ) + fn:string-length( current ()/ CtctDtls / Nm ) <= 160",
                    Helper.format(context,
                            "Ошибка в поле «Наименование получателя»: сумма полей Creditor.Name и Creditor.ContactDetails.Name превышает 160 символов."),
                    Helper.format(context,
                            "Сумма полей Creditor.Name и Creditor.ContactDetails.Name (%s) не превышает 160 символов.",
                            "fn:string-length( Nm ) + fn:string-length( CtctDtls / Nm )")));
        }
    }

    @RuleMetadata(id = "rule7.2", description = "Сумма длин значений в <Cdtr>/<Nm> и в <Cdtr>/<CtctDtls>/<Nm> не превышает 160 символов;\nВ <Cdtr> содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.", ocl = "PaymentInformation.CreditTransferTransactionInformation.Creditor->forAll(\n  Name.matches(\'^[ -}Ёё№А-Яа-я]+$\'))")
    public void checkRule7_2(List<Result> results) {
        for (Node context : Helper.iterate(root, "PmtInf / CdtTrfTxInf / Cdtr")) {
            results.add(Helper.validate(context, "fn:matches( current ()/ Nm , \'^[ -}Ёё№А-Яа-я]+$\')",
                    Helper.format(context,
                            "Ошибка в поле «Наименование получателя»: поле содержит недопустимые символы (%s).",
                            "fn:distinct-values(fn:string-to-codepoints(fn:replace( Nm , \'[ -}Ёё№А-Яа-я]\', \'\')))"),
                    Helper.format(context, "Значение поля «Наименование получателя» (%s) корректно.", "Nm")));
        }
    }

    @RuleMetadata(id = "rule7.3", description = "Сумма длин значений в <Cdtr>/<Nm> и в <Cdtr>/<CtctDtls>/<Nm> не превышает 160 символов;\nВ <Cdtr> содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.", ocl = "PaymentInformation.CreditTransferTransactionInformation.Creditor.ContactDetails->forAll(\n  Name.matches(\'^[ -}Ёё№А-Яа-я]+$\'))")
    public void checkRule7_3(List<Result> results) {
        for (Node context : Helper.iterate(root, "PmtInf / CdtTrfTxInf / Cdtr / CtctDtls")) {
            results.add(Helper.validate(context, "fn:matches( current ()/ Nm , \'^[ -}Ёё№А-Яа-я]+$\')",
                    Helper.format(context,
                            "Ошибка в поле «Наименование получателя»: поле содержит недопустимые символы (%s).",
                            "fn:distinct-values(fn:string-to-codepoints(fn:replace( Nm , \'[ -}Ёё№А-Яа-я]\', \'\')))"),
                    Helper.format(context, "Значение поля «Наименование получателя» (%s) корректно.", "Nm")));
        }
    }

    @RuleMetadata(id = "rule8", description = "Если <CdtTrfTxInf>\\<PmtTpInf>\\<CtgyPurp>\\<Cd> равно \"TAXS\", <TaxTp>= \'9 цифр\' | \'0\' | не указано.", ocl = "PaymentInformation.CreditTransferTransactionInformation->forAll(\n  PaymentTypeInformation.CategoryPurpose->exists(Code = \'TAXS\')\n  implies\n  Tax.Creditor->forAll(TaxType->isEmpty() or TaxType.matches(\'^(0|\\\\d{9})$\')))")
    public void checkRule8(List<Result> results) {
        for (Node context : Helper.iterate(root, "PmtInf / CdtTrfTxInf")) {
            results.add(Helper.validate(context,
                    "fn:not( current ()/ PmtTpInf / CtgyPurp [ Cd = \'TAXS\'] and current ()/ Tax / Cdtr [fn:not(fn:not( TaxTp ) or fn:matches( TaxTp , \'^(0|\\d{9})$\'))])",
                    Helper.format(context, "Ошибка в поле «КПП получателя»: значение поля (%s) недопустимо.",
                            "Tax / Cdtr / TaxTp"),
                    Helper.format(context, "Значение поля «КПП получателя» (%s) корректно.", "Tax / Cdtr / TaxTp")));
        }
    }

    @RuleMetadata(id = "rule9.1", description = "Сумма длин значений всех элементов <Ustrd> не превышает 210 символов;\nВ каждом элементе <Ustrd> содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.", ocl = "PaymentInformation.CreditTransferTransactionInformation.RemittanceInformation->forAll(Unstructured.size()->sum() <= 210)")
    public void checkRule9_1(List<Result> results) {
        for (Node context : Helper.iterate(root, "PmtInf / CdtTrfTxInf / RmtInf")) {
            results.add(Helper.validate(context, "fn:sum( current ()/ Ustrd /fn:string-length(.)) <= 210",
                    Helper.format(context,
                            "Ошибка в поле «Назначение платежа»: сумма длин значений (%s) превышает 210 символов.",
                            "fn:sum( Ustrd /fn:string-length(.))"),
                    Helper.format(context,
                            "Сумма для значений поля «Назначение платежа» (%s) не превышает 210 символов.",
                            "fn:sum( Ustrd /fn:string-length(.))")));
        }
    }

    @RuleMetadata(id = "rule9.2", description = "Сумма длин значений всех элементов <Ustrd> не превышает 210 символов;\nВ каждом элементе <Ustrd> содержатся только символы с ASCII кодами из списка: 32-125, 168, 184, 185, 192-255.", ocl = "PaymentInformation.CreditTransferTransactionInformation.RemittanceInformation.Unstructured->forAll(matches(\'^[ -}Ёё№А-Яа-я]+$\'))")
    public void checkRule9_2(List<Result> results) {
        for (Node context : Helper.iterate(root, "PmtInf / CdtTrfTxInf / RmtInf / Ustrd")) {
            results.add(Helper.validate(context, "fn:matches( current (), \'^[ -}Ёё№А-Яа-я]+$\')",
                    Helper.format(context,
                            "Ошибка в поле «Назначение платежа»: поле содержит недопустимые символы (%s).",
                            "fn:distinct-values(fn:string-to-codepoints(fn:replace(., \'[ -}Ёё№А-Яа-я]\', \'\')))"),
                    Helper.format(context, "Значение поля «Назначение платежа» (%s) корректно.", ".")));
        }
    }
}

package com.centreit.repiso.ocl.validator.validation;

import org.w3c.dom.Document;
import javax.annotation.Generated;
import java.util.Arrays;
import com.centreit.repiso.ocl.validator.validation.BaseValidator;
import com.centreit.repiso.ocl.validator.validation.Helper;

@Generated("uml2xsd")
public class CustomerCreditTransferInitiationV03 extends BaseValidator {
	private Node root;

	public void init(String message) {
		this.root = Helper.parse(message, "/ Document / CstmrCdtTrfInitn");
	}

	@RuleMetadata(ocl = "GroupHeader.MessageIdentification->notEmpty()\r\nimplies\r\nnot CustomerCreditTransferInitiationV03.allInstances()->exists(\r\nGroupHeader.MessageIdentification = self.GroupHeader.MessageIdentification)")
	public boolean checkRule1() {
		return true;
	}

	@RuleMetadata(ocl = "GroupHeader.NumberOfTransactions = PaymentInformation.CreditTransferTransactionInformation->size()")
	public boolean checkRule2() {
		return Helper.check(root,
				"/ CstmrCdtTrfInitn / GrpHdr / NbOfTxs = count (/ CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf )");
	}

	public List<Result> checkRule3() {
		List<Result> result = new ArrayList<Result>();
		Node context = root;
		result.add(Helper.validate(
				context,
				"rule3",
				"GrpHdr / CtrlSum = fn:sum( PmtInf / CdtTrfTxInf / Amt / InstdAmt )",
				"<CtrlSum> = сумме значений во всех полях <Amt>/<InstdAmt> в сообщении.",
				"GroupHeader.ControlSum = PaymentInformation.CreditTransferTransactionInformation.Amount.InstructedAmount->sum()",
				String.format("Ошибка в поле «Общая сумма поручений в сообщении»: общая сумма поручений (%s) не совпадает с суммой платежей (%s).", Helper.evaluate(context, "GrpHdr / CtrlSum"), Helper.evaluate(context, "fn:sum( PmtInf / CdtTrfTxInf / Amt / InstdAmt )")),
				String.format("Значение поля «Общая сумма поручений в сообщении» (%s) совпадает с суммой платежей (%s).", Helper.evaluate(context, "GrpHdr / CtrlSum"), Helper.evaluate(context, "fn:sum( PmtInf / CdtTrfTxInf / Amt / InstdAmt )"))));
		return result;
	}

	public List<Result> checkRule4() {
		List<Result> result = new ArrayList<Result>();
		for (Node context : Helper.iterate(root, "GrpHdr / InitgPty / Id / OrgId / Othr")) {
			result.add(Helper.validate(
					context,
					"rule4",
					"fn:not( SchmeNm / Cd = 'TXID') or fn:matches( Id , '^(\d{5}|\d{10}|\d{12})$')",
					"Если <SchmeNm>/<Cd> ='TXID', то <Id> содержит только цифры, имеет длину 5/10/12.",
					"GroupHeader.InitiatingParty.Identification.OrganisationIdentification.Other->forAll(\nSchemeName.Code = 'TXID' implies Identification.matches('^(\\d{5}|\\d{10}|\\d{12})$'))",
					String.format("Ошибка в поле «Идентификатор (ИНН/КИО)»: длина поля (%s) некорректна.", Helper.evaluate(context, "fn:string-length( Id )")),
					String.format("Значение поля «Идентификатор (ИНН/КИО)» (%s) корректно для <SchmeNm>/<Cd> = '%s'.", Helper.evaluate(context, "Id"), Helper.evaluate(context, "SchmeNm / Cd"))));
		}
		return result;
	}

	@RuleMetadata(ocl = "PaymentInformation.Debtor.Identification.OrganisationIdentification.Other ->forAll(\r\n  SchemeName.Code = \'TXID\' implies Identification.matches(\'^(\\\\d{5}|\\\\d{10}|\\\\d{12})$\'))")
	public boolean checkRule5_1() {
		return Helper.check(root,
				"not (/ CstmrCdtTrfInitn / PmtInf / Dbtr / Id / OrgId / Othr [ not ( not ( SchmeNm / Cd = \'TXID\') or matches ( Id , \'^(\\d{5}|\\d{10}|\\d{12})$\'))])");
	}

	@RuleMetadata(ocl = "PaymentInformation.Debtor.Identification.OrganisationIdentification.Other->forAll(\r\n  othr | othr.SchemeName = \'TXID\' and othr.Identification->notEmpty()\r\n  implies\r\n  Payer.allInstances()->exists(Identification = othr.Identification))")
	public boolean checkRule5_2() {
		return true;
	}

	@RuleMetadata(ocl = "PaymentInformation.CreditTransferTransactionInformation.PaymentIdentification->forAll(\r\n  EndToEndIdentification.matches(\'^\\\\d{1,6}$\') and not EndToEndIdentification.matches(\'000$\'))")
	public boolean checkRule6() {
		return Helper.check(root,
				"not (/ CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / PmtId [ not ( matches ( EndToEndId , \'^\\d{1,6}$\') and not ( matches ( EndToEndId , \'000$\')))])");
	}

	@RuleMetadata(ocl = "PaymentInformation.CreditTransferTransactionInformation.Creditor->forAll(\r\n  Name.size() + ContactDetails.Name.size() <= 160)")
	public boolean checkRule7_1() {
		return Helper.check(root,
				"not (/ CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / Cdtr [ not ( string-length ( Nm ) + string-length ( CtctDtls / Nm ) <= 160)])");
	}

	@RuleMetadata(ocl = "PaymentInformation.CreditTransferTransactionInformation.Creditor->forAll(\r\n  Name.matches(\'^[ -}Ёё№А-Яа-я]+$\'))")
	public boolean checkRule7_2() {
		return Helper.check(root,
				"not (/ CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / Cdtr [ not ( matches ( Nm , \'^[ -}Ёё№А-Яа-я]+$\'))])");
	}

	@RuleMetadata(ocl = "PaymentInformation.CreditTransferTransactionInformation.Creditor.ContactDetails->forAll(\r\n  Name.matches(\'^[ -}Ёё№А-Яа-я]+$\'))")
	public boolean checkRule7_3() {
		return Helper.check(root,
				"not (/ CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / Cdtr / CtctDtls [ not ( matches ( Nm , \'^[ -}Ёё№А-Яа-я]+$\'))])");
	}

	@RuleMetadata(ocl = "PaymentInformation.CreditTransferTransactionInformation->forAll(\r\n  PaymentTypeInformation.CategoryPurpose->exists(Code = \'TAXS\')\r\n  implies\r\n  Tax.Creditor->forAll(TaxType->isEmpty() or TaxType.matches(\'^(0|\\\\d{9})$\')))")
	public boolean checkRule8() {
		return Helper.check(root,
				"not (/ CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf [ PmtTpInf / CtgyPurp [ Cd = \'TAXS\'] and Tax / Cdtr [ not ( not ( TaxTp ) or matches ( TaxTp , \'^(0|\\d{9})$\'))]])");
	}

	@RuleMetadata(ocl = "PaymentInformation.CreditTransferTransactionInformation.RemittanceInformation->forAll(Unstructured.size()->sum() <= 210)")
	public boolean checkRule9_1() {
		return Helper.check(root,
				"not (/ CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / RmtInf [ not ( sum ( Ustrd / string-length (.)) <= 210)])");
	}

	@RuleMetadata(ocl = "PaymentInformation.CreditTransferTransactionInformation.RemittanceInformation.Unstructured->forAll(matches(\'^[ -}Ёё№А-Яа-я]+$\'))")
	public boolean checkRule9_2() {
		return Helper.check(root,
				"not (/ CstmrCdtTrfInitn / PmtInf / CdtTrfTxInf / RmtInf / Ustrd [ not ( matches (., \'^[ -}Ёё№А-Яа-я]+$\'))])");
	}
}

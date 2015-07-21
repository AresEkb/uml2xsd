package com.centreit.repiso.ocl.helper;

import org.w3c.dom.Document;
import javax.annotation.Generated;
import java.util.Arrays;


@Generated("uml2xsd")public class MeetingInstruction extends BaseValidator {
	private Document message;
	public MeetingInstruction(String message) {
		this.message = Helper.parse(message,"WINDOWS-1251");
	}
	@RuleMetadata(description = "Реквизит /AppHdr/BizSvc должен иметь значение CA041",ocl = "ApplicationHeader.BusinessService = \'CA041\'")public boolean checkBusinessServiceRule() {
		return Helper.check(message,"/ MeetingInstruction / AppHdr / BizSvc = \'CA041\'");
	}
	@RuleMetadata(description = "Реквизит /AppHdr/MsgDefIdr должен иметь значение seev.004.001.04",ocl = "ApplicationHeader.MessageDefinitionIdentifier = \'seev.004.001.04\'")public boolean checkIdRule() {
		return Helper.check(message,"/ MeetingInstruction / AppHdr / MsgDefIdr = \'seev.004.001.04\'");
	}
	@RuleMetadata(description = "Реквизит /Document/MtgInstr/Id должен быть уникальным для каждого сообщения",ocl = "-- MeetingInstruction.allInstances()->isUnique(Document.MeetingInstruction.Identification.Identification)\r\nDocument.MeetingInstruction.Identification->notEmpty()\r\nimplies\r\nnot MeetingInstruction.allInstances()->exists(\r\n  Document.MeetingInstruction.Identification.Identification = self.Document.MeetingInstruction.Identification.Identification)")public boolean checkR003UniqueId() {
		return!Helper.check(message,"boolean (/ MeetingInstruction / Document / MtgInstr / Id )")||!Helper.exists(message,"/ MeetingInstruction [ Document / MtgInstr / Id / Id = :param1]",Arrays.asList(new XPathParam("param1","/ MeetingInstruction / Document / MtgInstr / Id / Id",String.class)));
	}
	@RuleMetadata(description = "Если в сообщении заполнен реквизит /Document/MtgInstr/MtgRef/MtgId, то он должен ссылаться на существующее собрание",ocl = "Document.MeetingInstruction.MeetingReference.MeetingIdentification->notEmpty()\r\nimplies\r\nMeetingInstruction.allInstances()->exists(\r\n  Document.MeetingInstruction.Identification.Identification = self.Document.MeetingInstruction.MeetingReference.MeetingIdentification)")public boolean checkR005ExistingOriginalMtgInstrRule() {
		return!Helper.check(message,"boolean (/ MeetingInstruction / Document / MtgInstr / MtgRef / MtgId )")||Helper.exists(message,"/ MeetingInstruction [ Document / MtgInstr / Id / Id = :param2]",Arrays.asList(new XPathParam("param2","/ MeetingInstruction / Document / MtgInstr / MtgRef / MtgId",String.class)));
	}
	@RuleMetadata(description = "Реквизит /Document/MtgInstr/Instr/InstrId должен быть уникальным в рамках одного сообщения",ocl = "Document.MeetingInstruction->isUnique(Instruction.InstructionIdentification)")public boolean checkR018UniqueInstructionIdRule() {
		return Helper.check(message,"/ MeetingInstruction / Document / MtgInstr [ count ( distinct-values ( Instr / InstrId )) = count ( Instr / InstrId )]");
	}
	@RuleMetadata(description = "Реквизит /Document/MtgInstr/Instr/VoteExctnConf должен иметь значение No",ocl = "Document.MeetingInstruction.Instruction->forAll(VoteExecutionConfirmation = false)")public boolean checkR020VoteExecutionConfirmationRule() {
		return Helper.check(message,"not (/ MeetingInstruction / Document / MtgInstr / Instr [ not ( VoteExctnConf = false ())])");
	}
	@RuleMetadata(description = "В реквизите /Document/MtgInstr/Instr/VoteDtls/VoteInstrForAgndRsltn/VoteInstr должно быть заполнено минимум одно из For, Against, Abstain, NoAction",ocl = "Document.MeetingInstruction.Instruction.VoteDetails.VoteInstructionForAgendaResolution.VoteInstruction->forAll(\r\n  For->notEmpty() or Against->notEmpty() or Abstain->notEmpty() or NoAction->notEmpty())")public boolean checkR051VoteInstructionRule() {
		return Helper.check(message,"not (/ MeetingInstruction / Document / MtgInstr / Instr / VoteDtls / VoteInstrForAgndRsltn / VoteInstr [ not ( boolean ( For ) or boolean ( Agnst ) or boolean ( Abstn ) or boolean ( NoActn ))])");
	}
	@RuleMetadata(description = "Если реквизит /AppHdr/Rltd заполнен, то он должен ссылаться на существующее сообщение с таким же количеством инструкций",ocl = "ApplicationHeader.Related->notEmpty()\r\nimplies\r\nMeetingInstruction.allInstances()->exists(\r\n  ApplicationHeader.BusinessMessageIdentifier = self.ApplicationHeader.Related.BusinessMessageIdentifier and\r\n  Document.MeetingInstruction.Instruction->size() = self.Document.MeetingInstruction.Instruction->size())")public boolean checkRelatedMeetingInstructionRule() {
		return!Helper.check(message,"boolean (/ MeetingInstruction / AppHdr / Rltd )")||Helper.exists(message,"/ MeetingInstruction [ AppHdr / BizMsgIdr = :param3 and count ( Document / MtgInstr / Instr ) = :param4]",Arrays.asList(new XPathParam("param4","count (/ MeetingInstruction / Document / MtgInstr / Instr )",Integer.class),new XPathParam("param3","/ MeetingInstruction / AppHdr / Rltd / BizMsgIdr",String.class)));
	}
}




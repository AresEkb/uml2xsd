package com.centreit.repiso.ocl.validator.validation;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.w3c.dom.Node;
import com.centreit.repiso.ocl.validator.validation.BaseValidator;
import com.centreit.repiso.ocl.validator.validation.Helper;
import com.centreit.repiso.ocl.validator.validation.Result;

@Generated("uml2xsd")
public class RedemptionOrder extends BaseValidator {
    private Node root;

    public void init(String message) {
        root = Helper.parse(message);
    }

    @RuleMetadata(id = "rule1", description = "Описание правила", ocl = "Document.RedemptionOrderV03.MultipleOrderDetails.IndividualOrderDetails.RelatedPartyDetails\n  ->select(ExtendedRole = \'INVS\')->forAll(party |\n    self.Document.RedemptionOrderV03.Extension.Envelope.oclAsType(XtnsnRedemptionOrder)\n-- ->notEmpty())\n      .XtnsnDt.IndividualOrderAdditionalDetails.RelatedPartiesExtendedDetails.Organisation\n        ->select(Identification = party.Identification.ProprietaryIdentification.Identification)\n        ->forAll(org|org.Address->size() = 2 and org.Address->exists(Type = \'RGST\') and org.Address->exists(Type = \'MLTO\')))")
    public void checkRule1(List<Result> results) {
        for (Node context : Helper.iterate(root,
                "Document / RedOrdr / MltplOrdrDtls / IndvOrdrDtls / RltdPtyDtls [ XtndedRole = \'INVS\']")) {
            results.add(Helper.validate(context,
                    "fn:not(/ Document / RedOrdr / Xtnsn / Envlp / XtnsnDt / IndvOrdrAddtlDtls / RltdPtiesXtndedDtls / Org [ Id = current ()/ Id / PrtryId / Id ][fn:not(fn:count( Adr ) = 2 and Adr [ Tp = \'RGST\'] and Adr [ Tp = \'MLTO\'])])",
                    Helper.format(context, "Сообщение об ошибке"), Helper.format(context, "Сообщение об успехе")));
        }
    }

    @RuleMetadata(id = "rule2", description = "Описание правила", ocl = "Document.RedemptionOrderV03.MultipleOrderDetails.IndividualOrderDetails.RelatedPartyDetails->select(Role=\'FMCO\')->forAll(party|\nself.Document.RedemptionOrderV03.Extension.Envelope.oclAsType(XtnsnRedemptionOrder).XtnsnDt.RelatedPartiesExtendedDetails.Organisation\n->select(Identification=party.Identification.ProprietaryIdentification.Identification)\n->forAll(Name.FullName->notEmpty()))")
    public void checkRule2(List<Result> results) {
        for (Node context : Helper.iterate(root,
                "Document / RedOrdr / MltplOrdrDtls / IndvOrdrDtls / RltdPtyDtls [ Role = \'FMCO\']")) {
            results.add(Helper.validate(context,
                    "fn:not(/ Document / RedOrdr / Xtnsn / Envlp / XtnsnDt / RltdPtiesXtndedDtls / Org [ Id = current ()/ Id / PrtryId / Id ][fn:not( Nm / FullNm )])",
                    Helper.format(context, "Сообщение об ошибке"), Helper.format(context, "Сообщение об успехе")));
        }
    }
}

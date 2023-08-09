package org.kadampabookings.kbsx.ecommerce.client.businesslogic.workingdocument;

import dev.webfx.platform.util.Arrays;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.workingdocument.WorkingDocument;
import org.kadampabookings.kbsx.ecommerce.client.businesslogic.rules.*;

/**
 * @author Bruno Salmon
 */
public final class WorkingDocumentLogic {

    private final static BusinessRule[] BUSINESS_RULES = {
            new BreakfastRule(),
            new DietRule(),
            new TouristTaxRule(),
            new TranslationRule(),
            new HotelShuttleRule()
    };

    public static void applyBusinessRules(WorkingDocument workingDocument) {
        Arrays.forEach(BUSINESS_RULES, rule -> rule.apply(workingDocument));
    }
}

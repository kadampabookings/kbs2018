package org.kadampabookings.kbs2018.ecommerce.client.businesslogic.rules;

import org.kadampabookings.kbs2018.ecommerce.client.businessdata.workingdocument.WorkingDocument;

/**
 * @author Bruno Salmon
 */
public final class TranslationRule extends BusinessRule {

    @Override
    public void apply(WorkingDocument wd) {
        if (!wd.hasTeaching())
            wd.removeTranslation();
        else if (wd.hasTranslation())
            applySameAttendances(wd.getTranslationLine(), wd.getTeachingLine(), 0);
    }
}

package org.kadampabookings.kbs2018.ecommerce.client.businesslogic.rules;

import org.kadampabookings.kbs2018.ecommerce.client.businesslogic.option.OptionLogic;
import org.kadampabookings.kbs2018.ecommerce.client.businessdata.workingdocument.WorkingDocument;
import org.kadampabookings.kbs2018.base.shared.entities.Option;

/**
 * @author Bruno Salmon
 */
public final class TouristTaxRule extends BusinessRule {

    @Override
    public void apply(WorkingDocument wd) {
        if (!wd.hasAccommodation())
            wd.removeTouristTax();
        else if (!wd.hasTouristTax()) {
            Option touristTaxOption = wd.getEventAggregate().findFirstOption(o -> OptionLogic.isTouristTaxOption(o) && (o.hasNoParent() || wd.getAccommodationLine() != null && o.getParent().getItem() == wd.getAccommodationLine().getItem()));
            if (touristTaxOption != null)
                addNewDependentLine(wd, touristTaxOption, wd.getAccommodationLine(), 0);
        }
    }
}

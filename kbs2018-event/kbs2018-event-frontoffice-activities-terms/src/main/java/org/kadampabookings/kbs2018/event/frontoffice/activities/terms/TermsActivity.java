package org.kadampabookings.kbs2018.event.frontoffice.activities.terms;

import dev.webfx.stack.orm.domainmodel.activity.domainpresentation.impl.DomainPresentationActivityImpl;

/**
 * @author Bruno Salmon
 */
final class TermsActivity extends DomainPresentationActivityImpl<TermsPresentationModel> {

    TermsActivity() {
        super(TermsPresentationViewActivity::new, TermsPresentationLogicActivity::new);
    }
}

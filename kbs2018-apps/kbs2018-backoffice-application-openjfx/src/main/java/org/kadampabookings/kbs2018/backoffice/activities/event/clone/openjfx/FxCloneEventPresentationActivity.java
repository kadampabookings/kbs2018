package org.kadampabookings.kbs2018.backoffice.activities.event.clone.openjfx;

import org.kadampabookings.kbs2018.event.backoffice.activities.cloneevent.CloneEventPresentationLogicActivity;
import org.kadampabookings.kbs2018.event.backoffice.activities.cloneevent.CloneEventPresentationModel;
import dev.webfx.stack.orm.domainmodel.activity.domainpresentation.impl.DomainPresentationActivityImpl;

/**
 * @author Bruno Salmon
 */
final class FxCloneEventPresentationActivity extends DomainPresentationActivityImpl<CloneEventPresentationModel> {

    FxCloneEventPresentationActivity() {
        super(FxCloneEventPresentationViewActivity::new, CloneEventPresentationLogicActivity::new);
    }
}

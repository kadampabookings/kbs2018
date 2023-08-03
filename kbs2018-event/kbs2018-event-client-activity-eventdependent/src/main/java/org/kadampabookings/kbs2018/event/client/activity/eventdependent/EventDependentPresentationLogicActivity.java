package org.kadampabookings.kbs2018.event.client.activity.eventdependent;

import dev.webfx.platform.util.function.Factory;
import dev.webfx.stack.orm.domainmodel.activity.domainpresentationlogic.impl.DomainPresentationLogicActivityContextFinal;
import one.modality.event.client.activity.eventdependent.EventDependentPresentationModel;

/**
 * @author Bruno Salmon
 */
public abstract class EventDependentPresentationLogicActivity
        <PM extends EventDependentPresentationModel>

        extends one.modality.event.client.activity.eventdependent.EventDependentPresentationLogicActivity<PM>
        implements EventDependentActivityMixin<DomainPresentationLogicActivityContextFinal<PM>> {

    public EventDependentPresentationLogicActivity(Factory<PM> presentationModelFactory) {
        super(presentationModelFactory);
    }

}

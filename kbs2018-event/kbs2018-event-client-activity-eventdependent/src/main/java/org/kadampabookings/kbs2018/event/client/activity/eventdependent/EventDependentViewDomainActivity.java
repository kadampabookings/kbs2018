package org.kadampabookings.kbs2018.event.client.activity.eventdependent;

import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;

/**
 * @author Bruno Salmon
 */
public abstract class EventDependentViewDomainActivity
        extends one.modality.event.client.activity.eventdependent.EventDependentViewDomainActivity
        implements EventDependentActivityMixin<ViewDomainActivityContextFinal> {

}

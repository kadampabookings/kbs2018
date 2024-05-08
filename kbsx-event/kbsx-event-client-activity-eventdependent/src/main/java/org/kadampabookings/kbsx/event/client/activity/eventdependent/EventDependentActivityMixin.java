package org.kadampabookings.kbsx.event.client.activity.eventdependent;

import dev.webfx.platform.async.Future;
import dev.webfx.stack.orm.domainmodel.activity.domain.DomainActivityContext;
import dev.webfx.stack.routing.uirouter.activity.uiroute.UiRouteActivityContext;
import one.modality.event.client.event.fx.FXEventId;
import org.kadampabookings.kbsx.base.client.aggregates.event.EventAggregate;
import org.kadampabookings.kbsx.base.client.aggregates.event.EventAggregateMixin;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.feesgroup.FeesGroup;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.feesgroup.FeesGroupsByEventStore;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.preselection.ActiveOptionsPreselectionsByEventStore;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.preselection.OptionsPreselection;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.workingdocument.ActiveWorkingDocumentsByEventStore;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.workingdocument.WorkingDocument;

/**
 * @author Bruno Salmon
 */
public interface EventDependentActivityMixin
        <C extends DomainActivityContext<C> & UiRouteActivityContext<C>>

        extends one.modality.event.client.activity.eventdependent.EventDependentActivityMixin<C>,
        EventAggregateMixin
{

    default EventAggregate getEventService() {
        return EventAggregate.getOrCreate(getEventId(), getDataSourceModel());
    }

    default void updateEventDependentPresentationModelFromContextParameters() {
        Object eventId = getParameter("eventId");
        if (eventId != null)
            setEventId(eventId);
        else {
            javafx.beans.property.ObjectProperty<Object> eventIdProperty = eventIdProperty();
            eventIdProperty.bind(FXEventId.eventIdProperty());
        }
        updateOrganizationDependentPresentationModelFromContextParameters();
    }

    default WorkingDocument getEventActiveWorkingDocument() {
        return ActiveWorkingDocumentsByEventStore.getEventActiveWorkingDocument(this);
    }

    default Future<FeesGroup[]> onEventFeesGroups() {
        return FeesGroupsByEventStore.onEventFeesGroups(this);
    }

    default OptionsPreselection getEventActiveOptionsPreselection() {
        return ActiveOptionsPreselectionsByEventStore.getActiveOptionsPreselection(this);
    }

}

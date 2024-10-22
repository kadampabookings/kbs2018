package org.kadampabookings.kbsx.event.frontoffice.activities.options;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.orm.entity.EntityId;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.client.util.routing.ModalityRoutingUtil;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.preselection.ActiveOptionsPreselectionsByEventStore;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.preselection.OptionsPreselection;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.workingdocument.ActiveWorkingDocumentsByEventStore;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.workingdocument.WorkingDocument;

/**
 * @author Bruno Salmon
 */
public final class OptionsRouting {

    private static final String PATH = "/book/event/:eventId/options";

    public static String getPath() {
        return PATH;
    }

    public static String getEventOptionsPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, getPath());
    }

    public static final class OptionsUiRoute extends UiRouteImpl {

        public OptionsUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(OptionsRouting.getPath()
                    , false
                    , OptionsActivity::new
                    , ViewDomainActivityContextFinal::new
            );
        }
    }

    public static final class RouteToOptionsRequest extends RoutePushRequest {

        public RouteToOptionsRequest(Object eventId, BrowsingHistory history) {
            super(getEventOptionsPath(eventId), history);
        }

        public RouteToOptionsRequest(WorkingDocument workingDocument, BrowsingHistory history) {
            this(workingDocument, null, history);
        }

        public RouteToOptionsRequest(OptionsPreselection optionsPreselection, BrowsingHistory history) {
            this(optionsPreselection.getWorkingDocument(), optionsPreselection, history);
        }

        public RouteToOptionsRequest(WorkingDocument workingDocument, OptionsPreselection optionsPreselection, BrowsingHistory history) {
            this(prepareEventServiceAndReturnEventId(workingDocument, optionsPreselection), history);
        }

        private static EntityId prepareEventServiceAndReturnEventId(WorkingDocument workingDocument, OptionsPreselection optionsPreselection) {
            EntityId eventId = workingDocument.getDocument().getEventId();
            if (eventId == null)
                eventId = workingDocument.getEventAggregate().getEvent().getId();
            ActiveOptionsPreselectionsByEventStore.setActiveOptionsPreselection(optionsPreselection, eventId);
            ActiveWorkingDocumentsByEventStore.setEventActiveWorkingDocument(optionsPreselection == null ? workingDocument : null, eventId);
            return eventId;
        }

    }
}

package org.kadampabookings.kbsx.event.frontoffice.activities.startbooking;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class StartBookingRouting {

    private final static String PATH = "/book/event/:eventId/start";

    public static String getPath() {
        return PATH;
    }

    public static String getStartBookingPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, PATH);
    }

    public static final class StartBookingUiRoute extends UiRouteImpl {

        public StartBookingUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(StartBookingRouting.getPath()
                    , false
                    , StartBookingActivity::new
                    , ViewDomainActivityContextFinal::new
            );
        }
    }

    public static final class RouteToStartBookingRequest extends RoutePushRequest {

        public RouteToStartBookingRequest(Object eventId, BrowsingHistory history) {
            super(getStartBookingPath(eventId), history);
        }

    }
}

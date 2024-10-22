package org.kadampabookings.kbsx.event.frontoffice.activities.fees;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class FeesRouting {

    private final static String PATH = "/book/event/:eventId/fees";

    public static String getPath() {
        return PATH;
    }

    public static String getFeesPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, PATH);
    }

    public static final class FeesUiRoute extends UiRouteImpl {

        public FeesUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(FeesRouting.getPath()
                    , false
                    , FeesActivity::new
                    , ViewDomainActivityContextFinal::new
            );
        }
    }

    public static final class RouteToFeesRequest extends RoutePushRequest {

        public RouteToFeesRequest(Object eventId, BrowsingHistory history) {
            super(getFeesPath(eventId), history);
        }

    }
}

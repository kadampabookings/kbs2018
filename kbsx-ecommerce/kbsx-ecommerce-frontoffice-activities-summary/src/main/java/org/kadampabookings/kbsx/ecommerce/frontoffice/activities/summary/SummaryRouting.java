package org.kadampabookings.kbsx.ecommerce.frontoffice.activities.summary;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class SummaryRouting {

    private final static String PATH = "/book/event/:eventId/summary";

    public static String getPath() {
        return PATH;
    }

    public static String getSummaryPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, PATH);
    }

    public static final class SummaryUiRoute extends UiRouteImpl {

        public SummaryUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(SummaryRouting.getPath()
                    , false
                    , SummaryActivity::new
                    , ViewDomainActivityContextFinal::new
            );
        }
    }

    public static final class RouteToSummaryRequest extends RoutePushRequest {

        public RouteToSummaryRequest(Object eventId, BrowsingHistory history) {
            super(getSummaryPath(eventId), history);
        }

    }
}

package org.kadampabookings.kbsx.event.frontoffice.activities.terms;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.domainpresentation.impl.DomainPresentationActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class TermsRouting {

    private final static String PATH = "/book/event/:eventId/terms";

    public static String getPath() {
        return PATH;
    }

    public static String getTermsPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, PATH);
    }

    public static final class TermsUiRoute extends UiRouteImpl {

        public TermsUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(TermsRouting.getPath()
                    , false
                    , TermsActivity::new
                    , DomainPresentationActivityContextFinal::new
            );
        }
    }

    public static final class RouteToTermsRequest extends RoutePushRequest {

        public RouteToTermsRequest(Object eventId, BrowsingHistory history) {
            super(getTermsPath(eventId), history);
        }

    }
}

package org.kadampabookings.kbsx.ecommerce.frontoffice.activities.person;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class PersonRouting {

    private final static String PATH = "/book/event/:eventId/person";

    public static String getPath() {
        return PATH;
    }

    public static String getPersonPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, PATH);
    }

    public static final class PersonUiRoute extends UiRouteImpl {

        public PersonUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(PersonRouting.getPath()
                    , false
                    , PersonActivity::new
                    , ViewDomainActivityContextFinal::new
            );
        }
    }

    public static final class RouteToPersonRequest extends RoutePushRequest {

        public RouteToPersonRequest(Object eventId, BrowsingHistory history) {
            super(getPersonPath(eventId), history);
        }

    }
}

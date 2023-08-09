package org.kadampabookings.kbsx.event.backoffice.activities.events;

import org.kadampabookings.kbsx.event.backoffice.operations.routes.events.RouteToEventsRequest;
import dev.webfx.stack.routing.uirouter.activity.uiroute.UiRouteActivityContext;
import dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter;
import dev.webfx.stack.routing.router.auth.authz.RouteRequest;

/**
 * @author Bruno Salmon
 */
public final class RouteToEventsRequestEmitter implements RouteRequestEmitter {

    @Override
    public RouteRequest instantiateRouteRequest(UiRouteActivityContext context) {
        return new RouteToEventsRequest(context.getHistory());
    }
}

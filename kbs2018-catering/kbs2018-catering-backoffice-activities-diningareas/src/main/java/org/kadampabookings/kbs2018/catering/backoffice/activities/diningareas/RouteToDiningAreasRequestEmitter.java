package org.kadampabookings.kbs2018.catering.backoffice.activities.diningareas;

import org.kadampabookings.kbs2018.catering.backoffice.operations.routes.diningareas.RouteToDiningAreasRequest;
import dev.webfx.stack.routing.uirouter.activity.uiroute.UiRouteActivityContext;
import dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter;
import dev.webfx.stack.routing.router.auth.authz.RouteRequest;

/**
 * @author Bruno Salmon
 */
public final class RouteToDiningAreasRequestEmitter implements RouteRequestEmitter {

    @Override
    public RouteRequest instantiateRouteRequest(UiRouteActivityContext context) {
        return new RouteToDiningAreasRequest(context.getParameter("eventId"), context.getHistory());
    }
}

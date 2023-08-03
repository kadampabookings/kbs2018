package org.kadampabookings.kbs2018.ecommerce.backoffice.activities.statements;

import org.kadampabookings.kbs2018.ecommerce.backoffice.operations.routes.statements.RouteToStatementsRequest;
import dev.webfx.stack.routing.uirouter.activity.uiroute.UiRouteActivityContext;
import dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter;
import dev.webfx.stack.routing.router.auth.authz.RouteRequest;

/**
 * @author Bruno Salmon
 */
public final class RouteToStatementsRequestEmitter implements RouteRequestEmitter {

    @Override
    public RouteRequest instantiateRouteRequest(UiRouteActivityContext context) {
        return new RouteToStatementsRequest(context.getParameter("eventId"), context.getHistory());
    }
}

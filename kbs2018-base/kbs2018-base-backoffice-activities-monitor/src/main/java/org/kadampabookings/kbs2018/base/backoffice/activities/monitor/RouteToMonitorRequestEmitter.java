package org.kadampabookings.kbs2018.base.backoffice.activities.monitor;

import org.kadampabookings.kbs2018.base.backoffice.operations.routes.monitor.RouteToMonitorRequest;
import dev.webfx.stack.routing.uirouter.activity.uiroute.UiRouteActivityContext;
import dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter;
import dev.webfx.stack.routing.router.auth.authz.RouteRequest;

/**
 * @author Bruno Salmon
 */
public final class RouteToMonitorRequestEmitter implements RouteRequestEmitter {

    @Override
    public RouteRequest instantiateRouteRequest(UiRouteActivityContext context) {
        return new RouteToMonitorRequest(context.getHistory());
    }
}

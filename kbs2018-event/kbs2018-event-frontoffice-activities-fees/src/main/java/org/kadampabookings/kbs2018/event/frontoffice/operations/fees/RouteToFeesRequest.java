package org.kadampabookings.kbs2018.event.frontoffice.operations.fees;

import org.kadampabookings.kbs2018.event.frontoffice.activities.fees.routing.FeesRouting;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import dev.webfx.platform.windowhistory.spi.BrowsingHistory;

/**
 * @author Bruno Salmon
 */
public final class RouteToFeesRequest extends RoutePushRequest {

    public RouteToFeesRequest(Object eventId, BrowsingHistory history) {
        super(FeesRouting.getFeesPath(eventId), history);
    }

}

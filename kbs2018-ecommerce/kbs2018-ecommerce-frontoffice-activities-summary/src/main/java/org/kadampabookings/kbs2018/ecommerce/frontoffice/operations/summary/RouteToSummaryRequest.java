package org.kadampabookings.kbs2018.ecommerce.frontoffice.operations.summary;

import org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.summary.routing.SummaryRouting;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import dev.webfx.platform.windowhistory.spi.BrowsingHistory;

/**
 * @author Bruno Salmon
 */
public final class RouteToSummaryRequest extends RoutePushRequest {

    public RouteToSummaryRequest(Object eventId, BrowsingHistory history) {
        super(SummaryRouting.getSummaryPath(eventId), history);
    }

}

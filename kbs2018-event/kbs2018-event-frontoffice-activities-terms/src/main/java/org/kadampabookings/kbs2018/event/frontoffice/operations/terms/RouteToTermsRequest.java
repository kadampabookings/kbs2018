package org.kadampabookings.kbs2018.event.frontoffice.operations.terms;

import org.kadampabookings.kbs2018.event.frontoffice.activities.terms.routing.TermsRouting;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import dev.webfx.platform.windowhistory.spi.BrowsingHistory;

/**
 * @author Bruno Salmon
 */
public final class RouteToTermsRequest extends RoutePushRequest {

    public RouteToTermsRequest(Object eventId, BrowsingHistory history) {
        super(TermsRouting.getTermsPath(eventId), history);
    }

}

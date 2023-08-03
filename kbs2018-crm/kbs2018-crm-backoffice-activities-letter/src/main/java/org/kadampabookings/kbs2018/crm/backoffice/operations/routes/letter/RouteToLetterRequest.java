package org.kadampabookings.kbs2018.crm.backoffice.operations.routes.letter;

import org.kadampabookings.kbs2018.crm.backoffice.activities.letter.routing.LetterRouting;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import dev.webfx.platform.windowhistory.spi.BrowsingHistory;

/**
 * @author Bruno Salmon
 */
public final class RouteToLetterRequest extends RoutePushRequest {

    public RouteToLetterRequest(Object letterId, BrowsingHistory history) {
        super(LetterRouting.getEditLetterPath(letterId), history);
    }

}

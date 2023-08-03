package org.kadampabookings.kbs2018.event.frontoffice.operations.program;

import org.kadampabookings.kbs2018.event.frontoffice.activities.program.routing.ProgramRouting;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import dev.webfx.platform.windowhistory.spi.BrowsingHistory;

/**
 * @author Bruno Salmon
 */
public final class RouteToProgramRequest extends RoutePushRequest {

    public RouteToProgramRequest(Object eventId, BrowsingHistory history) {
        super(ProgramRouting.getProgramPath(eventId), history);
    }

}

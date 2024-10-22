package org.kadampabookings.kbsx.event.frontoffice.activities.program;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class ProgramRouting {

    private final static String PATH = "/book/event/:eventId/program";

    public static String getPath() {
        return PATH;
    }

    public static String getProgramPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, PATH);
    }

    public static final class ProgramUiRoute extends UiRouteImpl {

        public ProgramUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(ProgramRouting.getPath()
                    , false
                    , ProgramActivity::new
                    , ViewDomainActivityContextFinal::new
            );
        }
    }

    public static final class RouteToProgramRequest extends RoutePushRequest {

        public RouteToProgramRequest(Object eventId, BrowsingHistory history) {
            super(getProgramPath(eventId), history);
        }

    }
}

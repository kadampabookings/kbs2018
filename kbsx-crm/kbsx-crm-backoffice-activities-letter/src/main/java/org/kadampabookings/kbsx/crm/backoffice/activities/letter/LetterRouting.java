package org.kadampabookings.kbsx.crm.backoffice.activities.letter;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class LetterRouting {

    private final static String PATH = "/letter/:letterId";

    public static String getPath() {
        return PATH;
    }

    public static String getEditLetterPath(Object letterId) {
        return ModalityRoutingUtil.interpolateLetterIdInPath(letterId, PATH);
    }

    public static final class LetterUiRoute extends UiRouteImpl {

        public LetterUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(LetterRouting.getPath()
                    , true
                    , LetterActivity::new
                    , ViewDomainActivityContextFinal::new
            );
        }
    }

    public static final class RouteToLetterRequest extends RoutePushRequest {

        public RouteToLetterRequest(Object letterId, BrowsingHistory history) {
            super(getEditLetterPath(letterId), history);
        }

    }
}

package org.kadampabookings.kbsx.ecommerce.frontoffice.activities.contactus;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class ContactUsRouting {

    private final static String PATH = "/contact-us/:documentId";

    public static String getPath() {
        return PATH;
    }

    public static String getContactUsPath(Object documentId) {
        return ModalityRoutingUtil.interpolateDocumentIdInPath(documentId, getPath());
    }

    public static final class ContactUsUiRoute extends UiRouteImpl {

        public ContactUsUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(ContactUsRouting.getPath()
                    , true
                    , ContactUsActivity::new
                    , ViewDomainActivityContextFinal::new
            );
        }
    }

    public static final class RouteToContactUsRequest extends RoutePushRequest {

        public RouteToContactUsRequest(Object documentId, BrowsingHistory history) {
            super(getContactUsPath(documentId), history);
        }

    }
}

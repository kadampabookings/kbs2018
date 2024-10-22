package org.kadampabookings.kbsx.ecommerce.frontoffice.activities.payment;

import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import org.kadampabookings.kbsx.ecommerce.frontoffice.activities.cart.base.CartRouting;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class PaymentRouting {

    private final static String PATH = CartRouting.getPath() + "/payment";

    public static String getPath() {
        return PATH;
    }

    public static String getPaymentPath(Object cartUuidOrDocument) {
        return ModalityRoutingUtil.interpolateCartUuidInPath(CartRouting.getCartUuid(cartUuidOrDocument), getPath());
    }

    public static final class PaymentUiRoute extends UiRouteImpl {

        public PaymentUiRoute() {
            super(uiRoute());
        }

        public static UiRoute<?> uiRoute() {
            return UiRoute.create(PaymentRouting.getPath()
                    , true
                    , PaymentActivity::new
                    , ViewDomainActivityContextFinal::new
            );
        }
    }

    public static final class RouteToPaymentRequest extends RoutePushRequest {

        public RouteToPaymentRequest(Object cartUuidOrDocument, BrowsingHistory history) {
            super(getPaymentPath(cartUuidOrDocument), history);
        }

    }
}

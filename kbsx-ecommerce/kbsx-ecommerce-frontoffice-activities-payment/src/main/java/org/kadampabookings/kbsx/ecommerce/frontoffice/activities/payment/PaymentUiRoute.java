package org.kadampabookings.kbsx.ecommerce.frontoffice.activities.payment;

import org.kadampabookings.kbsx.ecommerce.frontoffice.activities.payment.routing.PaymentRouting;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.impl.ViewDomainActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;

/**
 * @author Bruno Salmon
 */
public final class PaymentUiRoute extends UiRouteImpl {

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

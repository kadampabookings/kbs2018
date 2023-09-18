package org.kadampabookings.kbsx.ecommerce.frontoffice.operations.cart;

import org.kadampabookings.kbsx.ecommerce.frontoffice.activities.cart.routing.CartRouting;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import dev.webfx.platform.ast.AST;
import dev.webfx.platform.windowhistory.spi.BrowsingHistory;

import java.time.Instant;

/**
 * @author Bruno Salmon
 */
public final class RouteToCartRequest extends RoutePushRequest {

    public RouteToCartRequest(Object cartUuidOrDocument, BrowsingHistory history) {
        super(CartRouting.getCartPath(cartUuidOrDocument), history, AST.createObject().set("refresh", Instant.now()));
    }

}

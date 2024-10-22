package org.kadampabookings.kbsx.ecommerce.frontoffice.activities.cart.base;

import dev.webfx.platform.ast.AST;
import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.stack.routing.uirouter.operations.RoutePushRequest;
import one.modality.base.shared.entities.Document;
import one.modality.base.client.util.routing.ModalityRoutingUtil;

import java.time.Instant;

/**
 * @author Bruno Salmon
 */
public final class CartRouting {

    private final static String PATH = "/book/cart/:cartUuid";

    public static String getPath() {
        return PATH;
    }

    public static String getCartPath(Object cartUuidOrDocument) {
        return ModalityRoutingUtil.interpolateCartUuidInPath(getCartUuid(cartUuidOrDocument), getPath());
    }

    public static Object getCartUuid(Object cartUuidOrDocument) {
        if (cartUuidOrDocument instanceof Document)
            return ((Document) cartUuidOrDocument).evaluate("cart.uuid");
        return cartUuidOrDocument;
    }

    public static final class RouteToCartRequest extends RoutePushRequest {

        public RouteToCartRequest(Object cartUuidOrDocument, BrowsingHistory history) {
            super(getCartPath(cartUuidOrDocument), history, AST.createObject().set("refresh", Instant.now()));
        }

    }
}

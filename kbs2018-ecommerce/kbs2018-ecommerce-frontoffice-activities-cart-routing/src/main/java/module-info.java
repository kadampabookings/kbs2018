// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.frontoffice.activities.cart.routing {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;
    requires transitive kbs2018.base.client.aggregates;
    requires modality.base.client.activity;
    requires modality.base.client.util;
    requires modality.base.shared.entities;
    requires webfx.extras.util.background;
    requires webfx.kit.util;
    requires webfx.platform.json;
    requires webfx.platform.util;
    requires webfx.platform.windowhistory;
    requires webfx.stack.i18n;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.routing.uirouter;

    // Exported packages
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.cart.base;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.cart.routing;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.operations.cart;

}
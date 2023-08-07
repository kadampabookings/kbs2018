// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.frontoffice.activities.payment {

    // Direct dependencies modules
    requires java.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.ecommerce.frontoffice.activities.cart.routing;
    requires kbs2018.event.client.sectionpanel;
    requires modality.base.client.entities;
    requires modality.base.client.util;
    requires modality.base.shared.domainmodel;
    requires modality.base.shared.entities;
    requires webfx.extras.util.layout;
    requires webfx.extras.webtext;
    requires webfx.platform.console;
    requires webfx.platform.uischeduler;
    requires webfx.platform.util;
    requires webfx.platform.windowhistory;
    requires webfx.platform.windowlocation;
    requires webfx.stack.i18n;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.entity;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.session.state.client.fx;
    requires webfx.stack.ui.action;
    requires webfx.stack.ui.controls;

    // Exported packages
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.payment;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.payment.routing;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.operations.payment;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.payment.PaymentUiRoute;

}
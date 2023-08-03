// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.frontoffice.activities.contactus {

    // Direct dependencies modules
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.ecommerce.frontoffice.activities.cart.routing;
    requires modality.base.client.activity;
    requires modality.base.client.util;
    requires modality.base.client.validation;
    requires modality.base.shared.entities;
    requires webfx.extras.util.background;
    requires webfx.extras.util.layout;
    requires webfx.platform.console;
    requires webfx.platform.uischeduler;
    requires webfx.platform.util;
    requires webfx.platform.windowhistory;
    requires webfx.platform.windowlocation;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.entity;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.action;

    // Exported packages
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.contactus;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.contactus.routing;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.operations.contactus;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.contactus.ContactUsUiRoute;

}
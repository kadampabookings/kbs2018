// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.frontoffice.activities.cart {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.ecommerce.client.bookingoptionspanel;
    requires kbs2018.ecommerce.client.businesslogic;
    requires kbs2018.ecommerce.frontoffice.activities.cart.routing;
    requires kbs2018.ecommerce.frontoffice.activities.contactus;
    requires kbs2018.ecommerce.frontoffice.activities.payment;
    requires kbs2018.event.client.sectionpanel;
    requires kbs2018.event.frontoffice.activities.options;
    requires kbs2018.event.frontoffice.activities.startbooking;
    requires modality.base.client.util;
    requires modality.base.shared.domainmodel;
    requires modality.base.shared.entities;
    requires webfx.extras.flexbox;
    requires webfx.extras.type;
    requires webfx.extras.util.layout;
    requires webfx.extras.visual;
    requires webfx.extras.visual.grid;
    requires webfx.platform.async;
    requires webfx.platform.console;
    requires webfx.platform.uischeduler;
    requires webfx.platform.util;
    requires webfx.stack.i18n;
    requires webfx.stack.orm.domainmodel;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.entity;
    requires webfx.stack.orm.expression;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.action;
    requires webfx.stack.ui.controls;

    // Exported packages
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.cart;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.cart.CartUiRoute;

}
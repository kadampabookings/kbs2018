// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.event.frontoffice.activities.startbooking {

    // Direct dependencies modules
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.base.client.icons;
    requires kbs2018.base.shared.entities;
    requires kbs2018.ecommerce.client.bookingprocess;
    requires kbs2018.event.frontoffice.activities.fees;
    requires kbs2018.event.frontoffice.activities.options;
    requires kbs2018.event.frontoffice.activities.program;
    requires kbs2018.event.frontoffice.activities.terms;
    requires modality.base.client.entities;
    requires modality.base.client.util;
    requires webfx.extras.imagestore;
    requires webfx.extras.util.animation;
    requires webfx.extras.util.layout;
    requires webfx.kit.util;
    requires webfx.platform.console;
    requires webfx.platform.uischeduler;
    requires webfx.platform.windowhistory;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.action;

    // Exported packages
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.startbooking;
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.startbooking.routing;
    exports org.kadampabookings.kbs2018.event.frontoffice.operations.startbooking;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.event.frontoffice.activities.startbooking.StartBookingUiRoute;

}
// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.event.frontoffice.activities.options {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.base.client.icons;
    requires kbs2018.base.shared.entities;
    requires kbs2018.ecommerce.client.bookingprocess;
    requires kbs2018.ecommerce.client.businesslogic;
    requires kbs2018.ecommerce.frontoffice.activities.person;
    requires kbs2018.event.client.bookingcalendar;
    requires kbs2018.event.client.sectionpanel;
    requires kbs2018.hotel.shared.time;
    requires modality.base.client.entities;
    requires modality.base.client.util;
    requires modality.base.client.validation;
    requires modality.base.shared.entities;
    requires webfx.extras.flexbox;
    requires webfx.extras.imagestore;
    requires webfx.extras.util.layout;
    requires webfx.kit.util;
    requires webfx.platform.console;
    requires webfx.platform.uischeduler;
    requires webfx.platform.util;
    requires webfx.platform.windowhistory;
    requires webfx.stack.i18n;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.entity;
    requires webfx.stack.orm.entity.controls;
    requires webfx.stack.routing.uirouter;

    // Exported packages
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.options;
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.options.routing;
    exports org.kadampabookings.kbs2018.event.frontoffice.operations.options;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.event.frontoffice.activities.options.OptionsUiRoute;

}
// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.event.backoffice.activities.options {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.base.backoffice.multilangeditor;
    requires kbs2018.base.client.icons;
    requires kbs2018.base.shared.entities;
    requires kbs2018.ecommerce.client.businesslogic;
    requires kbs2018.event.client.bookingcalendar;
    requires kbs2018.event.client.calendar;
    requires kbs2018.event.frontoffice.activities.options;
    requires kbs2018.hotel.shared.time;
    requires modality.base.shared.entities;
    requires webfx.extras.util.layout;
    requires webfx.extras.visual.grid;
    requires webfx.kit.util;
    requires webfx.stack.db.submit;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.dql;
    requires webfx.stack.orm.entity;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.controls;

    // Exported packages
    exports org.kadampabookings.kbs2018.event.backoffice.activities.options;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.event.backoffice.activities.options.EditableOptionsUiRoute;

}
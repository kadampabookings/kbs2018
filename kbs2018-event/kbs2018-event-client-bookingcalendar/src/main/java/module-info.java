// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.event.client.bookingcalendar {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;
    requires kbs2018.base.client.aggregates;
    requires kbs2018.base.shared.entities;
    requires kbs2018.ecommerce.client.businesslogic;
    requires kbs2018.event.client.calendar;
    requires kbs2018.hotel.shared.time;
    requires modality.base.client.util;
    requires modality.base.shared.entities;
    requires webfx.platform.console;
    requires webfx.platform.uischeduler;
    requires webfx.stack.orm.entity;

    // Exported packages
    exports org.kadampabookings.kbs2018.event.client.controls.bookingcalendar;

}
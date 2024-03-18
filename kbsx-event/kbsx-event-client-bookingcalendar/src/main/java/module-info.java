// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.event.client.bookingcalendar {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.graphics;
    requires kbsx.base.client.aggregates;
    requires kbsx.base.shared.entities;
    requires kbsx.ecommerce.client.businesslogic;
    requires kbsx.event.client.calendar;
    requires kbsx.hotel.shared.time;
    requires modality.base.client.util;
    requires modality.base.shared.entities;
    requires webfx.platform.console;
    requires webfx.platform.uischeduler;
    requires webfx.stack.orm.entity;

    // Exported packages
    exports org.kadampabookings.kbsx.event.client.controls.bookingcalendar;

}
// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.event.backoffice.activities.cloneevent {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.base.shared.entities;
    requires kbs2018.event.backoffice.activities.cloneevent.routing;
    requires kbs2018.event.client.activity.eventdependent;
    requires modality.base.client.activity;
    requires modality.base.shared.domainmodel;
    requires modality.base.shared.entities;
    requires modality.ecommerce.backoffice.activities.bookings;
    requires modality.event.client.activity.eventdependent;
    requires webfx.kit.util;
    requires webfx.platform.uischeduler;
    requires webfx.stack.db.submit;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.entity;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.controls;

    // Exported packages
    exports org.kadampabookings.kbs2018.event.backoffice.activities.cloneevent;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.event.backoffice.activities.cloneevent.CloneEventUiRoute;

}
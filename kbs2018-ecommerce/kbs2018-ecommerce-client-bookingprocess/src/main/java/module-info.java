// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.client.bookingprocess {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.base.client.aggregates;
    requires kbs2018.base.shared.entities;
    requires kbs2018.event.client.activity.eventdependent;
    requires transitive modality.base.client.activity;
    requires modality.base.shared.entities;
    requires modality.event.client.activity.eventdependent;
    requires webfx.extras.util.background;
    requires webfx.extras.util.layout;
    requires webfx.kit.util;
    requires webfx.platform.util;
    requires webfx.stack.orm.datasourcemodel.service;
    requires webfx.stack.routing.uirouter;

    // Exported packages
    exports org.kadampabookings.kbs2018.ecommerce.client.activity.bookingprocess;

}
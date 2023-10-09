// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.ecommerce.client.bookingprocess {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbsx.base.client.aggregates;
    requires kbsx.base.shared.entities;
    requires kbsx.event.client.activity.eventdependent;
    requires transitive modality.base.client.activity;
    requires modality.base.shared.entities;
    requires modality.event.client.activity.eventdependent;
    requires webfx.extras.util.background;
    requires webfx.extras.util.control;
    requires webfx.kit.util;
    requires webfx.platform.util;
    requires webfx.stack.orm.datasourcemodel.service;
    requires webfx.stack.routing.uirouter;

    // Exported packages
    exports org.kadampabookings.kbsx.ecommerce.client.activity.bookingprocess;

}
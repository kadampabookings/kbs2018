// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.event.client.activity.eventdependent {

    // Direct dependencies modules
    requires javafx.base;
    requires kbsx.base.client.aggregates;
    requires kbsx.ecommerce.client.businesslogic;
    requires modality.event.backoffice.event.fx;
    requires modality.event.client.activity.eventdependent;
    requires webfx.platform.async;
    requires webfx.platform.util;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.routing.uirouter;

    // Exported packages
    exports org.kadampabookings.kbsx.event.client.activity.eventdependent;

}
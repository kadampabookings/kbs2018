// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.client.businesslogic {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires transitive kbs2018.base.client.aggregates;
    requires kbs2018.base.shared.entities;
    requires kbs2018.event.client.calendar;
    requires kbs2018.hotel.shared.time;
    requires modality.base.client.entities;
    requires modality.base.shared.entities;
    requires transitive webfx.platform.async;
    requires webfx.platform.util;
    requires webfx.stack.db.query;
    requires webfx.stack.db.submit;
    requires webfx.stack.orm.entity;

    // Exported packages
    exports org.kadampabookings.kbs2018.ecommerce.client.businessdata.feesgroup;
    exports org.kadampabookings.kbs2018.ecommerce.client.businessdata.preselection;
    exports org.kadampabookings.kbs2018.ecommerce.client.businessdata.workingdocument;
    exports org.kadampabookings.kbs2018.ecommerce.client.businesslogic.feesgroup;
    exports org.kadampabookings.kbs2018.ecommerce.client.businesslogic.option;
    exports org.kadampabookings.kbs2018.ecommerce.client.businesslogic.pricing;
    exports org.kadampabookings.kbs2018.ecommerce.client.businesslogic.rules;
    exports org.kadampabookings.kbs2018.ecommerce.client.businesslogic.workingdocument;

}
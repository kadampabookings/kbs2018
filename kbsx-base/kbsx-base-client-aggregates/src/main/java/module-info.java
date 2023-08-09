// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.base.client.aggregates {

    // Direct dependencies modules
    requires java.base;
    requires kbsx.base.shared.entities;
    requires transitive modality.base.shared.entities;
    requires transitive webfx.platform.async;
    requires webfx.platform.console;
    requires webfx.platform.util;
    requires webfx.stack.com.bus;
    requires webfx.stack.com.bus.json.client.websocket;
    requires webfx.stack.db.query;
    requires webfx.stack.orm.domainmodel;
    requires transitive webfx.stack.orm.entity;

    // Exported packages
    exports org.kadampabookings.kbsx.base.client.aggregates.cart;
    exports org.kadampabookings.kbsx.base.client.aggregates.event;
    exports org.kadampabookings.kbsx.base.client.aggregates.person;

}
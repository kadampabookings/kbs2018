// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.event.frontoffice.activities.fees {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.base.client.aggregates;
    requires kbs2018.base.client.icons;
    requires kbs2018.base.shared.entities;
    requires kbs2018.ecommerce.client.bookingprocess;
    requires kbs2018.ecommerce.client.businesslogic;
    requires kbs2018.event.client.sectionpanel;
    requires kbs2018.event.frontoffice.activities.options;
    requires modality.base.client.activity;
    requires modality.base.client.entities;
    requires modality.base.client.util;
    requires modality.base.shared.entities;
    requires webfx.extras.cell;
    requires webfx.extras.imagestore;
    requires webfx.extras.type;
    requires webfx.extras.util.layout;
    requires webfx.extras.visual;
    requires webfx.extras.visual.grid;
    requires webfx.extras.visual.grid.peers.base;
    requires webfx.kit.util;
    requires webfx.platform.console;
    requires webfx.platform.json;
    requires webfx.platform.uischeduler;
    requires webfx.platform.util;
    requires webfx.platform.windowhistory;
    requires webfx.stack.i18n;
    requires webfx.stack.i18n.controls;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.entity;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.json;

    // Exported packages
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.fees;
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.fees.routing;
    exports org.kadampabookings.kbs2018.event.frontoffice.operations.fees;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.event.frontoffice.activities.fees.FeesUiRoute;

}
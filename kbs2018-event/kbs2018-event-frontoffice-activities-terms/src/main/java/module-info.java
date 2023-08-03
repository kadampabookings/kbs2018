// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.event.frontoffice.activities.terms {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.base.client.icons;
    requires kbs2018.ecommerce.client.bookingprocess;
    requires kbs2018.event.client.sectionpanel;
    requires modality.base.client.util;
    requires webfx.extras.util.layout;
    requires webfx.extras.visual;
    requires webfx.extras.visual.grid.peers.base;
    requires webfx.platform.windowhistory;
    requires webfx.stack.i18n;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.dql;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.routing.uirouter;

    // Exported packages
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.terms;
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.terms.routing;
    exports org.kadampabookings.kbs2018.event.frontoffice.operations.terms;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.event.frontoffice.activities.terms.TermsUiRoute;

}
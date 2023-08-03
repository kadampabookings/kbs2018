// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.frontoffice.activities.summary {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.ecommerce.client.bookingoptionspanel;
    requires kbs2018.ecommerce.client.bookingprocess;
    requires kbs2018.ecommerce.client.businesslogic;
    requires kbs2018.ecommerce.frontoffice.activities.cart.routing;
    requires kbs2018.event.client.bookingcalendar;
    requires kbs2018.event.client.sectionpanel;
    requires modality.base.client.util;
    requires modality.base.client.validation;
    requires modality.base.shared.entities;
    requires modality.crm.client.personaldetails;
    requires webfx.kit.util;
    requires webfx.platform.console;
    requires webfx.platform.util;
    requires webfx.platform.windowhistory;
    requires webfx.stack.i18n;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.routing.uirouter;

    // Exported packages
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.summary;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.summary.routing;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.operations.summary;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.summary.SummaryUiRoute;

}
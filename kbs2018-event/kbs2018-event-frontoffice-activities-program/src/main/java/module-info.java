// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.event.frontoffice.activities.program {

    // Direct dependencies modules
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.base.client.icons;
    requires kbs2018.ecommerce.client.bookingprocess;
    requires kbs2018.ecommerce.client.businesslogic;
    requires kbs2018.event.client.bookingcalendar;
    requires kbs2018.event.client.sectionpanel;
    requires modality.base.client.util;
    requires webfx.extras.util.layout;
    requires webfx.platform.console;
    requires webfx.platform.windowhistory;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.routing.uirouter;

    // Exported packages
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.program;
    exports org.kadampabookings.kbs2018.event.frontoffice.activities.program.routing;
    exports org.kadampabookings.kbs2018.event.frontoffice.operations.program;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.event.frontoffice.activities.program.ProgramUiRoute;

}
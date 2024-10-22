// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.event.frontoffice.activities.program {

    // Direct dependencies modules
    requires javafx.controls;
    requires javafx.graphics;
    requires kbsx.base.client.icons;
    requires kbsx.ecommerce.client.bookingprocess;
    requires kbsx.ecommerce.client.businesslogic;
    requires kbsx.event.client.bookingcalendar;
    requires kbsx.event.client.sectionpanel;
    requires modality.base.client.util;
    requires webfx.extras.util.layout;
    requires webfx.platform.console;
    requires webfx.platform.windowhistory;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.routing.uirouter;

    // Exported packages
    exports org.kadampabookings.kbsx.event.frontoffice.activities.program;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbsx.event.frontoffice.activities.program.ProgramRouting.ProgramUiRoute;

}
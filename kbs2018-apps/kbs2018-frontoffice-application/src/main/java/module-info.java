// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.frontoffice.application {

    // Direct dependencies modules
    requires javafx.controls;
    requires javafx.graphics;
    requires modality.base.client.application;
    requires webfx.extras.flexbox;
    requires webfx.platform.os;
    requires webfx.stack.ui.action;

    // Exported packages
    exports org.kadampabookings.kbs2018.frontoffice;

    // Provided services
    provides javafx.application.Application with org.kadampabookings.kbs2018.frontoffice.KBSFrontOfficeApplication;

}
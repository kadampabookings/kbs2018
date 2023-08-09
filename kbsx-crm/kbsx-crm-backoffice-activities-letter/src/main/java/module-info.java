// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.crm.backoffice.activities.letter {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.graphics;
    requires kbsx.base.backoffice.multilangeditor;
    requires modality.base.client.util;
    requires webfx.kit.util;
    requires webfx.platform.windowhistory;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.controls;

    // Exported packages
    exports org.kadampabookings.kbsx.crm.backoffice.activities.letter;
    exports org.kadampabookings.kbsx.crm.backoffice.activities.letter.routing;
    exports org.kadampabookings.kbsx.crm.backoffice.operations.routes.letter;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbsx.crm.backoffice.activities.letter.LetterUiRoute;

}
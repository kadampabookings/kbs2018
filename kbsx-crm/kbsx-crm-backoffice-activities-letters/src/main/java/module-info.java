// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.crm.backoffice.activities.letters {

    // Direct dependencies modules
    requires javafx.graphics;
    requires kbsx.crm.backoffice.activities.letter;
    requires modality.base.client.activity;
    requires modality.base.client.util;
    requires modality.event.client.activity.eventdependent;
    requires webfx.platform.windowhistory;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.dql;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.routing.router;
    requires webfx.stack.routing.router.client;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.operation;

    // Exported packages
    exports org.kadampabookings.kbsx.crm.backoffice.activities.letters;
    exports org.kadampabookings.kbsx.crm.backoffice.activities.letters.routing;
    exports org.kadampabookings.kbsx.crm.backoffice.operations.routes.letters;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbsx.crm.backoffice.activities.letters.LettersUiRoute;
    provides dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter with org.kadampabookings.kbsx.crm.backoffice.activities.letters.RouteToLettersRequestEmitter;

}
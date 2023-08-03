// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.crm.backoffice.activities.authorizations {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires webfx.extras.visual.grid;
    requires webfx.platform.windowhistory;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.dql;
    requires webfx.stack.orm.entity;
    requires webfx.stack.orm.entity.controls;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.routing.router.client;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.operation;

    // Exported packages
    exports org.kadampabookings.kbs2018.crm.backoffice.activities.authorizations;
    exports org.kadampabookings.kbs2018.crm.backoffice.activities.authorizations.routing;
    exports org.kadampabookings.kbs2018.crm.backoffice.activities.operations.authorizations;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.crm.backoffice.activities.authorizations.AuthorizationsUiRoute;
    provides dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter with org.kadampabookings.kbs2018.crm.backoffice.activities.authorizations.RouteToAuthorizationsRequestEmitter;

}
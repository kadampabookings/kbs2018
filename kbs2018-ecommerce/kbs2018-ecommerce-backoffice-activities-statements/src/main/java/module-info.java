// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.backoffice.activities.statements {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires modality.base.backoffice.masterslave;
    requires modality.base.client.presentationmodel;
    requires modality.base.client.util;
    requires modality.base.shared.domainmodel;
    requires modality.base.shared.entities;
    requires modality.event.client.activity.eventdependent;
    requires webfx.extras.visual;
    requires webfx.platform.windowhistory;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.dql;
    requires webfx.stack.orm.entity;
    requires webfx.stack.orm.entity.controls;
    requires webfx.stack.orm.expression;
    requires webfx.stack.orm.reactive.dql;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.routing.router;
    requires webfx.stack.routing.router.client;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.operation;

    // Exported packages
    exports org.kadampabookings.kbs2018.ecommerce.backoffice.activities.statements;
    exports org.kadampabookings.kbs2018.ecommerce.backoffice.activities.statements.routing;
    exports org.kadampabookings.kbs2018.ecommerce.backoffice.operations.routes.statements;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.ecommerce.backoffice.activities.statements.StatementsUiRoute;
    provides dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter with org.kadampabookings.kbs2018.ecommerce.backoffice.activities.statements.RouteToStatementsRequestEmitter;

}
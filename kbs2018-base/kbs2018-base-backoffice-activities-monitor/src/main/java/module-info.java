// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.base.backoffice.activities.monitor {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires modality.base.client.activity;
    requires webfx.extras.util.layout;
    requires webfx.extras.visual;
    requires webfx.extras.visual.charts;
    requires webfx.platform.windowhistory;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.orm.entity;
    requires webfx.stack.orm.reactive.entities;
    requires webfx.stack.orm.reactive.visual;
    requires webfx.stack.routing.router.client;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.operation;

    // Exported packages
    exports org.kadampabookings.kbs2018.base.backoffice.activities.monitor;
    exports org.kadampabookings.kbs2018.base.backoffice.activities.monitor.routing;
    exports org.kadampabookings.kbs2018.base.backoffice.operations.routes.monitor;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.base.backoffice.activities.monitor.MonitorUiRoute;
    provides dev.webfx.stack.routing.uirouter.operations.RouteRequestEmitter with org.kadampabookings.kbs2018.base.backoffice.activities.monitor.RouteToMonitorRequestEmitter;

}
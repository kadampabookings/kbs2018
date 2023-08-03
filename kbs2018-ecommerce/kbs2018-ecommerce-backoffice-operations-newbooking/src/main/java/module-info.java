// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.backoffice.operations.newbooking {

    // Direct dependencies modules
    requires kbs2018.base.client.aggregates;
    requires kbs2018.event.frontoffice.activities.fees;
    requires webfx.platform.async;
    requires webfx.platform.windowhistory;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.ui.operation;

    // Exported packages
    exports org.kadampabookings.kbs2018.operations.routes.newbooking;

}
// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.ecommerce.frontoffice.activities.person {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires kbs2018.ecommerce.client.bookingprocess;
    requires kbs2018.ecommerce.client.businesslogic;
    requires kbs2018.ecommerce.frontoffice.activities.summary;
    requires kbs2018.event.client.sectionpanel;
    requires modality.base.client.activity;
    requires modality.base.client.util;
    requires modality.base.client.validation;
    requires modality.crm.client.personaldetails;
    requires webfx.extras.util.animation;
    requires webfx.extras.util.layout;
    requires webfx.extras.util.scene;
    requires webfx.kit.util;
    requires webfx.platform.windowhistory;
    requires webfx.stack.authn;
    requires webfx.stack.i18n.controls;
    requires webfx.stack.orm.domainmodel.activity;
    requires webfx.stack.routing.uirouter;
    requires webfx.stack.session.state.client.fx;
    requires webfx.stack.ui.controls;

    // Exported packages
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.person;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.person.routing;
    exports org.kadampabookings.kbs2018.ecommerce.frontoffice.operations.person;

    // Provided services
    provides dev.webfx.stack.routing.uirouter.UiRoute with org.kadampabookings.kbs2018.ecommerce.frontoffice.activities.person.PersonUiRoute;

}
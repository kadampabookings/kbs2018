// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.base.client.sessionrecorder {

    // Direct dependencies modules
    requires javafx.base;
    requires modality.crm.shared.authn;
    requires webfx.platform.boot;
    requires webfx.platform.console;
    requires webfx.platform.storage;
    requires webfx.platform.useragent;
    requires webfx.stack.com.bus;
    requires webfx.stack.orm.datasourcemodel.service;
    requires webfx.stack.orm.entity;
    requires webfx.stack.session.state.client.fx;

    // Exported packages
    exports org.kadampabookings.kbsx.base.client.jobs.sessionrecorder;

    // Provided services
    provides dev.webfx.platform.boot.spi.ApplicationJob with org.kadampabookings.kbsx.base.client.jobs.sessionrecorder.ClientSessionRecorderJob;

}
// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.base.server.systemmetrics {

    // Direct dependencies modules
    requires java.base;
    requires kbsx.base.shared.entities;
    requires webfx.platform.boot;
    requires webfx.platform.console;
    requires webfx.platform.scheduler;
    requires webfx.platform.util;
    requires webfx.stack.db.submit;
    requires webfx.stack.orm.datasourcemodel.service;
    requires webfx.stack.orm.domainmodel;
    requires webfx.stack.orm.entity;

    // Exported packages
    exports org.kadampabookings.kbsx.base.server.jobs.systemmetrics;
    exports org.kadampabookings.kbsx.base.server.services.systemmetrics;
    exports org.kadampabookings.kbsx.base.server.services.systemmetrics.spi;

    // Used services
    uses org.kadampabookings.kbsx.base.server.services.systemmetrics.spi.SystemMetricsServiceProvider;

    // Provided services
    provides dev.webfx.platform.boot.spi.ApplicationJob with org.kadampabookings.kbsx.base.server.jobs.systemmetrics.SystemMetricsRecorderJob;

}
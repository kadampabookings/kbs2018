// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbsx.base.server.systemmetrics.java {

    // Direct dependencies modules
    requires jdk.management;
    requires kbsx.base.server.systemmetrics;
    requires kbsx.base.shared.entities;

    // Exported packages
    exports org.kadampabookings.kbsx.base.server.services.systemmetrics.spi.java;

    // Provided services
    provides org.kadampabookings.kbsx.base.server.services.systemmetrics.spi.SystemMetricsServiceProvider with org.kadampabookings.kbsx.base.server.services.systemmetrics.spi.java.JavaSystemMetricsServiceProvider;

}
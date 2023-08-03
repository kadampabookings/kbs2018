// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.base.server.systemmetrics.java {

    // Direct dependencies modules
    requires jdk.management;
    requires kbs2018.base.server.systemmetrics;
    requires kbs2018.base.shared.entities;

    // Exported packages
    exports org.kadampabookings.kbs2018.base.server.services.systemmetrics.spi.java;

    // Provided services
    provides org.kadampabookings.kbs2018.base.server.services.systemmetrics.spi.SystemMetricsServiceProvider with org.kadampabookings.kbs2018.base.server.services.systemmetrics.spi.java.JavaSystemMetricsServiceProvider;

}
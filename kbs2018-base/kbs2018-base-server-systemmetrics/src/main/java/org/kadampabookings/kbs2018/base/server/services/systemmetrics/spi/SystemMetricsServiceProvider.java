package org.kadampabookings.kbs2018.base.server.services.systemmetrics.spi;

import org.kadampabookings.kbs2018.base.shared.services.systemmetrics.SystemMetrics;

/**
 * @author Bruno Salmon
 */
public interface SystemMetricsServiceProvider {

    void takeSystemMetricsSnapshot(SystemMetrics systemMetrics);

}

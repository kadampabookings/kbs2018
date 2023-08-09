package org.kadampabookings.kbsx.base.server.services.systemmetrics.spi;

import org.kadampabookings.kbsx.base.shared.services.systemmetrics.SystemMetrics;

/**
 * @author Bruno Salmon
 */
public interface SystemMetricsServiceProvider {

    void takeSystemMetricsSnapshot(SystemMetrics systemMetrics);

}

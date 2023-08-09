package org.kadampabookings.kbsx.base.server.services.systemmetrics;

import org.kadampabookings.kbsx.base.server.services.systemmetrics.spi.SystemMetricsServiceProvider;
import org.kadampabookings.kbsx.base.shared.services.systemmetrics.SystemMetrics;
import dev.webfx.platform.util.serviceloader.SingleServiceProvider;

import java.util.ServiceLoader;

/**
 * @author Bruno Salmon
 */
public final class SystemMetricsService {

    public static SystemMetricsServiceProvider getProvider() {
        return SingleServiceProvider.getProvider(SystemMetricsServiceProvider.class, () -> ServiceLoader.load(SystemMetricsServiceProvider.class), SingleServiceProvider.NotFoundPolicy.TRACE_AND_RETURN_NULL);
    }

    public static void takeSystemMetricsSnapshot(SystemMetrics systemMetrics) {
        getProvider().takeSystemMetricsSnapshot(systemMetrics);
    }

}

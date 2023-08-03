package org.kadampabookings.kbs2018.event.frontoffice.activities.fees.routing;

import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class FeesRouting {

    private final static String PATH = "/book/event/:eventId/fees";

    public static String getPath() {
        return PATH;
    }

    public static String getFeesPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, PATH);
    }

}

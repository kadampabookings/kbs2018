package org.kadampabookings.kbs2018.event.frontoffice.activities.options.routing;

import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class OptionsRouting {

    private static final String PATH = "/book/event/:eventId/options";

    public static String getPath() {
        return PATH;
    }

    public static String getEventOptionsPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, getPath());
    }

}

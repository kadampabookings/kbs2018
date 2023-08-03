package org.kadampabookings.kbs2018.event.frontoffice.activities.terms.routing;

import one.modality.base.client.util.routing.ModalityRoutingUtil;

/**
 * @author Bruno Salmon
 */
public final class TermsRouting {

    private final static String PATH = "/book/event/:eventId/terms";

    public static String getPath() {
        return PATH;
    }

    public static String getTermsPath(Object eventId) {
        return ModalityRoutingUtil.interpolateEventIdInPath(eventId, PATH);
    }

}

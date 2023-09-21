package org.kadampabookings.kbsx.event.backoffice.activities.cloneevent;

import org.kadampabookings.kbsx.event.backoffice.activities.cloneevent.routing.CloneEventRouting;
import dev.webfx.stack.orm.domainmodel.activity.domainpresentation.impl.DomainPresentationActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;

/**
 * @author Bruno Salmon
 */
public final class CloneEventUiRoute extends UiRouteImpl {

    public CloneEventUiRoute() {
        super(uiRoute());
    }

    public static UiRoute<?> uiRoute() {
        return UiRoute.create(CloneEventRouting.getPath()
                , true
                , CloneEventActivity::new
                , DomainPresentationActivityContextFinal::new
        );
    }
}

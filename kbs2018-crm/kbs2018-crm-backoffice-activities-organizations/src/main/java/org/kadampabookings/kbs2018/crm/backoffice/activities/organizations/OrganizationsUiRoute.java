package org.kadampabookings.kbs2018.crm.backoffice.activities.organizations;

import org.kadampabookings.kbs2018.crm.backoffice.activities.organizations.routing.OrganizationsRouting;
import dev.webfx.stack.orm.domainmodel.activity.domainpresentation.impl.DomainPresentationActivityContextFinal;
import dev.webfx.stack.routing.uirouter.UiRoute;
import dev.webfx.stack.routing.uirouter.impl.UiRouteImpl;

/**
 * @author Bruno Salmon
 */
public final class OrganizationsUiRoute extends UiRouteImpl {

    public OrganizationsUiRoute() {
        super(uiRoute());
    }

    public static UiRoute<?> uiRoute() {
        return UiRoute.create(OrganizationsRouting.getPath()
                , false
                , OrganizationsActivity::new
                , DomainPresentationActivityContextFinal::new
        );
    }
}

// File managed by WebFX (DO NOT EDIT MANUALLY)
package dev.webfx.platform.resource.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;
import dev.webfx.platform.resource.spi.impl.gwt.GwtResourceBundleBase;

public interface GwtEmbedResourcesBundle extends ClientBundle {

    GwtEmbedResourcesBundle R = GWT.create(GwtEmbedResourcesBundle.class);
    @Source("dev/webfx/platform/meta/exe/exe.properties")
    TextResource r1();

    @Source("images/svg/color/price-tag.svg")
    TextResource r2();

    @Source("images/svg/mono/calendar.svg")
    TextResource r3();

    @Source("images/svg/mono/certificate.svg")
    TextResource r4();

    @Source("images/svg/mono/price-tag.svg")
    TextResource r5();

    @Source("one/modality/base/shared/domainmodel/DomainModelSnapshot.json")
    TextResource r6();



    final class ProvidedGwtResourceBundle extends GwtResourceBundleBase {
        public ProvidedGwtResourceBundle() {
            registerResource("dev/webfx/platform/meta/exe/exe.properties", R.r1());
            registerResource("images/svg/color/price-tag.svg", R.r2());
            registerResource("images/svg/mono/calendar.svg", R.r3());
            registerResource("images/svg/mono/certificate.svg", R.r4());
            registerResource("images/svg/mono/price-tag.svg", R.r5());
            registerResource("one/modality/base/shared/domainmodel/DomainModelSnapshot.json", R.r6());

        }
    }
}

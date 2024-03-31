// File managed by WebFX (DO NOT EDIT MANUALLY)
package dev.webfx.platform.resource.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;
import dev.webfx.platform.resource.spi.impl.gwt.GwtResourceBundleBase;

public interface GwtEmbedResourcesBundle extends ClientBundle {

    GwtEmbedResourcesBundle R = GWT.create(GwtEmbedResourcesBundle.class);
    @Source("dev/webfx/platform/conf/src-root.properties")
    TextResource r1();

    @Source("dev/webfx/platform/meta/exe/exe.properties")
    TextResource r2();

    @Source("dev/webfx/stack/i18n/en.properties")
    TextResource r3();

    @Source("dev/webfx/stack/i18n/fr.properties")
    TextResource r4();

    @Source("images/svg/color/price-tag.svg")
    TextResource r5();

    @Source("images/svg/mono/calendar.svg")
    TextResource r6();

    @Source("images/svg/mono/certificate.svg")
    TextResource r7();

    @Source("images/svg/mono/price-tag.svg")
    TextResource r8();

    @Source("one/modality/base/shared/domainmodel/DomainModelSnapshot.json")
    TextResource r9();



    final class ProvidedGwtResourceBundle extends GwtResourceBundleBase {
        public ProvidedGwtResourceBundle() {
            registerResource("dev/webfx/platform/conf/src-root.properties", R.r1());
            registerResource("dev/webfx/platform/meta/exe/exe.properties", R.r2());
            registerResource("dev/webfx/stack/i18n/en.properties", R.r3());
            registerResource("dev/webfx/stack/i18n/fr.properties", R.r4());
            registerResource("images/svg/color/price-tag.svg", R.r5());
            registerResource("images/svg/mono/calendar.svg", R.r6());
            registerResource("images/svg/mono/certificate.svg", R.r7());
            registerResource("images/svg/mono/price-tag.svg", R.r8());
            registerResource("one/modality/base/shared/domainmodel/DomainModelSnapshot.json", R.r9());

        }
    }
}

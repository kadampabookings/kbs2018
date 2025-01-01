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

    @Source("dev/webfx/stack/i18n/ca.properties")
    TextResource r3();

    @Source("dev/webfx/stack/i18n/de.properties")
    TextResource r4();

    @Source("dev/webfx/stack/i18n/en.properties")
    TextResource r5();

    @Source("dev/webfx/stack/i18n/fr.properties")
    TextResource r6();

    @Source("dev/webfx/stack/i18n/pt.properties")
    TextResource r7();

    @Source("dev/webfx/stack/i18n/sp.properties")
    TextResource r8();

    @Source("dev/webfx/stack/i18n/vi.properties")
    TextResource r9();

    @Source("images/svg/color/price-tag.svg")
    TextResource r10();

    @Source("images/svg/mono/calendar.svg")
    TextResource r11();

    @Source("images/svg/mono/certificate.svg")
    TextResource r12();

    @Source("images/svg/mono/price-tag.svg")
    TextResource r13();

    @Source("one/modality/base/shared/domainmodel/DomainModelSnapshot.json")
    TextResource r14();



    final class ProvidedGwtResourceBundle extends GwtResourceBundleBase {
        public ProvidedGwtResourceBundle() {
            registerResource("dev/webfx/platform/conf/src-root.properties", R.r1());
            registerResource("dev/webfx/platform/meta/exe/exe.properties", R.r2());
            registerResource("dev/webfx/stack/i18n/ca.properties", R.r3());
            registerResource("dev/webfx/stack/i18n/de.properties", R.r4());
            registerResource("dev/webfx/stack/i18n/en.properties", R.r5());
            registerResource("dev/webfx/stack/i18n/fr.properties", R.r6());
            registerResource("dev/webfx/stack/i18n/pt.properties", R.r7());
            registerResource("dev/webfx/stack/i18n/sp.properties", R.r8());
            registerResource("dev/webfx/stack/i18n/vi.properties", R.r9());
            registerResource("images/svg/color/price-tag.svg", R.r10());
            registerResource("images/svg/mono/calendar.svg", R.r11());
            registerResource("images/svg/mono/certificate.svg", R.r12());
            registerResource("images/svg/mono/price-tag.svg", R.r13());
            registerResource("one/modality/base/shared/domainmodel/DomainModelSnapshot.json", R.r14());

        }
    }
}

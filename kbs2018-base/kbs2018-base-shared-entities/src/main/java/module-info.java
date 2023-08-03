// File managed by WebFX (DO NOT EDIT MANUALLY)

module kbs2018.base.shared.entities {

    // Direct dependencies modules
    requires java.base;
    requires kbs2018.hotel.shared.time;
    requires modality.base.shared.entities;
    requires webfx.platform.util;
    requires webfx.stack.orm.entity;

    // Exported packages
    exports org.kadampabookings.kbs2018.base.shared.entities;
    exports org.kadampabookings.kbs2018.base.shared.entities.impl;
    exports org.kadampabookings.kbs2018.base.shared.entities.markers;
    exports org.kadampabookings.kbs2018.base.shared.services.systemmetrics;

    // Provided services
    provides dev.webfx.stack.orm.entity.EntityFactoryProvider with org.kadampabookings.kbs2018.base.shared.entities.impl.DateInfoImpl.ProvidedFactory, org.kadampabookings.kbs2018.base.shared.entities.impl.EventImpl.ProvidedFactory, org.kadampabookings.kbs2018.base.shared.entities.impl.OptionImpl.ProvidedFactory, org.kadampabookings.kbs2018.base.shared.entities.impl.SystemMetricsEntityImpl.ProvidedFactory;

}
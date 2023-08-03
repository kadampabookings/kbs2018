package org.kadampabookings.kbs2018.base.shared.entities;

import dev.webfx.stack.orm.entity.Entity;
import one.modality.base.shared.entities.Label;
import one.modality.base.shared.entities.markers.*;
import org.kadampabookings.kbs2018.base.shared.entities.markers.EntityHasDateTimeRange;
import org.kadampabookings.kbs2018.base.shared.entities.markers.EntityHasMaxDateTimeRange;
import org.kadampabookings.kbs2018.base.shared.entities.markers.EntityHasMinDateTimeRange;

/**
 * @author Bruno Salmon
 */
public interface DateInfo extends Entity, EntityHasEvent, EntityHasLabel, EntityHasDateTimeRange, EntityHasMinDateTimeRange, EntityHasMaxDateTimeRange {

    Label getFeesBottomLabel();

    Label getFeesPopupLabel();

    Boolean isForceSoldout();

}

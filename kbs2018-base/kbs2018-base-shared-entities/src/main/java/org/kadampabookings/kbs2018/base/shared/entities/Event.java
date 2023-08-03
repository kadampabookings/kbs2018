package org.kadampabookings.kbs2018.base.shared.entities;

import dev.webfx.platform.util.Objects;
import org.kadampabookings.kbs2018.base.shared.entities.markers.EntityHasDateTimeRange;
import org.kadampabookings.kbs2018.base.shared.entities.markers.EntityHasMaxDateTimeRange;
import org.kadampabookings.kbs2018.base.shared.entities.markers.EntityHasMinDateTimeRange;
import org.kadampabookings.kbs2018.hotel.shared.businessdata.time.DateTimeRange;

/**
 * @author Bruno Salmon
 */
public interface Event extends one.modality.base.shared.entities.Event,
        EntityHasDateTimeRange,
        EntityHasMinDateTimeRange,
        EntityHasMaxDateTimeRange {

    default DateTimeRange computeMaxDateTimeRange() {
        return Objects.coalesce(getParsedMaxDateTimeRange(), getParsedDateTimeRange());
    }


}

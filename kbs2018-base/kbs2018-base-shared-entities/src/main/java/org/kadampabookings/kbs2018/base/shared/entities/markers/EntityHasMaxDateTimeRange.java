package org.kadampabookings.kbs2018.base.shared.entities.markers;

import dev.webfx.stack.orm.entity.Entity;
import org.kadampabookings.kbs2018.hotel.shared.businessdata.time.DateTimeRange;

/**
 * @author Bruno Salmon
 */
public interface EntityHasMaxDateTimeRange extends Entity, HasMaxDateTimeRange {

    @Override
    default void setMaxDateTimeRange(String maxDateTimeRange) {
        setFieldValue("maxDateTimeRange", maxDateTimeRange);
    }

    @Override
    default String getMaxDateTimeRange() {
        return getStringFieldValue("maxDateTimeRange");
    }

    default DateTimeRange getParsedMaxDateTimeRange() { // Should be overridden by implementing class to have a cached value
        return DateTimeRange.parse(getMaxDateTimeRange());
    }

}

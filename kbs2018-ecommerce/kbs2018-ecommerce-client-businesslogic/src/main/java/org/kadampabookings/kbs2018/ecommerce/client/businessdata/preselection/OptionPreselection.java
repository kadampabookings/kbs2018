package org.kadampabookings.kbs2018.ecommerce.client.businessdata.preselection;

import org.kadampabookings.kbs2018.hotel.shared.businessdata.time.DateTimeRange;
import org.kadampabookings.kbs2018.hotel.shared.businessdata.time.DayTimeRange;
import org.kadampabookings.kbs2018.base.shared.entities.Option;

/**
 * @author Bruno Salmon
 */
public final class OptionPreselection {
    private final Option option;
    private final DateTimeRange dateTimeRange;
    private final DayTimeRange dayTimeRange;

    OptionPreselection(Option option, String dateTimeRange, String dayTimeRange) {
        this(option, DateTimeRange.parse(dateTimeRange), dayTimeRange);
    }

    OptionPreselection(Option option, DateTimeRange dateTimeRange, String dayTimeRange) {
        this(option, dateTimeRange, DayTimeRange.parse(dayTimeRange));
    }

    OptionPreselection(Option option, DateTimeRange dateTimeRange, DayTimeRange dayTimeRange) {
        this.option = option;
        this.dateTimeRange = dateTimeRange;
        this.dayTimeRange = dayTimeRange;
    }

    public Option getOption() {
        return option;
    }

    public DateTimeRange getDateTimeRange() {
        return dateTimeRange;
    }

    public DayTimeRange getDayTimeRange() {
        return dayTimeRange;
    }

}

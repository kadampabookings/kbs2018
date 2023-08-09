package org.kadampabookings.kbsx.event.client.businessdata.calendar.impl;

import org.kadampabookings.kbsx.hotel.shared.businessdata.time.TimeInterval;
import org.kadampabookings.kbsx.event.client.businessdata.calendar.Calendar;
import org.kadampabookings.kbsx.event.client.businessdata.calendar.CalendarTimeline;

import java.util.Collection;

/**
 * @author Bruno Salmon
 */
public final class CalendarImpl implements Calendar {

    private final TimeInterval period;
    private final Collection<CalendarTimeline> timelines;

    public CalendarImpl(TimeInterval period, Collection<CalendarTimeline> timelines) {
        this.period = period;
        this.timelines = timelines;
    }

    @Override
    public TimeInterval getPeriod() {
        return period;
    }

    @Override
    public Collection<CalendarTimeline> getTimelines() {
        return timelines;
    }
}

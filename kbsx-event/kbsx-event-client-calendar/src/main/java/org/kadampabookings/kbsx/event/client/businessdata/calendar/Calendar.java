package org.kadampabookings.kbsx.event.client.businessdata.calendar;

import org.kadampabookings.kbsx.hotel.shared.businessdata.time.TimeInterval;

import java.util.Collection;

/**
 * @author Bruno Salmon
 */
public interface Calendar {

    TimeInterval getPeriod();

    Collection<CalendarTimeline> getTimelines();

}

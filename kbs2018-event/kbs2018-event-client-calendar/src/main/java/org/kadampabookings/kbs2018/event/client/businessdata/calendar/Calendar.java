package org.kadampabookings.kbs2018.event.client.businessdata.calendar;

import org.kadampabookings.kbs2018.hotel.shared.businessdata.time.TimeInterval;

import java.util.Collection;

/**
 * @author Bruno Salmon
 */
public interface Calendar {

    TimeInterval getPeriod();

    Collection<CalendarTimeline> getTimelines();

}

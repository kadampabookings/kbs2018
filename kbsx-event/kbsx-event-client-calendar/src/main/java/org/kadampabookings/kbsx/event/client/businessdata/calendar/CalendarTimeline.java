package org.kadampabookings.kbsx.event.client.businessdata.calendar;

import javafx.beans.property.Property;
import org.kadampabookings.kbsx.hotel.shared.businessdata.time.DateTimeRange;
import org.kadampabookings.kbsx.hotel.shared.businessdata.time.DayTimeRange;
import javafx.scene.paint.Paint;

/**
 * @author Bruno Salmon
 */
public interface CalendarTimeline {

    DateTimeRange getDateTimeRange();

    DayTimeRange getDayTimeRange();

    Property<String> displayNameProperty();

    Paint getBackgroundFill();

    Object getSource();

}

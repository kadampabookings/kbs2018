package org.kadampabookings.kbsx.event.client.controls.calendargraphic;

import org.kadampabookings.kbsx.event.client.businessdata.calendar.Calendar;
import org.kadampabookings.kbsx.event.client.controls.calendargraphic.impl.CalendarGraphicImpl;
import javafx.scene.Node;

/**
 * @author Bruno Salmon
 */
public interface CalendarGraphic extends HasCalendarClickHandlerProperty {

    Calendar getCalendar();

    Node getNode();

    void setCalendar(Calendar calendar);

    static CalendarGraphic create(Calendar calendar) {
        return new CalendarGraphicImpl(calendar);
    }
}

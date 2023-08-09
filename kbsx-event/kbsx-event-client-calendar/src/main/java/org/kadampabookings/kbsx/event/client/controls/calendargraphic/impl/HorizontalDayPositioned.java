package org.kadampabookings.kbsx.event.client.controls.calendargraphic.impl;

import org.kadampabookings.kbsx.event.client.controls.calendargraphic.HasEpochDay;

/**
 * @author Bruno Salmon
 */
interface HorizontalDayPositioned extends HasEpochDay {

    void setXAndWidth(double x, double width);
}

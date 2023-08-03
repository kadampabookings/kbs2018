package org.kadampabookings.kbs2018.event.client.controls.calendargraphic.impl;

import org.kadampabookings.kbs2018.event.client.controls.calendargraphic.HasEpochDay;

/**
 * @author Bruno Salmon
 */
interface HorizontalDayPositioned extends HasEpochDay {

    void setXAndWidth(double x, double width);
}

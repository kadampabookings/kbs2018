package org.kadampabookings.kbs2018.event.client.controls.calendargraphic.impl;

import org.kadampabookings.kbs2018.event.client.controls.calendargraphic.HasDayTimeMinuteInterval;

/**
 * @author Bruno Salmon
 */
interface VerticalDayTimePositioned extends HasDayTimeMinuteInterval {

    void setYAndHeight(double y, double height);
}

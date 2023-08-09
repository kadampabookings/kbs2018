package org.kadampabookings.kbsx.event.frontoffice.activities.program;

import javafx.scene.layout.BorderPane;
import org.kadampabookings.kbsx.base.client.icons.ModalityIcons;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.feesgroup.FeesGroup;
import org.kadampabookings.kbsx.ecommerce.client.businessdata.preselection.OptionsPreselection;
import org.kadampabookings.kbsx.event.client.controls.sectionpanel.SectionPanelFactory;
import org.kadampabookings.kbsx.event.client.controls.bookingcalendar.BookingCalendar;
import org.kadampabookings.kbsx.ecommerce.client.activity.bookingprocess.BookingProcessActivity;
import dev.webfx.extras.util.layout.LayoutUtil;
import dev.webfx.platform.console.Console;

/**
 * @author Bruno Salmon
 */
final class ProgramActivity extends BookingProcessActivity {

    private BookingCalendar bookingCalendar;
    private OptionsPreselection noAccommodationOptionsPreselection;

    @Override
    protected void createViewNodes() {
        super.createViewNodes();
        bookingCalendar = new BookingCalendar(false);
        BorderPane calendarSection = SectionPanelFactory.createSectionPanel(ModalityIcons.calendarMonoSvg16JsonUrl, "Timetable");
        calendarSection.centerProperty().bind(bookingCalendar.calendarNodeProperty());
        verticalStack.getChildren().setAll(calendarSection, LayoutUtil.setMaxWidthToInfinite(backButton));
        showBookingCalendarIfReady();
    }

    private void showBookingCalendarIfReady() {
        if (bookingCalendar != null && noAccommodationOptionsPreselection != null)
            bookingCalendar.createOrUpdateCalendarGraphicFromOptionsPreselection(noAccommodationOptionsPreselection);
    }

    @Override
    protected void startLogic() {
        onEventFeesGroups()
                .onFailure(Console::log)
                .onSuccess(result -> {
                    noAccommodationOptionsPreselection = findNoAccommodationOptionsPreselection(result);
                    showBookingCalendarIfReady();
                });
    }

    private static OptionsPreselection findNoAccommodationOptionsPreselection(FeesGroup[] feesGroups) {
        for (FeesGroup fg : feesGroups) {
            for (OptionsPreselection op : fg.getOptionsPreselections())
                if (!op.hasAccommodation())
                    return op;
        }
        return null;
    }
}

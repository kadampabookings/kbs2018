package org.kadampabookings.kbsx.backoffice.activities.event.clone.openjfx;

import javafx.scene.control.DatePicker;
import one.modality.base.client.util.converters.Converters;
import org.kadampabookings.kbsx.event.backoffice.activities.cloneevent.CloneEventPresentationModel;
import org.kadampabookings.kbsx.event.backoffice.activities.cloneevent.CloneEventPresentationViewActivity;

/**
 * @author Bruno Salmon
 */
final class FxCloneEventPresentationViewActivity extends CloneEventPresentationViewActivity {

    @Override
    protected void createViewNodes(CloneEventPresentationModel pm) {
        super.createViewNodes(pm);
        DatePicker datePicker = new DatePicker();
        datePicker.setPrefWidth(150d);
        gp.getChildren().remove(dateTextField);
        gp.add(datePicker, 1, 1);
        datePicker.valueProperty().bindBidirectional(pm.dateProperty());
        datePicker.setConverter(Converters.dateFormatterStringConverter());
    }

}

package org.kadampabookings.kbsx.event.frontoffice.activities.terms;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import org.kadampabookings.kbsx.ecommerce.client.activity.bookingprocess.BookingProcessPresentationModel;
import dev.webfx.extras.visual.VisualResult;

/**
 * @author Bruno Salmon
 */
final class TermsPresentationModel extends BookingProcessPresentationModel {

    // Display output

    private final Property<VisualResult> termsLetterVisualResultProperty = new SimpleObjectProperty<>();
    Property<VisualResult> termsLetterVisualResultProperty() { return termsLetterVisualResultProperty; }

}

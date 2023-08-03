package org.kadampabookings.kbs2018.catering.backoffice.activities.diningareas;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import one.modality.event.client.activity.eventdependent.EventDependentGenericTablePresentationModel;
import dev.webfx.extras.visual.VisualResult;
import dev.webfx.extras.visual.VisualSelection;

/**
 * @author Bruno Salmon
 */
final class DiningAreasPresentationModel extends EventDependentGenericTablePresentationModel {

    private final ObjectProperty<VisualResult> sittingVisualResultProperty = new SimpleObjectProperty<>();
    public ObjectProperty<VisualResult> sittingVisualResultProperty() { return sittingVisualResultProperty; }

    private final ObjectProperty<VisualResult> rulesVisualResultProperty = new SimpleObjectProperty<>();
    public ObjectProperty<VisualResult> rulesVisualResultProperty() { return rulesVisualResultProperty; }

    private final ObjectProperty<VisualSelection> rulesVisualSelectionProperty = new SimpleObjectProperty<>();
    public ObjectProperty<VisualSelection> rulesVisualSelectionProperty() { return rulesVisualSelectionProperty; }

}

package org.kadampabookings.kbsx.event.frontoffice.activities.terms;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import org.kadampabookings.kbsx.base.client.icons.ModalityIcons;
import org.kadampabookings.kbsx.event.client.controls.sectionpanel.SectionPanelFactory;
import org.kadampabookings.kbsx.ecommerce.client.activity.bookingprocess.BookingProcessPresentationViewActivity;
import dev.webfx.extras.util.layout.LayoutUtil;
import dev.webfx.extras.cell.collator.grid.GridCollator;

/**
 * @author Bruno Salmon
 */
final class TermsPresentationViewActivity extends BookingProcessPresentationViewActivity<TermsPresentationModel> {

    private BorderPane termsPanel;

    @Override
    protected void createViewNodes(TermsPresentationModel pm) {
        super.createViewNodes(pm);
        GridCollator termsLetterCollator = new GridCollator("first", "first");
        termsPanel = SectionPanelFactory.createSectionPanel(ModalityIcons.certificateMonoSvg16JsonUrl, "TermsAndConditions");
        termsPanel.setCenter(LayoutUtil.createVerticalScrollPaneWithPadding(termsLetterCollator));

        termsLetterCollator.visualResultProperty().bind(pm.termsLetterVisualResultProperty());
    }

    @Override
    protected Node assemblyViewNodes() {
        return LayoutUtil.createPadding(new VBox(10, LayoutUtil.setVGrowable(termsPanel), LayoutUtil.setMaxWidthToInfinite(backButton)));
    }
}

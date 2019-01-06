package GameDriver;

import javafx.geometry.Insets;
import javafx.scene.layout.FlowPane;

public class Driver {
    private FlowPane root;

    public Driver() {
        root = new FlowPane();
        root.setPadding(new Insets(20));
    }

    public FlowPane getRoot() {
        return root;
    }
}

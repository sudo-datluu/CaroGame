package GameDriver;

import javafx.scene.Group;

public class Driver {
    public static int WIDTH = 1260, HEIGHT = 630;

    private Group root;

    public Driver() {
        root = new Group();
    }

    public Group getRoot() {
        return root;
    }
}

package GameDriver;

import Board.EventHandle.EventHandle;
import javafx.scene.Group;

public class Driver {
    public static int WIDTH = 1260, HEIGHT = 630;

    private Group root;

    private EventHandle eventHandle;

    public Driver() {
        root = new Group();
        eventHandle = new EventHandle();
    }

    public EventHandle getEventHandle() {
        return eventHandle;
    }

    public Group getRoot() {
        return root;
    }
}

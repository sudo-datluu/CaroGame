package Board;

import GameDriver.Driver;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;

public class Board {
    private Driver driver;

    public Board(Driver _driver) {
        driver = _driver;
        loadSquareIMG();
    }

    private void loadSquareIMG() {
        //Load Image
        InputStream input = Board.class.getResourceAsStream("Square.jpg");
        Image imageSquare = new Image(input);

        //Image View
        ImageView imageView = new ImageView(imageSquare);
        imageView.setScaleX(0.05);
        imageView.setScaleY(0.05);

        //Add image to root
        driver.getRoot().getChildren().addAll(imageView);
    }

}

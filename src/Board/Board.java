package Board;

import GameDriver.Driver;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;

public class Board {
    private Driver driver;

    private static double scaleSize;
    static {
        scaleSize = 45;
    }

    public Board(Driver _driver) {
        driver = _driver;
        loadSquareIMG();
    }

    private void loadSquareIMG() {
        //Load Image
        InputStream input = Board.class.getResourceAsStream("Square.jpg");
        Image imageSquare = new Image(input);

        //Fill the screen
        for (int h = 0; h < 14; h++)
            for (int w = 0; w < 28; w++) {
                //Image View
                ImageView imageView = new ImageView(imageSquare);

                //Set the scale for x and y
                imageView.setFitHeight(scaleSize);
                imageView.setFitWidth(scaleSize);

                //Set Location
                imageView.setX(w * 45);
                imageView.setY(h * 45);

                //Add image to root
                driver.getRoot().getChildren().addAll(imageView);
            }



    }

}

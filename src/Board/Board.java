package Board;

import Board.EventHandle.EventHandle;
import GameDriver.Driver;
import MainPackage.MainDriver;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.InputStream;



public class Board {
    private Driver driver;
    private EventHandle eventHandle;
    //private ArrayList<Image> images = new ArrayList<>();

    private static double scaleSize;

    static {
        scaleSize = 45;
    }

    //Add event handler to the board
    public Board(Driver _driver, EventHandle _eventHandle) {
        driver = _driver;
        eventHandle = _eventHandle;
        //Call the method
        loadSquareIMG();
    }

    private void loadSquareIMG() {
        //Load Image
        InputStream urlSquareIMG = MainDriver.class.getResourceAsStream("Asset/Square.jpg");
        Image imageSquare = new Image(urlSquareIMG);

        //Fill the screen
        for (int h = 0; h < 14; h++)
            for (int w = 0; w < 28; w++) {
                //images.add(imageSquare);

                //Image View
                ImageView imageView = new ImageView(imageSquare);

                double finalW = w * scaleSize;
                double finalH = h * scaleSize;

                //Set event for the image
                imageView.setOnMouseClicked((MouseEvent event) -> eventHandle.eventMouseClick(finalW, finalH));

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

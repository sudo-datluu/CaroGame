import Board.Board;
import GameDriver.Driver;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainDriver extends Application {
    private Driver driver = new Driver();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CaroGame");

        Board board = new Board(driver, driver.getEventHandle());

        Scene scene = new Scene(driver.getRoot(), Driver.WIDTH, Driver.HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        System.out.println(MainDriver.class.getResourceAsStream("Asset/Square.jpg"));
        launch(args);
    }
}

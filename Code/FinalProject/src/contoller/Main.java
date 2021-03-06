package contoller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));
        primaryStage.setTitle("Pizzeria");
        primaryStage.setScene(new Scene(root, 600, 446));
        primaryStage.show();
    }

    public static Stage getPrimary() {
        return primaryStage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}

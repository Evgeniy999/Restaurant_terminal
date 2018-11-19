package contoller;

import entity.Order;
import io.ReadFromFile;
import io.WriteToFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class OrderWindow {

    @FXML
    private TextArea orderStr;
    @FXML
    private Button orderButton;
    @FXML
    private Button historyButton;
    @FXML
    private Button cancel;


    @FXML
    public void showEvent() {
        orderStr.setText("");
        orderStr.setText("" + ReadFromFile.readFile("data/check_list.txt"));

    }

    @FXML
    public void cancel() {
        Controller controller = new Controller();
        controller.launchStartWindow();
    }


    @FXML
    public void showEventHistory() {
        orderStr.setText("");
        orderStr.setText("" + ReadFromFile.readFile("data/history.txt"));

    }

    @FXML
    public void exit() {
        System.exit(0);
    }

    @FXML
    public void launchOrderWindow() {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("orderList.fxml"));
            Main.getPrimary().setScene(new Scene(root, 660, 446));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

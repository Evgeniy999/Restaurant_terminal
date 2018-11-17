package contoller;

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
    private static OrderWindow orderWindow;


    @FXML
    public void showEvent() {
        Controller controller = new Controller();
        orderStr.setText("");
        orderStr.setText(Controller.getOrder().toString());
    }
// кнопка заказ писать в файл и вывод заказа в окно с  помощью чтения
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

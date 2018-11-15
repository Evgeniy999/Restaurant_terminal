package contoller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class OrderWindow {

    @FXML
    private TextArea orderStr;

    @FXML
    public void show(ActionEvent event) {
        String str = Controller.getOrder().toString();
        orderStr.setText(str);
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

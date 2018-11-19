package contoller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class StartWindow {

    @FXML
    private TextField textFieldLogin;

    @FXML
    private TextField textFieldPassword;

    @FXML
    private Button button;

    @FXML
    public void setTextFieldLogin() {
        textFieldLogin.getText();
    }
    @FXML
    public void setTextFieldPassword() {
        textFieldPassword.getText();
    }



    @FXML
    public void startEvent() {
       if (textFieldLogin.getText().equals("1") && textFieldPassword.getText().equals("1")) {
              startWindow();
          }
    }

    @FXML
    public void startWindow() {
     Controller controller = new Controller();
     controller.launchStartWindow();
    }
}

package contoller;

import creater.OrderCreate;
import entity.Order;
import entity.Pizza;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import output.OutputInfo;

import java.io.IOException;


public class Controller {


    public static Order order = new Order();
    private ObservableList<String> typeBoxList = FXCollections.observableArrayList(Pizza.CALZONE, Pizza.NORMAL);

    @FXML
    private ListView<String> list = new ListView<String>();

    private Pizza pizza;

    public Controller() {
    }

    public static Order getOrder() {
        return order;
    }


    @FXML
    private String str;
    @FXML
    private ComboBox typeBox;
    @FXML
    private TextField messege;
    @FXML
    private TextField count;
    @FXML
    private TextArea ing;
    @FXML
    private Button cancel;
    @FXML
    private Button orderButton;
    @FXML
    private Button btn_pepperoni;
    @FXML
    private Button btn_input;
    @FXML
    private Button btn_bacon;
    @FXML
    private Button btn_corn;
    @FXML
    private Button btn_cheese;
    @FXML
    private Button btn_tomato;
    @FXML
    private Button btn_salami;
    @FXML
    private Button btn_garlic;
    @FXML
    private Button btn_olives;
    @FXML
    private TextField numberClient;
    @FXML
    private TextField numberOrder;


    private static Logger logger = LogManager.getLogger();


    @FXML
    private void initialize() {
        typeBox.getItems().addAll(Pizza.CALZONE, Pizza.NORMAL);
    }

    @FXML
    public void createButton(
    ) {
        pizza = new Pizza();
        list.setItems(typeBoxList);
        btn_pepperoni.setDisable(false);
        btn_input.setDisable(false);
        typeBox.setDisable(false);
        btn_bacon.setDisable(false);
        btn_corn.setDisable(false);
        btn_cheese.setDisable(false);
        btn_tomato.setDisable(false);
        btn_salami.setDisable(false);
        btn_garlic.setDisable(false);
        btn_olives.setDisable(false);
        orderButton.setDisable(false);
    }

    public void setTypeButton() {
        String str = ing.getText();
        ing.setText("");
        if (typeBox.getSelectionModel().isSelected(0)) {
            pizza.setType(false);
            ing.setText(str + Pizza.CALZONE + "\n");
        } else {
            pizza.setType(true);
            ing.setText(str + Pizza.NORMAL + "\n");
        }

    }

    @FXML
    public void beconButton() {
        pizza.addIngredient("BACON");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "BACON\n");
    }

    @FXML
    public void cheeseButton() {
        pizza.addIngredient("CHEESE");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "CHEESE\n");
    }

    @FXML
    public void garlicButton() {
        pizza.addIngredient("GARLIC");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "GARLIC\n");
    }

    @FXML
    public void olivesButton() {
        pizza.addIngredient("OLIVES");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "OLIVES\n");

    }

    @FXML
    public void tomatoButton() {
        pizza.addIngredient("TOMATO_PASTE");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "TOMATO_PASTE\n");
    }

    @FXML
    public void pepperoniButton() {
        pizza.addIngredient("PEPPERONI");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "PEPPERONI\n");
    }

    @FXML
    public void cornButton() {
        pizza.addIngredient("CORN");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "CORN\n");
    }

    @FXML
    public void salamiButton() {
        pizza.addIngredient("SALAMI");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "SALAMI\n");
    }


    @FXML
    public void setNumberButton() {
        String str = new String();
        str = count.getText();
        pizza.setAmount(Integer.valueOf(str));
        String str1 = ing.getText();
        ing.setText("");
        ing.setText(str1 + "Amount - " + str + "\n");
    }

    @FXML
    public void setName() {
        String str = new String();
        str = messege.getText();
        pizza.setName(str);
        String str1 = ing.getText();
        ing.setText("");
        ing.setText(str1 + "Name - " + str + "\n");
    }

    @FXML
    public void setOrder() {
        String str = numberOrder.getText();
        order.setNumberOrder(Integer.parseInt(str));
        String str1 = ing.getText();
        ing.setText("");
        ing.setText(str1 + "Number order - " + str + "\n");
    }

    @FXML
    public void setNumberClient() {
        String str = numberClient.getText();
        order.setNumberClient(Integer.parseInt(str));
        String str1 = ing.getText();
        ing.setText("");
        ing.setText(str1 + "Number client - " + str + "\n");
    }


    @FXML
    public void createOrder() {
        order.addPizza(pizza);
        OrderWindow orderWindow = new OrderWindow();
        orderWindow.launchOrderWindow();
        OutputInfo.outputOrderList("data/check_list.txt", order);
        OutputInfo.output("data/history.txt", order);
    }

    @FXML
    public void launchStartWindow() {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Main.getPrimary().setScene(new Scene(root, 600, 446));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void launchReturnMain() {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("start.fxml"));
            Main.getPrimary().setScene(new Scene(root, 600, 446));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

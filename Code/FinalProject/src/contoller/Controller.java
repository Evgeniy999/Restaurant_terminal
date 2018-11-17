package contoller;

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

import java.io.IOException;


public class Controller {


    private static Order order;
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
    private Button zakaz;
    @FXML
    private Button btn_pepperoni;

    private static Logger logger = LogManager.getLogger();


   @FXML
   private void initialize (){
       typeBox.getItems().addAll(Pizza.CALZONE,Pizza.NORMAL);
   }
    @FXML
    public void createButton(
    ) {
        pizza = new Pizza();
        list.setItems(typeBoxList);
        btn_pepperoni.setDisable(false);
    }

    public void setTypeButton() {
        String str = ing.getText();
        ing.setText("");
       if(typeBox.getSelectionModel().isSelected(0)){
           pizza.setType(false);
           ing.setText(str + Pizza.CALZONE +"\n");
       }
       else {
           pizza.setType(true);
           ing.setText(str + Pizza.NORMAL+"\n");
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
        ing.setText(str1 + "amount-" + str + "\n");
    }
    @FXML
    public void setName(){
        String str = new String();
        str = messege.getText();
        pizza.setName(str);
        String str1 = ing.getText();
        ing.setText("");
        ing.setText(str1 + "name-" + str + "\n");
    }

    @FXML
    public void setOrder() {
        order.setNumberOrder(10000);
        order.setNumberClient(4711);
        order.addPizza(pizza);
    }

    @FXML
    public void show() {
        setOrder();
        logger.info(order.toString());
    }
    @FXML
    public void createOrder(){
       OrderWindow orderWindow = new OrderWindow();
       orderWindow.launchOrderWindow();
    }


}

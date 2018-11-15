package contoller;

import entity.Order;
import entity.Pizza;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;

public class Controller {


    private ObservableList<String> typeBoxList = FXCollections.observableArrayList(Pizza.CALZONE, Pizza.NORMAL);

    @FXML
    private ListView<String> list = new ListView<String>();

    //List<Pizza> pizzas = new ArrayList<>();
    private Pizza pizza;

    public static Order getOrder() {
        return order;
    }

    private static Order order;
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
    private static Logger logger = LogManager.getLogger();


   @FXML
   private void initialize (){
       typeBox.getItems().addAll(Pizza.CALZONE,Pizza.NORMAL);
   }
    @FXML
    public void createButton(ActionEvent event) {
        pizza = new Pizza();
        list.setItems(typeBoxList);
    }

    public void setTypeButton(ActionEvent event) {
        String str = ing.getText();
        ing.setText("");
       if(Pizza.CALZONE.equals(list.getSelectionModel().getSelectedItem())){
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
    public void cheeseButton(ActionEvent event) {
        pizza.addIngredient("CHEESE");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "CHEESE\n");
    }

    @FXML
    public void garlicButton(ActionEvent event) {
        pizza.addIngredient("GARLIC");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "GARLIC\n");
    }

    @FXML
    public void olivesButton(ActionEvent event) {
        pizza.addIngredient("OLIVES");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "OLIVES\n");

    }

    @FXML
    public void tomatoButton(ActionEvent event) {
        pizza.addIngredient("TOMATO_PASTE");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "TOMATO_PASTE\n");
    }

    @FXML
    public void pepperoniButton(ActionEvent event) {
        pizza.addIngredient("PEPPERONI");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "PEPPERONI\n");
    }

    @FXML
    public void cornButton(ActionEvent event) {
        pizza.addIngredient("CORN");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "CORN\n");
    }

    @FXML
    public void salamiButton(ActionEvent event) {
        pizza.addIngredient("SALAMI");
        String str = ing.getText();
        ing.setText("");
        ing.setText(str + "SALAMI\n");
    }



    @FXML
    public void setNumberButton(ActionEvent event) {
        String str = new String();
        str = count.getText();
        pizza.setAmount(Integer.valueOf(str));
        String str1 = ing.getText();
        ing.setText("");
        ing.setText(str1 + "amount-" + str + "\n");
    }
    @FXML
    public void setName(ActionEvent event){
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
    public void show(ActionEvent event) {
        setOrder();
        logger.info(order.toString());
    }
    @FXML
    public void createOrder(ActionEvent event){
       new OrderWindow().launchOrderWindow();
    }


}

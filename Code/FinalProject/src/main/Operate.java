package main;


import entity.Order;
import entity.Pizza;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Operate {

     private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {




        Pizza pizza1 = new Pizza();
        pizza1.setName("Ferio 17");
        pizza1.setType(true);
        pizza1.addIngredient("BACON");
        pizza1.addIngredient("CHEESE");
        pizza1.addIngredient("GARLIC");
        pizza1.addIngredient("OLIVES");
        pizza1.addIngredient("TOMATO_PASTE");
        pizza1.addIngredient("PEPPERONI");
        pizza1.setAmount(2);

        Pizza pizza2 = new Pizza();
        pizza2.setName("Italiano 2");
        pizza2.setType(false);
        pizza2.addIngredient("BACON");
        pizza2.addIngredient("CHEESE");
        pizza2.addIngredient("GARLIC");
        pizza2.addIngredient("CORN");
        pizza2.addIngredient("OLIVES");
        pizza2.setAmount(3);

        Order order = new Order();
        order.setNumberOrder(10000);
        order.setNumberClient(4711);
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        logger.info(order.toString());

        /*ArrayList<Order> orders;
        ArrayList<String> strings;
        strings = ReadFromFile.readFile("inputFile/data.txt");
        orders = OrderCreate.toCreate(StringParse.toParse(strings));
        OutputInfo.output("outputFile/check_list.txt", orders);*/
    }
}

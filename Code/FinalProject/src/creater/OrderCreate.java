package creater;


import entity.Order;
import entity.Pizza;

import java.util.ArrayList;

public class OrderCreate {

    public static Order toCreate(String[] data) {
        Order order = new Order();
        Pizza pizza = new Pizza();
        for (int i = 0; i < data.length; i++) {
            switch (i) {
                case 0:
                    order.setNumberOrder(Integer.parseInt(data[i]));
                    break;
                case 1:
                    order.setNumberClient(Integer.parseInt(data[i]));
                    break;
                case 2:
                    pizza.setName(data[i]);
                    break;
                case 3:
                    pizza.setType(Boolean.valueOf(data[i]));
                    break;
                case 4:
                    pizza.setAmount(Integer.parseInt(data[i]));
                    break;
                default:
                    pizza.addIngredient(data[i]);
            }
        }
        order.addPizza(pizza);
        return order;
    }

    public static ArrayList<Order> toCreate(ArrayList<String[]> data) {
        ArrayList<Order> orders = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            Order order = new Order();
            Pizza pizza = new Pizza();
            for (int j = 0; j < data.get(i).length; j++) {
                switch (j) {
                    case 0:
                        order.setNumberOrder(Integer.parseInt(data.get(i)[j]));
                        break;
                    case 1:
                        order.setNumberClient(Integer.parseInt(data.get(i)[j]));
                        break;
                    case 2:
                        pizza.setName(data.get(i)[j]);
                        break;
                    case 3:
                        pizza.setType(Boolean.valueOf(data.get(i)[j]));
                        break;
                    case 4:
                        pizza.setAmount(Integer.parseInt(data.get(i)[j]));
                        break;
                    default:
                        pizza.addIngredient(data.get(i)[j]);
                }
            }
            order.addPizza(pizza);
            orders.add(order);
        }
        return orders;
    }
}

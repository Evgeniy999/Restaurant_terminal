package test.tritpo.pizzeria;

import entity.Order;
import entity.Pizza;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class ActionOrderTest {

    private Order order;

    @BeforeClass
    public void setUp() {
        order = new Order();
    }

    @DataProvider(name = "setData")
    public Object[][] setData() {
        order = new Order();
        order.setNumberOrder(10000);
        order.setNumberClient(4711);
        order.getTime();
        Pizza pizza = new Pizza();
        pizza.setName("Ferio17");
        pizza.setType(true);
        pizza.addIngredient("BACON");
        pizza.addIngredient("CHEESE");
        pizza.addIngredient("GARLIC");
        pizza.addIngredient("OLIVES");
        pizza.addIngredient("PEPPERONI");
        pizza.addIngredient("TOMATO_PASTE");
        pizza.setAmount(2);
        order.addPizza(pizza);
        return new Object[][]{{order}};
    }

    @Test(dataProvider = "setData")
    public void createOrder(Order order) {
        String infoData = order.toString();
        LocalTime time = LocalTime.now();
        String testText = "\n***********************************\n" +
                "Время заказа: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + "\n" +
                "Заказ: 10000\n" +
                "Клиент: 4711\n" +
                "Название: Ferio17\n" +
                "-----------------------------------\n" +
                "Pizza Base (Normal) 1.0$\r\n" +
                "BACON               1.2$\r\n" +
                "CHEESE              1.0$\r\n" +
                "GARLIC              0.3$\r\n" +
                "OLIVES              0.5$\r\n" +
                "PEPPERONI           0.6$\r\n" +
                "TOMATO_PASTE        1.0$\r\n" +
                "-----------------------------------\n" +
                "Всего: 5.6$\n" +
                "Кол-во: 2\n" +
                "Общая сумма: 11,20$\n" +
                "***********************************\n";
        Assert.assertEquals(testText, infoData);
    }
}

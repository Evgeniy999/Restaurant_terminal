package entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Order {
    private static Logger logger = LogManager.getLogger();
    public static final int MIN_VALUE = 9999;
    public static final int MAX_VALUE = 100000;
    private int numberOrder;
    private int numberClient;
    private List<Pizza> order = new ArrayList<>();
    private LocalTime time = LocalTime.now();

    void checkNumberOrder(int number) {
        if (number < MIN_VALUE || number > MAX_VALUE) {
            logger.info("The orderOut number is not a five-digit number!");
        }
    }

    public void addPizza(Pizza pizza) {
        order.add(pizza);
    }

    public void setNumberOrder(int numberOrder) {
        checkNumberOrder(numberOrder);
        this.numberOrder = numberOrder;
    }

    public void setNumberClient(int numberClient) {
        this.numberClient = numberClient;
    }

    double sumResult(int i) {
        double sum = 0;
        for (Ingredient s : order.get(i).getPizza()) {
            sum = sum + s.getPrice();
        }
        sum = sum + order.get(i).getPriceType();
        return sum;
    }

    public StringBuilder output() {
        double sum = 0;
        StringBuilder str = new StringBuilder();
        Formatter formatter = new Formatter();
        str.append("\n***********************************\n");
        str.append("Время заказа: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + "\n");
        str.append("Заказ: " + numberOrder + "\n");
        str.append("Клиент: " + numberClient + "\n");
        for (int i = 0; i < order.size(); i++) {
            str.append("Название: " + order.get(i).getNamePizza() + "\n");
            str.append("-----------------------------------\n");
            str.append(order.get(i).toString());
            str.append("-----------------------------------\n");
            str.append("Всего: " + sumResult(i) + "$\n");
            str.append("Кол-во: " + order.get(i).getAmount() + "\n");
        }
        for (int i = 0; i < order.size(); i++) {
            sum += sumResult(i) * order.get(i).getAmount();
        }
        str.append("Общая сумма: " + formatter.format("%.2f", sum) + "$\n");
        str.append("***********************************\n");
        return str;
    }

    public int getNumberClient() {
        return numberClient;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public List<Pizza> getOrder() {
        return order;
    }

    public LocalTime getTime() {
        return time;
    }
}

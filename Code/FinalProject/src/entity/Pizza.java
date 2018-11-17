package entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Pizza {
    public static final String REG = "^[A-Za-z0-9-' ']+$";
    private static Logger logger = LogManager.getLogger();

    public static final String NORMAL = "Normal";
    public static final String CALZONE = "Calzone";
    public static final int PRICE_TYPE_NORMAL = 1;
    public static final double PRICE_TYPE_CALZONE = 0.5;
    public static final int MIN_VALUE_INTERVAL = 4;
    public static final int MAX_VALUE_INTERVAL = 20;
    public static final int COUNT_INGREDIENTS = 7;

    private boolean pizzaType;
    private double priceType;
    private String nameType;
    private String namePizza;
    private int amount;
    private List<Ingredient> pizza = new ArrayList<>();

    public void addIngredient(String ingredient) {
        for (Ingredient compare : pizza) {
            if (compare.toString().equals(ingredient)) {
                logger.info("this ingredient already exists!");
                return;
            }
        }
        if (pizza.size() >= COUNT_INGREDIENTS) {
            logger.info("Pizza is full, check the order!");
            return;
        } else {
            switch (ingredient) {
                case "TOMATO_PASTE":
                    pizza.add(Ingredient.TOMATO_PASTE);
                    break;
                case "CHEESE":
                    pizza.add(Ingredient.CHEESE);
                    break;
                case "SALAMI":
                    pizza.add(Ingredient.SALAMI);
                    break;
                case "BACON":
                    pizza.add(Ingredient.BACON);
                    break;
                case "GARLIC":
                    pizza.add(Ingredient.GARLIC);
                    break;
                case "CORN":
                    pizza.add(Ingredient.CORN);
                    break;
                case "PEPPERONI":
                    pizza.add(Ingredient.PEPPERONI);
                    break;
                case "OLIVES":
                    pizza.add(Ingredient.OLIVES);
                    break;
                default:
                    logger.info("there is no such ingredient!");
                    break;
            }
        }
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.namePizza = name;
        int valueLength = name.length();
        boolean onlyLatin = name.matches(REG);
        if (!onlyLatin) {
            logger.info("Title does not contain Latin characters!");
        }
        if (valueLength < MIN_VALUE_INTERVAL || valueLength > MAX_VALUE_INTERVAL) {
            logger.info("Enter a name that is too long or small!");
        }
    }

    public void setType(Boolean pizzaType) {
        this.pizzaType = pizzaType;
        if (pizzaType) {
            this.nameType = NORMAL;
            this.priceType = PRICE_TYPE_NORMAL;
        } else {
            this.nameType = CALZONE;
            this.priceType = PRICE_TYPE_CALZONE;
        }
    }

    public String order() {
        Formatter formatter = new Formatter();
        formatter.format("%-2s%-2s%-2s%2s%1s%n", "Pizza Base (", nameType, ")", priceType, "$");

        for (int i = 0; i < pizza.size(); i++) {
            if (pizzaType) {
                formatter.format("%-20s%-3s%-1s%n", pizza.get(i).name(), pizza.get(i).getPrice(), "$");
            } else {
                formatter.format("%-21s%-3s%-1s%n", pizza.get(i).name(), pizza.get(i).getPrice(), "$");
            }
        }
        return formatter.toString();
    }

    public int getAmount() {
        return amount;
    }

    public List<Ingredient> getPizza() {
        return pizza;
    }

    public String getNamePizza() {
        return namePizza;
    }

    public double getPriceType() {
        return priceType;
    }

    public String getNameType() {
        return nameType;
    }
}

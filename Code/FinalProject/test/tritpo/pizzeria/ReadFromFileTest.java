package tritpo.pizzeria;

import io.ReadFromFile;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ReadFromFileTest {
    @Test
    public void readFile() {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> stringsTest;
        String string1 = "10000 4711 Ferio17 true 2 BACON CHEESE GARLIC OLIVES PEPPERONI TOMATO_PASTE";
        String string2 = "11231 4999 Italiano2 false 3 BACON CHEESE CORN PEPPERONI TOMATO_PASTE";
        strings.add(string1);
        strings.add(string2);
        stringsTest = ReadFromFile.readFile("testFile/data_test.txt");
        Assert.assertEquals(strings, stringsTest);
    }
}

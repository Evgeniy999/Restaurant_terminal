package tritpo.pizzeria;

import org.testng.Assert;
import org.testng.annotations.Test;
import parse.StringParse;

public class StringParseTest {
    @Test
    public void toParse() {
        String string1 = "Welcome to hell!";
        String[] string2 = {"Welcome", "to", "hell!"};
        Assert.assertEquals(string2, StringParse.toParse(string1));
    }
}

package parse;

import java.util.ArrayList;

public class StringParse {

    public static String[] toParse(String line) {
        String[] string;
        string = line.split(" ");
        return string;
    }

    public static ArrayList<String[]> toParse(ArrayList<String> line) {
        ArrayList<String[]> strings = new ArrayList<>();
        for (int i = 0; i < line.size(); i++) {
            String[] string = line.get(i).split(" ");
            strings.add(string);
        }
        return strings;
    }
}

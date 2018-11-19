package output;


import entity.Order;
import io.WriteToFile;

import java.util.ArrayList;

public class OutputInfo {

    public static void output(String nameFile , ArrayList<Order> orders){
        for (int i = 0; i < orders.size(); i++) {
            WriteToFile.writeInformation(nameFile, orders.get(i).toString());
        }
    }
    public static void output(String nameFile , Order order){
            WriteToFile.writeInformation(nameFile, order.output().toString());
    }
    public static void outputOrderList(String nameFile , Order order){
        WriteToFile.writeInformationOrder(nameFile, order.output().toString());
    }
}

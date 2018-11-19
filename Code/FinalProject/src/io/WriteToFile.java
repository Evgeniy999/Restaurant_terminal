package io;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class WriteToFile {
    private static Logger logger = LogManager.getLogger();

    public static void writeInformation(String fileLocation, String data) {
        File file = new File(fileLocation);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(data);
            logger.log(Level.INFO, "Completed successfully!");
            writer.close();
        } catch (FileNotFoundException f) {
            logger.log(Level.INFO, "File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeInformationOrder(String fileLocation, String data) {
        File file = new File(fileLocation);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
            writer.write(data);
            logger.log(Level.INFO, "Completed successfully!");
            writer.close();
        } catch (FileNotFoundException f) {
            logger.log(Level.INFO, "File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

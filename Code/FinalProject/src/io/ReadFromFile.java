package io;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {

    private static Logger logger = LogManager.getLogger();

    public static ArrayList<String> readFile(String nameFile) {
        File file = new File(nameFile);
        ArrayList<String> arrayListStr = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            logger.error("not file!");
        }
        if (scanner != null) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    logger.info("There are empty lines in the project!");
                } else {
                    arrayListStr.add(line);
                }
            }
        }
        return arrayListStr;
    }
}
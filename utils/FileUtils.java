package utils;

import java.io.BufferedReader;
import java.io.FileReader;

public final class FileUtils {
    private FileUtils() { }

    public static void printFileContents__ImproperClose(String filePath) throws Exception {
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = fileReader.readLine()) != null) {
            System.out.println(line);
        }
        fileReader.close();
    }

    public static void printFileContents__ProperClose(String filePath) throws Exception {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

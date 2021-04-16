package src.C30_IO_Work_with_files.ClassEx;

import java.io.FileWriter;
import java.io.IOException;

public class ClassEx2 {
    // Scrierea in fișier v2

    private  static String[] getData() {
        return new String[]{"London", "Bucharest", "Berlin", "Moscow"};
    }

    public static void main(String[] args) throws IOException {
        String[] dataToWrite = getData();

        try(FileWriter outputFile = new FileWriter("output.txt")) {
            for (String city : dataToWrite) {
                outputFile.write(city + " ");
            }
        }
    }
}

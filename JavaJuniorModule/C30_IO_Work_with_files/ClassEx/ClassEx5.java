package src.C30_IO_Work_with_files.ClassEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClassEx5 {

    // Buffered writer
    public static void main(String[] args) throws IOException {
        String[] dataToWrite = new String[]{"London", "Bucharest", "Berlin", "Moscow"};
        try(BufferedWriter outputFile = new BufferedWriter(new FileWriter("C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\output"))) {
            for (String city : dataToWrite) {
                outputFile.write(city + " ");
            }
        }

    }
}

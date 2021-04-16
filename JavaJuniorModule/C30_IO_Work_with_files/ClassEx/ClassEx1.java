package src.C30_IO_Work_with_files.ClassEx;

import java.io.FileWriter;
import java.io.IOException;

public class ClassEx1 {

    // Scrierea in fișier v1

    private  static String[] getData() {
        return new String[]{"London", "Bucharest", "Berlin", "Moscow"};
    }

    public static void main(String[] args) throws IOException {
        String[] dataToWrite = getData();
        FileWriter outputFile = null;

        try {
            // I. open the file (for writing)
            // Note: if the file does not exist, it is created automatically
            outputFile = new FileWriter("C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\output");

            // II. Write the data to file
            for (String city: dataToWrite) {
                outputFile.write(city + " ");
            }

            // III. Close the file afterwards
            outputFile.close();
        } catch (IOException e) {
            System.out.println("Something wrong has happened...");
            e.printStackTrace();
        } finally {
            //III. Close the file afterwards
            try {
                if (outputFile != null) {
                    outputFile.close();
                }
            }catch (IOException e) {
                System.out.println("Exception raised when attempting to close the file");
                e.printStackTrace();
            }


        }

    }

}

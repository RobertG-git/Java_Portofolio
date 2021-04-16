package src.C30_IO_Work_with_files.ClassEx;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ClassEx3 {

    // citirea din fișier

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileReader("C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\input"))) {
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                System.out.println(nextLine);
                // use the next line in program
            }
        }
        // Closing the scanner will automatically close the FileReader
    }
}

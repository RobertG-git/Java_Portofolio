package src.C30_IO_Work_with_files.ClassEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ClassEx4 {

    // BufferedReader

    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\input")))) {
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                System.out.println(nextLine);
            }
        }
    }
}

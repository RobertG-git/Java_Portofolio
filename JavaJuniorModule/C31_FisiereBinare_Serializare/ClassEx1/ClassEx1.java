package src.C31_FisiereBinare_Serializare.ClassEx1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// reading / writing binary files

public class ClassEx1 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream binaryFileIn = new FileInputStream("C:\\Users\\User_principal\\Desktop\\Devmind\\2. " +
                "InteliiJ share\\JavaJuniorModule\\src\\C31_FisiereBinare_Serializare\\input.dat")) {

            System.out.println(binaryFileIn.read());

        }

        try (FileOutputStream binaryFileOut = new FileOutputStream("C:\\Users\\User_principal\\Desktop\\Devmind\\2. " +
                "InteliiJ share\\JavaJuniorModule\\src\\C31_FisiereBinare_Serializare\\output.dat")) {

            byte[] data = new byte[5];
            Arrays.fill(data, (byte) 1);
            binaryFileOut.write(data);

        } catch (IOException e) {
            System.out.println("IOException thrown: " + e.getMessage());
        }
    }
}

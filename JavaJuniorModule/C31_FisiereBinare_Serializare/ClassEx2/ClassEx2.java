package src.C31_FisiereBinare_Serializare.ClassEx2;

import java.io.*;
import java.util.Arrays;

// reading / writing binary files with bufferedStream

public class ClassEx2 {
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream binaryFileIn = new BufferedInputStream(new FileInputStream("C:\\Users\\User_principal\\" +
                "Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C31_FisiereBinare_Serializare\\ClasssEx2\\Input.dat"))) {
            System.out.println(binaryFileIn.read());
        }

        try (BufferedOutputStream binaryFileOut = new BufferedOutputStream(new FileOutputStream("C:\\Users\\User_principal\\" +
                "Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C31_FisiereBinare_Serializare\\ClasssEx2\\Output.dat"))) {
            byte[] data = new byte[5];
            Arrays.fill(data, (byte) 2);

            binaryFileOut.write(data);
        }
    }
}

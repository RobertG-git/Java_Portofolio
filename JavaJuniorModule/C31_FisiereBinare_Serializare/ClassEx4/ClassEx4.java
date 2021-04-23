package src.C31_FisiereBinare_Serializare.ClassEx4;

import java.io.*;
import java.util.ArrayList;

public class ClassEx4 {

    // EOFException e example
    // EOF = End Of File

    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        try (DataOutputStream binaryFileOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
                "C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\" +
                        "C31_FisiereBinare_Serializare\\ClassEx4\\Strings.dat")))) {
            binaryFileOut.writeUTF("Robert");
            binaryFileOut.writeUTF("Ana");
            binaryFileOut.writeUTF("George");
        }

        try(DataInputStream binaryFileIn = new DataInputStream(new BufferedInputStream(new FileInputStream(
                "C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\" +
                        "C31_FisiereBinare_Serializare\\ClassEx4\\Strings.dat")))) {
            while (true) {
                try {
                    strings.add(binaryFileIn.readUTF());
                } catch (EOFException e) {
                    System.out.println("End of file reached!");
                    break;
                }
            }
        }

        System.out.println("The total number of strings is:" + strings.size());
        System.out.println("List of strings is: " + strings.toString());
    }
}

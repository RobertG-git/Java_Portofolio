package src.C31_FisiereBinare_Serializare.ClassEx3;

import java.io.*;
import java.util.Calendar;

public class IOBinary {
    public static void main(String[] args) throws IOException {
        String firstName = "Michael";
        String secondName = "Jordan";
        int birthYear = 1963;
        boolean isMarried = true;
        double netIncome = 258934.218;

        try(DataOutputStream binariFileOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
                "C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C31_Fisiere" +
                        "Binare_Serializare\\ClassEx3\\person.dat")))) {
            binariFileOut.writeUTF(firstName);
            binariFileOut.writeUTF(secondName);
            binariFileOut.writeInt(birthYear);
            binariFileOut.writeBoolean(isMarried);
            binariFileOut.writeDouble(netIncome);
        } catch (IOException e) {
            System.out.println("IOException thrown: " + e.getMessage());
            return;
        }

        try (DataInputStream binaryFileIn = new DataInputStream(new BufferedInputStream(new FileInputStream(
                "C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C31_Fisiere" +
                        "Binare_Serializare\\ClassEx3\\person.dat")))){
            System.out.println("First name: " + binaryFileIn.readUTF());
            System.out.println("Last name: " + binaryFileIn.readUTF());
            int age = Calendar.getInstance().get(Calendar.YEAR) - binaryFileIn.readInt();
            System.out.println("Age: " + age);
            System.out.println("The person is" + (binaryFileIn.readBoolean() ? "" : " not")
                    + " married");
            System.out.println("Net income: " + binaryFileIn.readDouble());

        }
    }
}

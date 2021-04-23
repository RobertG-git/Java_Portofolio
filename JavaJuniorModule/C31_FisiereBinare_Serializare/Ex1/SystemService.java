package src.C31_FisiereBinare_Serializare.Ex1;

import java.io.*;
import java.util.Scanner;

public class SystemService {

    protected static boolean quit(GuestsList programData) throws IOException {
        System.out.println("Program data was successfully saved!");
        System.out.println("The application closes…");
        SystemService.writeToBinaryFile(programData);
        return true;
    }

    protected static String readingLines(Scanner sc) {
        System.out.println(Constants.WAITCOMMAND);
        return sc.nextLine();
    }

    protected static GuestsList guestListCreation(Scanner sc) throws IOException {
        GuestsList devmindBeginner;

        if(SystemService.readFromBinaryFile() == null) {
            System.out.println("Welcome! Enter the number of available seats:");
            devmindBeginner = new GuestsList(sc.nextInt());
            sc.nextLine();
        } else {
            System.out.println(Constants.WELCOME);
            devmindBeginner = SystemService.readFromBinaryFile();
        }

        return devmindBeginner;
    }

    protected static String readLastName (Scanner sc) {
        System.out.println("Enter last name:");
        return sc.nextLine();
    }

    protected static String readFirstName (Scanner sc) {
        System.out.println("Enter first name:");
        return sc.nextLine();
    }

    protected static String readEmail (Scanner sc) {
        System.out.println("Enter email:");
        return sc.nextLine();
    }

    protected static String readPhoneNumber (Scanner sc) {
        System.out.println("Enter phone number (format „+40733386463“):");
        return sc.nextLine();
    }

    protected static int readAuthenticationNumber(Scanner sc) {
        System.out.println("""
                Choose the authentication mode, typing:
                "1" - Name and surname
                "2" - Email
                "3" - Phone number (format "+40733386463")\s""");

        return sc.nextInt();
    }

    protected static int readUpdateNumber(Scanner sc) {
        System.out.println("""
                    Choose the update field by typing:
                    "1" - Name
                    "2" - First name
                    "3" - Email
                    "4" - Phone number (format "+40733386463"))\s""");

        return sc.nextInt();
    }

    protected static String readSubstring (Scanner sc) {
        System.out.println("Please enter the substring to search: ");
        return sc.nextLine();
    }

    protected static void writeToBinaryFile(GuestsList programData) throws IOException {
        try(ObjectOutputStream writeToBinaryFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
                "C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\" +
                        "C31_FisiereBinare_Serializare\\Ex1\\ProgramData.dat")))) {

            writeToBinaryFile.writeObject(programData);
        }
    }

    protected static GuestsList readFromBinaryFile() throws IOException {
        GuestsList programData = null;
        try(ObjectInputStream readToBinaryFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
                "C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\" +
                        "C31_FisiereBinare_Serializare\\Ex1\\ProgramData.dat")))) {

            programData = (GuestsList) readToBinaryFile.readObject();

        } catch (ClassNotFoundException e ) {
            System.out.println("A class not found exception: " + e.getMessage());
        } catch (EOFException e) {
            return programData;
        }
        return programData;
    }

    protected static boolean clearData() throws IOException {
        try(FileWriter binaryFile = new FileWriter(
                "C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\" +
                        "C31_FisiereBinare_Serializare\\Ex1\\ProgramData.dat")) {

            binaryFile.flush();
        }

        System.out.println("Data clear complete!");
        System.out.println("Program restart necessary!");

        return true;
    }
}

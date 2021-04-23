package src.C31_FisiereBinare_Serializare.Ex2;

import java.io.*;

public class SystemService {

    protected static CarRentalSystem carRentalSystemCreation() throws IOException {
        CarRentalSystem rgCarRent = new CarRentalSystem();

        if(SystemService.readFromBinaryFile() == null) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Welcome");
            System.out.println("Program data was loaded!");
            rgCarRent = SystemService.readFromBinaryFile();
        }

        return rgCarRent;
    }

    protected static boolean quit(CarRentalSystem programData) throws IOException {
        System.out.println("Program data was successfully saved!");
        System.out.println("The application closes…");
        SystemService.writeToBinaryFile(programData);
        return true;
    }

    protected static void writeToBinaryFile(CarRentalSystem programData) throws IOException {
        try(ObjectOutputStream writeToBinaryFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
                "C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\" +
                        "C31_FisiereBinare_Serializare\\Ex2\\ProgramData.dat")))) {

            writeToBinaryFile.writeObject(programData);
        }
    }

    protected static CarRentalSystem readFromBinaryFile() throws IOException {
        CarRentalSystem programData = null;
        try(ObjectInputStream readToBinaryFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
                "C:\\Users\\User_principal\\Desktop\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\" +
                        "C31_FisiereBinare_Serializare\\Ex2\\ProgramData.dat")))) {

            programData = (CarRentalSystem) readToBinaryFile.readObject();

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
                        "C31_FisiereBinare_Serializare\\Ex2\\ProgramData.dat")) {

            binaryFile.flush();
        }

        System.out.println("Data clear complete!");
        System.out.println("Program restart necessary!");

        return true;
    }
}

package src.C31_FisiereBinare_Serializare.Ex2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        CarRentalSystem rgCarRent = SystemService.carRentalSystemCreation();

        boolean quit = false;
        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = sc.nextLine();
            switch (command) {
                case "help" -> CarRentalSystem.printCommandsList();
                case "add" -> rgCarRent.rentCar(CarRentalSystem.getPlateNo(), CarRentalSystem.getOwnerName());
                case "check" -> System.out.println(rgCarRent.isCarRent(CarRentalSystem.getPlateNo()));
                case "remove" -> rgCarRent.returnCar(CarRentalSystem.getPlateNo());
                case "getOwner" -> System.out.println(rgCarRent.getCarRent(CarRentalSystem.getPlateNo()));
                case "totalRented" -> System.out.println(rgCarRent.getTotalRented());
                case "getCarsNo" -> rgCarRent.getCarsNo(CarRentalSystem.getOwnerName());
                case "getCarsList" -> rgCarRent.getCarsList(CarRentalSystem.getOwnerName());
                case "clear" -> quit = SystemService.clearData();
                case "quit" -> quit = SystemService.quit(rgCarRent);
                default -> {
                    System.out.println("Unknown command. Chose from:");
                    CarRentalSystem.printCommandsList();
                }
            }
        }
    }
}

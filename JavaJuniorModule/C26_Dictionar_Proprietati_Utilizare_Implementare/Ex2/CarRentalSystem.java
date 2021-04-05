package src.C26_Dictionar_Proprietati_Utilizare_Implementare.Ex2;

import java.util.HashMap;
import java.util.Scanner;

/*
    2 Adauga aplicatiei inca o singura structura de date (hashtable?) care sa mentina evidenta autovehiculelor
        inchiriate de un anumit proprietar. Practic, sistemul va putea raspunde si urmatoarelor cereri:

        getCarsNo <OWNER_NAME> : va returna numarul de masini inchiriate de proprietarul temporar OWNER_NAME
        getCarsList <OWNER_NAME> : va returna lista de masini inchiriate de proprietarul temporar OWNER_NAME

    Hints pentru o posibila implementare:
     - Hashtable-ul va avea tipul <String, RentedCars> unde RentedCars va fi o clasa definita de tine ce va tine evidenta
        numarului de masini si respectiv listei de autovehicule.
     - Pentru o structurare a codului corecta (d.p.d.v. OOP) clasa RentedCars ar trebui sa implementeze toata functionalitatea
        aferenta gestiunii autoturismelor per proprietar.
 */
public class CarRentalSystem {
    private static final Scanner sc = new Scanner(System.in);
    private final HashMap<String, String> rentedCars = new HashMap<>(100, 0.5f);
    private final HashMap<String,RentedCars> rentedCarsByPerson = new HashMap<>();
    private int totalRented = 0;

    public static String getPlateNo() {
        System.out.println("Introduceti numarul de inmatriculare:");
        return sc.nextLine();
    }

    private static String getOwnerName() {
        System.out.println("Introduceti numele proprietarului:");
        return sc.nextLine();
    }

    // search for a key in hashtable
    private boolean isCarRent(String plateNo) {
        return rentedCars.containsKey(plateNo);
    }

    // get the value associated to a key
    private String getCarRent(String plateNo) {
        //3
        if (rentedCars.get(plateNo) == null) {
            return "Masina nu este inchiriata";
        }
        return rentedCars.get(plateNo);

    }

    // add a new (key, value) pair
    private void rentCar(String plateNo, String ownerName) {
        if (isCarRent(plateNo)) {
            System.out.println("Autoturismul este deja închiriat");
            return;
        }
        this.totalRented++;
        if (rentedCarsByPerson.containsKey(ownerName)) {
            rentedCarsByPerson.get(ownerName).addCar(plateNo);
            rentedCars.put(plateNo, ownerName);
            return;
        }
        rentedCarsByPerson.put(ownerName,new RentedCars(plateNo));
        rentedCars.put(plateNo, ownerName);
    }

    // remove an existing(key, value) pair
    private void returnCar(String plateNo) {
        if (isCarRent(plateNo)) {
            System.out.println("Masina a fost stearsa din hashtable");
            totalRented--;
            if (rentedCarsByPerson.get(rentedCars.get(plateNo)).getCarsNo() == 1) {
                rentedCarsByPerson.remove(rentedCars.get(plateNo));
                rentedCars.remove(plateNo);
                return;
            }
            rentedCarsByPerson.get(rentedCars.get(plateNo)).removeCar(plateNo);
            rentedCars.remove(plateNo);

        } else {
            System.out.println("Masina nu este inchiriata");
        }
    }

    // number of total rented cars
    private int getTotalRented() {
        return this.totalRented;
    }

    // get Cars rented by a specific owner
    public void getCarsNo(String ownerName) {
        if (rentedCarsByPerson.containsKey(ownerName)) {
            System.out.println(rentedCarsByPerson.get(ownerName).getCarsNo());
        } else {
            System.out.println("Nu exista un proprietar cu acest nume");
        }
    }

    // get car list rented by a specific owner
    public void getCarsList(String owner) {
        if (rentedCarsByPerson.containsKey(owner)) {
            System.out.println(rentedCarsByPerson.get(owner));
        } else {
            System.out.println("Nici exista o persoana cu acest nume in lista de rented cars");
        }
    }


    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("totalRented  - Afiseaza numarul de masinii inchiriate in total");
        System.out.println("getCarsNo    - Afiseaza numarul de masinii inchiriate de o anumita persoana");
        System.out.println("getCarsList  - Afiseaza lista de masinii inchiriate de o anumita persoana");

        System.out.println("quit         - Inchide aplicatia");
    }

    public void run() {
        boolean quit = false;
        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = sc.nextLine();
            switch (command) {
                case "help" -> printCommandsList();
                case "add" -> rentCar(getPlateNo(), getOwnerName());
                case "check" -> System.out.println(isCarRent(getPlateNo()));
                case "remove" -> returnCar(getPlateNo());
                case "getOwner" -> System.out.println(getCarRent(getPlateNo()));
                case "totalRented" -> System.out.println(getTotalRented());
                case "getCarsNo" -> getCarsNo(getOwnerName());
                case "getCarsList" -> getCarsList(getOwnerName());
                case "quit" -> {
                    System.out.println("Aplicatia se inchide...");
                    quit = true;
                }
                default -> {
                    System.out.println("Unknown command. Chose from:");
                    printCommandsList();
                }
            }
        }
    }

    public static void main(String[] args) {
        // create and run an instance (for test purpose)
        new CarRentalSystem().run();
    }
}

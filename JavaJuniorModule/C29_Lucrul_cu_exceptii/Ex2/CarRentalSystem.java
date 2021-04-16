package src.C29_Lucrul_cu_exceptii.Ex2;

import java.util.HashMap;
import java.util.Scanner;

/*
Actualizeaza implementarea actuala a urmatoarelor teme/proiecte, folosind exceptii acolo unde este cazul:

    [P1] Sistem de gestiune inscrieri
    Car Rental System
    Pentru fiecare aplicatie, implementeaza minim 2 - 3 exceptii.
 */

public class CarRentalSystem {

    private static final Scanner sc = new Scanner(System.in);
    private final HashMap<String, String> rentedCars = new HashMap<>(100, 0.5f);
    private final HashMap<String, RentedCars> rentedCarsByPerson = new HashMap<>();
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
        rentedCarsByPerson.put(ownerName, new RentedCars(plateNo));
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
    public void getCarsNo(String ownerName) throws Exception {
        if (rentedCarsByPerson.containsKey(ownerName)) {
            System.out.println(rentedCarsByPerson.get(ownerName).getCarsNo());
        } else throw new Exception("Nu exista un proprietar cu acest nume");
    }

    // get car list rented by a specific owner
    public void getCarsList(String owner) throws Exception {
        if (rentedCarsByPerson.containsKey(owner)) {
            System.out.println(rentedCarsByPerson.get(owner));
        } else throw new Exception("Nici exista o persoana cu acest nume in lista de rented cars");

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

    public void run() throws Exception {
        String command;

        boolean quit = false;
        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");

            try {
                command = sc.nextLine();

                if (command.equals("help")) printCommandsList();
                if (command.equals("add")) rentCar(getPlateNo(), getOwnerName());
                if (command.equals("check")) System.out.println(isCarRent(getPlateNo()));
                if (command.equals("remove")) returnCar(getPlateNo());
                if (command.equals("getOwner")) System.out.println(getCarRent(getPlateNo()));
                if (command.equals("totalRented")) System.out.println(getTotalRented());
                if (command.equals("getCarsNo")) getCarsNo(getOwnerName());
                if (command.equals("getCarsList")) getCarsList(getOwnerName());
                if (command.equals("getCarsList")) {
                    System.out.println("Aplicatia se inchide...");
                    quit = true;
                } else {
                    System.out.println("Unknown command. Chose from:");
                    printCommandsList();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws Exception {
        // create and run an instance (for test purpose)
        new CarRentalSystem().run();
    }
}

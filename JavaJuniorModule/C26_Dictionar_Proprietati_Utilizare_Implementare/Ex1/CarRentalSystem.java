package src.C26_Dictionar_Proprietati_Utilizare_Implementare.Ex1;

import java.util.HashMap;
import java.util.Scanner;

/*
1. Imbunatateste aplicatia prezentata anterior, cel putin din urmatoarele perspective:

        1. Sistemul afiseaza un mesaj de eroare la adaugarea unui autoturism deja existent. In urma operatiei colectia ramane nemodificata.
            Intrebare: Ce se intampla in acest moment la adaugarea unui autoturism deja existent in colectie, dar cu un alt proprietar?
            Raspuns: La adaugarea unui autoturism existent, conducatorul auto se suprascrie.

            Determina singur comportamentul folosind documentatia oficiala si diverse scenarii de testare.
        2. Sistemul afiseaza corespunzator un mesaj de succes sau unul de eroare la stergerea unui autoturism din hashtable.
        3. Sistemul afiseaza un mesaj de eroare prietenos (i.e. human readable) atunci cand se doreste aflarea soferului
            pentru un autovehicul inexistent.
        4. Sistemul implementeaza o comanda totalRented care intoarce numarul de masini inchiriate la acel moment.
 */
public class CarRentalSystem {
    private static Scanner sc = new Scanner(System.in);
    private int totalRented = 0;
    private HashMap<String, String> rentedCars = new HashMap<>(100, 0.5f);

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
        //1
        if (isCarRent(plateNo)) {
            System.out.println("Autoturismul este deja închiriat");
            return;
        }
        this.totalRented++;
        rentedCars.put(plateNo, ownerName);
    }

    // remove an existing(key, value) pair
    private void returnCar(String plateNo) {
        //2
        if (isCarRent(plateNo)) {
            System.out.println("Masina a fost stearsa din hashtable");
            totalRented--;
            rentedCars.remove(plateNo);
        } else {
            System.out.println("Masina nu este inchiriata");
        }

    }

    // number of total rented cars
    //4
    private int getTotalRented() {
        return this.totalRented;
    }

    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("totalRented  - Afiseaza numarul de masinii inchiriate");
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

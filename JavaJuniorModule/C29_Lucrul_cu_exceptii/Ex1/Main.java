package src.C29_Lucrul_cu_exceptii.Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    /*
    Actualizeaza implementarea actuala a urmatoarelor teme/proiecte, folosind exceptii acolo unde este cazul:

        [P1] Sistem de gestiune inscrieri
        Car Rental System
        Pentru fiecare aplicatie, implementeaza minim 2 - 3 exceptii.
     */

    public static void main(String[] args) {

        System.out.println("Welcome! Enter the number of available seats:");

        File commandList = new File(Constants.FILEPATH);
        Scanner sc;

        try {
            sc = new Scanner(commandList);
            GuestsList devmindBeginner;

            devmindBeginner = SystemService.guestListCreation(sc);

            boolean quit = false;

            while (sc.hasNextLine()) {

                if (quit) {
                    break;
                }

                switch (SystemService.readingLines(sc)) {
                    case "help" -> System.out.println(Constants.HELPLIST);
                    case "add" -> devmindBeginner.add(sc);
                    case "guests" -> devmindBeginner.guests();
                    case "waitlist" -> devmindBeginner.waitList();
                    case "guests_no" -> devmindBeginner.guests_no();
                    case "waitlist_no" -> devmindBeginner.waitList_no();
                    case "subscribe_no" -> devmindBeginner.subscribe_no();
                    case "available" -> devmindBeginner.available();
                    case "remove" -> devmindBeginner.remove(sc);
                    case "update" -> devmindBeginner.update(sc);
                    case "search" -> devmindBeginner.search(sc);
                    case "check" -> System.out.println(devmindBeginner.check(sc)); // return -1 or index of participant
                    case "quit" -> quit = SystemService.quit();
                    default -> System.out.println("The command entered is invalid.\n" + "Please try again.");
                }
            }
        } catch (NullPointerException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package src.C31_FisiereBinare_Serializare.Ex1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        GuestsList devmindBeginner = SystemService.guestListCreation(sc);

        boolean quit = false;
        while (!quit) {

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
                case "clear" -> quit = SystemService.clearData();
                case "quit" -> quit = SystemService.quit(devmindBeginner);
                default -> System.out.println("The command entered is invalid.\n" + "Please try again.");
            }
        }
    }
}

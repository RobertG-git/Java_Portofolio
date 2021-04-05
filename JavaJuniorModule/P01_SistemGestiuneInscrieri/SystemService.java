package src.P1_SistemGestiuneInscrieri;

import java.util.Scanner;

public class SystemService {

    protected static boolean quit() {
        System.out.println("The application closes…");
        return true;
    }

    protected static String readingLines(Scanner sc) {
        System.out.println(Constants.WAITCOMMAND);
        String command = sc.nextLine();
        System.out.println(Constants.BLUE + command + Constants.RESET);

        return command;
    }

    protected static GuestsList guestListCreation(Scanner sc) {
        int cmd = sc.nextInt();
        System.out.println(Constants.BLUE + cmd + Constants.RESET);
        GuestsList guestsList = new GuestsList(cmd);
        sc.nextLine();
        return guestsList;
    }

//    public void update(Scanner sc, GuestsList guestsList) {
//        int option = sc.nextInt();
//        if (option == 1) {
//            int position = guestsList.checkGuestsByEmail(sc.nextLine());
//            String newEmail = sc.nextLine();
//            guestsList.updateGuestByEmail(position, newEmail);
//        }
//    }
}

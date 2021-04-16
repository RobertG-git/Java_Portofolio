package src.C29_Lucrul_cu_exceptii.Ex1;

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

    protected static String readLastName (Scanner sc) {
        System.out.println("Enter last name:");
        String lastName = sc.nextLine();
        System.out.println(Constants.BLUE + lastName + Constants.RESET);
        return lastName;
    }

    protected static String readFirstName (Scanner sc) {
        System.out.println("Enter first name:");
        String firstName = sc.nextLine();
        System.out.println(Constants.BLUE + firstName + Constants.RESET);
        return firstName;
    }

    protected static String readEmail (Scanner sc) {
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println(Constants.BLUE + email + Constants.RESET);
        return email;
    }

    protected static String readPhoneNumber (Scanner sc) {
        System.out.println("Enter phone number (format „+40733386463“):");
        String phoneNumber = sc.nextLine();
        System.out.println(Constants.BLUE + phoneNumber + Constants.RESET);
        return phoneNumber;
    }

    protected static int readAuthenticationNumber(Scanner sc) {
        System.out.println("""
                Choose the authentication mode, typing:
                "1" - Name and surname
                "2" - Email
                "3" - Phone number (format "+40733386463")\s""");

        int number = sc.nextInt();
        System.out.println(Constants.BLUE + number + Constants.RESET);
        return number;
    }

    protected static int readUpdateNumber(Scanner sc) {
        System.out.println("""
                    Choose the update field by typing:
                    "1" - Name
                    "2" - First name
                    "3" - Email
                    "4" - Phone number (format "+40733386463"))\s""");

        int number = sc.nextInt();
        System.out.println(Constants.BLUE + number + Constants.RESET);
        return number;
    }

    protected static String readSubstring (Scanner sc) {
        System.out.println("Please enter the substring to search: ");
        String substring = sc.nextLine();
        System.out.println(Constants.BLUE + substring + Constants.RESET);
        return substring;
    }

}

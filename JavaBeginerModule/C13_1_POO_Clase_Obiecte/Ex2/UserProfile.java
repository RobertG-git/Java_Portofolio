package C13_1_POO_Clase_Obiecte.Ex2;

import java.util.Scanner;

public class UserProfile {

    //The state of the object

    String name;
    String firstName;
    String email;
    String phoneNumber;
    int bornDayDate;
    int bornMonthDate;
    int bornYearDate;
    String gender;

    Scanner sc = new Scanner(System.in);

    // The behavior of the object

    // 1.
    public void initializeProfile() {
        System.out.println("Please insert your 'name': ");
        name = sc.next();
        System.out.println("Please insert your 'firstName': ");
        firstName = sc.next();
        System.out.println("Please insert your 'email': ");
        email = sc.next();
        System.out.println("Please insert your 'phoneNumber': ");
        phoneNumber = sc.next();
        System.out.println("Please insert your 'bornDayDate'(dd): ");
        bornDayDate= sc.nextInt();
        System.out.println("Please insert your 'bornMonthDate'(mm): ");
        bornMonthDate= sc.nextInt();
        System.out.println("Please insert your 'bornYearDate'(yyyy): ");
        bornYearDate= sc.nextInt();
        System.out.println("Please insert your 'gender' (Male or Female): ");
        gender = sc.next();
    }

    // 2.
    public void emailUpdate(String newEmail) {
        email = newEmail;
    }

    // 3.
    public void phoneNumberUpdate(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    // 4.
    public void displayAge(int insertCurrentYear) {
        int age = insertCurrentYear - bornYearDate;
        System.out.print(age);
    }

    // 5.
    public void displayInternalState() {
        System.out.println("\t - Name is: " + name + ".");
        System.out.println("\t - First name is: " + firstName + ".");
        System.out.println("\t - Email address is: " + email + ".");
        System.out.println("\t - Phone number is: " + phoneNumber + ".");
        System.out.println("\t - Born date is: " + bornDayDate + "/" + bornMonthDate + "/" + bornYearDate + ".");
        System.out.println("\t - Gender is: " + gender + ".");
    }






}

package C10_1_StructuraConditionalaSwitch;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        2. Folosind structura invatata in acest capitol, scrie un program care citeste de la tastatura numele unei luni si afiseaza numarul de zile al acelei luni.
        Numele lunilor incep cu majuscula si se continua cu litere mici. Exemplu:
         */

        String month;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the month: ");
        month = sc.next();

        switch (month) {
            case "January" -> System.out.println("January has " + 31 + " days");
            case "February" -> System.out.println("February has " + 28 + " days");
            case "March" -> System.out.println("March has " + 30 + " days");
            case "April" -> System.out.println("April has " + 30 + " days");
            case "May" -> System.out.println("May has " + 30 + " days");
            case "June" -> System.out.println("June has " + 30 + " days");
            case "July" -> System.out.println("July has " + 31 + " days");
            case "August" -> System.out.println("August has " + 31 + " days");
            case "September" -> System.out.println("September has " + 30 + " days");
            case "October" -> System.out.println("October has " + 31 + " days");
            case "November" -> System.out.println("November has " + 30 + " days");
            case "December" -> System.out.println("December has " + 30 + " days");
            default -> System.out.println("Month inserted is not valid. Please insert a valid month.");
        }


    }
}

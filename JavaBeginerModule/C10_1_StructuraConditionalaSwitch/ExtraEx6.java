package C10_1_StructuraConditionalaSwitch;

import java.util.Scanner;

public class ExtraEx6 {

    public static void main(String[] args) {

        /*
        6. Scrie o aplicatie care afiseaza toate lunile calendaristice (in limba romana) care incep cu o anumita litera, introdusa de utilizator de la tastatura.
        Daca se introduce o litera invalida (i.e. ce nu corespunde niciunei luni) se va afisa mesajul Nicio luna nu incepe cu litera '<letter>'..
        Daca unei litere corespund mai multe luni, acestea vor fi afisate in ordine calendaristica.
        Programul este „case insensitive“, adica nu face distinctia intre litere mari si mici.
        Programul va cicla, permitand utilizatorului sa introduca noi litere, pana la intalnirea literelor X sau x care vor duce la incheierea programului.
        La iesirea din aplicatie, aceasta va afisa mesajul specific Programul se inchide….
         */

        String month;

        Scanner sc = new Scanner(System.in);
        month = sc.next();

        while ( month != "x") {
            switch (month) {
                case "j":
                    System.out.println("January");
                    System.out.println("June");
                    System.out.println("July");
                    month = sc.next();
                    continue;
                case "f":
                    System.out.println("February");
                    month = sc.next();
                    continue;
                case "m":
                    System.out.println("March");
                    month = sc.next();
                    continue;
                case "a":
                    System.out.println("April");
                    System.out.println("August");
                    month = sc.next();
                    continue;
                case "s":
                    System.out.println("September");
                    month = sc.next();
                    continue;
                case "o":
                    System.out.println("October");
                    month = sc.next();
                    continue;
                case "n":
                    System.out.println("November");
                    month = sc.next();
                    continue;
                case "D":
                    System.out.println("December");
                    month = sc.next();
                    continue;
                case "x":
                case "X":
                    System.out.println("Programul is closing..");
                    month = "x";
                    break;
                default:
                    System.out.println("No month start with letter: " + month);
                    month = sc.next();
                    continue;
            }

        }

    }
}

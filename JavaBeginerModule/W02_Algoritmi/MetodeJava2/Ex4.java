package W02_Algoritmi.MetodeJava2;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Ex4 {

    /*
    4. Filtru de cifre:
    Scrie o metoda filterNumber(…)care se comporta ca un filtru de cifre. Functia va primi ca argumente 2 numere naturale,
    in ordine:
        number: reprezinta numarul asupra caruia va fi aplicat filtrul
        digitsFilter: un al doilea numar, care reprezinta filtru
    Metoda va returna un nou numar natural, obtinut prin eliminarea tuturor aparitiilor cifrelor aferente digitsFilter din number.
     */

    public static void main(String[] args) {
        String number;
        String digitsFilter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'number': ");
        number = sc.next();
        System.out.println("Please insert your 'digitsFilter': ");
        digitsFilter = sc.next();


        System.out.println(filterNumber(number, digitsFilter));
    }

    public static int filterNumber(String number, String digitsFilter) {
        StringBuilder filteredNumber = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {

            if (digitsFilter.contains(String.valueOf(number.charAt(i)))) {
                continue;
            }
            filteredNumber.append(number.charAt(i));
        }

        return Integer.parseInt(String.valueOf(filteredNumber));

    }
}

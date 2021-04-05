package C12_1_SupraincarcareaMetodelorTransParam;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        1.1. Scrie o metoda iterativa care primeste ca parametru un numar si returneaza numarul de cifre al acelui numar.
         */

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();
        numberOfDigits(n);
    }

    public static void numberOfDigits(int n) {
        int counter = 0;
        int copyN = n;
        while (n != 0) {
            int lastDigit = n % 10;
            counter++;
            n /= 10;
        }
        System.out.println("numberLength(" + copyN+ ")" + " --> (" + counter + ")");
    }


}

package C9_1_Break_Continue;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        /*
        4. Scrie un program care citeste de la tastatura numere naturale, pana la introducerea unui numar negativ.
        Daca numarul citit se termina in una dintre cifrele 3, 7 sau 9, numarul este ignorat si se trece la citirea urmatoarelor numere.
        In caz contrar, se afiseaza la consola „simetricul“ numarului.
        Urmareste exemplul urmator pentru detalii.
         */

        int n;
        int lastDigit;
        int symmetric = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert your first number: ");
        n = sc.nextInt();

        while ( n > 0) {

            if ( (n % 10 == 3 ) || (n % 10 == 7 ) || (n % 10 == 9 )  ) {
                System.out.println("Please insert next number: ");
                n = sc.nextInt();
                continue;
            }

            while ( n != 0 ) {
                lastDigit = n % 10;
                symmetric = symmetric * 10 + lastDigit;
                n = n / 10;
            }

            System.out.println(symmetric);
            symmetric = 0;

            System.out.println("Please insert next next number: ");
            n = sc.nextInt();

        }

        System.out.println("The number " + n + " is negative. Program has been stopped.");

    }
}

package C9_1_Break_Continue;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        /*
        4.1. Aceeasi problema, doar ca de aceasta data se ignora numerele care incep cu (i.e. au prima cifra) una dintre cifrele 3, 7 sau 9.
        Un exemplu de executie este prezentat in continuare:
         */

        int n;
        int lastDigit;
        int symmetric = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert your first number: ");
        n = sc.nextInt();

        while (n > 0) {

            while (n != 0) {
                lastDigit = n % 10;
                symmetric = symmetric * 10 + lastDigit;
                n = n / 10;
            }

            if ( (symmetric % 10 == 3) || (symmetric % 10 == 7) || (symmetric % 10 == 9 )  ) {
                System.out.println("Please insert next number: ");
                symmetric = 0;
                n = sc.nextInt();
                continue;
            }

            System.out.println(symmetric);
            symmetric = 0;

            System.out.println("Please insert next next number: ");
            n = sc.nextInt();

        }

        System.out.println("The number " + n + " is negative. Program has been stopped.");

    }
}

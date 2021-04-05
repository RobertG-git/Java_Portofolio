package C9_1_Break_Continue;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        2. Scrie un program care afiseaza primele 5 numere impare dintr-un interval dat.
        Se vor citi de la tastatura 2 numere intregi: left respectiv right, care reprezinta capetele intervalului.
        In cazul in care in interval se gasesc mai putin de 5 numere impare, se vor afisa toate numerele impare din interval.
         */

        int left, right;
        int counter = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert your 'left' number:");
        left = sc.nextInt();
        System.out.println("Please insert your 'right' number:");
        right = sc.nextInt();

        for (int it = left ; left < right ; left++) {
            if (left % 2 == 1) {
                System.out.print(left + " ");
                left++;
                counter++;

                if (counter == 5) {
                    break;
                }
            }

        }

        System.out.println();

    }

}

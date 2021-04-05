package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex1_1 {

    public static void main(String[] args) {

        /*
        1.1. Scrie un algoritm care determina daca un numar n dat de la input este numar perfect.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int it = 1 ; it < n ; it++) {

            if (n % it == 0) {
                sum += it;
            }
        }

        if (n ==  sum) {
            System.out.println("Is perfect number");
        } else {
            System.out.println("Is not perfect number");
        }

    }
}

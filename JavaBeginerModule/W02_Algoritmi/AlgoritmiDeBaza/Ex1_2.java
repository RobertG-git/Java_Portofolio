package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex1_2 {

    public static void main(String[] args) {

        /*
        1.2. Follow-up numar perfect.
        Scrie un program care afiseaza in consola toate numerele perfecte mai mici sau egale cu un numar n dat.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfectNumber(int numberToCheck) {
        int sum = 0;
        for (int it = 1; it < numberToCheck; it++) {
            if (numberToCheck % it == 0) {
                sum += it;
            }
        }
        return sum == numberToCheck;

    }
}

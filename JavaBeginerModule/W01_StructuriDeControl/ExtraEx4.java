package W01_StructuriDeControl;

import java.util.Scanner;

public class ExtraEx4 {

    public static void main(String[] args) {

        // 4.1. Este numar prim? Scrie un algoritm care sa determine daca un numar dat este numar prim.

        int n;
        int nrOfDivisors = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();

        for (int i = 2 ; i < n ; i++) {
            if (n % i == 0) {
                nrOfDivisors++;
            }
        }

        if (nrOfDivisors == 0) {
            System.out.println( n +  " is prime number.");
        } else {
            System.out.println( n +  " is not prime number.");
        }

        sc.close();

    }

}
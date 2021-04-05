package W02_Algoritmi.MetodeJava;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        /*
        1. Scrie o metoda care primeste ca parametru un numar natural n si returneaza cel mai mare multiplu de 5, mai mic sau egal cu n.
        Testeaza metoda in main cu diverse cazuri de exceptie:
         */
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number!");
        n = sc.nextInt();

        System.out.println("Biggest multiple of 5 for " + n + " number is: " + getMultipleOf5(n) );

    }

    public static int getMultipleOf5(int n) {
        int multipleOf5 = 0;
        for (int it = 0; it <= n; it++) {
            if(it % 5 == 0) {
                multipleOf5 = it;
            }
        }
        return multipleOf5;
    }
}

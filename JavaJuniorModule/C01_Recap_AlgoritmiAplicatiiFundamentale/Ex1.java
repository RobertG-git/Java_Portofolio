package src.C1_Recap_AlgoritmiAplicatiiFundamentale;

import java.util.Scanner;

public class Ex1 {
    /*
    1. Complementarul unui numar
    (JSD I - Complementarul unui numar) Scrie un program care citeste de la tastatura un numar natural n si
    afiseaza numarul complementar, astfel incat suma lor sa fie cel mai mic „numar rotund-perfect“.
    Un „numar rotund-perfect“ este un numar care are prima cifra 1, urmata doar de 0-uri.
     */

    public static void main(String[] args) {
        System.out.println(complementaryNumber(readN()));
    }

    public static int complementaryNumber (int n) {
        int copyN = n;
        int aux = 1;

        while (n != 0) {
            n /= 10;
            aux *= 10;
        }

        return aux - copyN;
    }
    public static int readN() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();

        return n;
    }


}

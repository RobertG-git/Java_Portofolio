package src.C1_Recap_AlgoritmiAplicatiiFundamentale;

import java.util.Scanner;

public class Ex2 {
    /*
    2. Puterile bazei
    (JSD I - Puterile bazei) Scrie un algoritm care citeste de la tastatura 2 numere naturale: o baza (i.e. b) si un exponent pozitiv (i.e. e).
    Programul va afisa toate puterile bazei, de la b0 la be (i.e. b0, b1, b2, …, be).

     */

    public static void main(String[] args) {

        powersSequence(readBase(), readExp());
    }

    public static void powersSequence(int base, int exp) {
        for (int i = 0; i <= exp; i++) {
            System.out.print((int)Math.pow(base,i) + " ");
        }
    }
    public static int readBase() {
        int base;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert your 'base': ");
        base = sc.nextInt();
        return base;

    }
    public static int readExp() {
        int exp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert your 'exp': ");
        exp = sc.nextInt();
        return exp;

    }
}

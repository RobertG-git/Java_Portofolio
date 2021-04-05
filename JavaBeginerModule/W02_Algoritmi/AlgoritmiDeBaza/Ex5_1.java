package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex5_1 {

    public static void main(String[] args) {

        /*
        5.1. Un matematician celebru, nemultumit ca Microsoft Office nu include o functie de generare a sirului Fibonacci, apeleaza la tine pentru implementarea unei astfel de aplicatii.
         Concret, citindu-se de la tastatura un numar natural n, sa se afiseze seria Fibonacci pana la numarul n (inclusiv).
         */

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");

        n = sc.nextInt();
        fibonacciSeries(n);

    }

    public static void fibonacciSeries(int n) {
        int previousValue =0 ;
        int currentValue = 1;
        int nextValue = 1;

        while (nextValue < n ){
            System.out.print(nextValue + " ");
            nextValue = currentValue + previousValue;
            previousValue = currentValue;
            currentValue = nextValue;
        }
    }


}

package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex5_3 {

    public static void main(String[] args) {

        /*
        5.3. Folosind experienta acumulata pana acum in lucru cu siruri, modifica algoritmul anterior astfel incat sa afiseze si pozitia numerelor Fibonacci in sir.
        Consideram ca seria Fibonacci incepe cu valoarea 1, care se afla pe pozitia 1.
        */

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();

        if (isNumberFibonacci(n)) {
            System.out.println(n + " " + isNumberFibonacci(n) + " (" +fibonacciPosition(n) + ")" );
        } else {
            System.out.println(n + " " + isNumberFibonacci(n) );
        }

    }

    public static boolean isNumberFibonacci(int n) {
        int previousValue = 0 ;
        int currentValue = 1;
        int nextValue = 1;
        boolean aux = false;


        if (n == 1) {
            aux = true;
        }

        while (nextValue < n * n ){

            nextValue = currentValue + previousValue;
            previousValue = currentValue;
            currentValue = nextValue;

            if (nextValue == n) {
                aux = true;
                break;
            }
        }

        return aux;
    }

    public static int  fibonacciPosition(int n) {
        int previousValue = 0 ;
        int currentValue = 1;
        int nextValue = 1;
        int counter = 1;

       if (isNumberFibonacci(n)) {
           while (nextValue < n){
               nextValue = currentValue + previousValue;
               previousValue = currentValue;
               currentValue = nextValue;
               counter++;
           }
       } else {
           counter = 0;
       }

        return counter;
    }
}

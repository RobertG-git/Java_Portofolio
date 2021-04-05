package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex5_2 {

    public static void main(String[] args) {

        /*
        5.2. „Nicio fapta buna nu ramane nepedepsita“.
        Matematicianul este foarte incantat de munca ta si functionalitatea implementata astfel ca revine la tine cu o noua sarcina.
        Dandu-se un numar natural n, citit de la tastatura, determina daca acel numar apartine sau nu seriei Fibonacci.
        Aplicatia trebuie sa produca rezultate similare cu:
        */

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");

        n = sc.nextInt();
        System.out.println(n + " " + isNumberFibonacci(n));

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


}

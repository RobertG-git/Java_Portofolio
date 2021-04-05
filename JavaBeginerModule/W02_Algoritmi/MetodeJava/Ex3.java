package W02_Algoritmi.MetodeJava;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        /*
        3. Se citeste de la tastatura un numar natural n.
        Afiseaza toate numerele din sirul lui Fibonacci pana la valoarea n, care contin cel putin o cifra 3.
         */

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();

        fibonacciRow(n);
    }

    public static void fibonacciRow(int n) {
        int previousNumber = 1;
        int currentNumber = 1;
        int lastNumber = previousNumber + currentNumber;

        while (lastNumber < n) {
            lastNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = lastNumber;

            int copyLastNumber = lastNumber;
            if (!containDigit3(copyLastNumber)) {
                System.out.print(lastNumber + " ");
            }

        }
    }

    public static boolean containDigit3 (int n) {
        while (n != 0) {
            int lastDigit = n % 10;
            if(lastDigit == 3) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

}



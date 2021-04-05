package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex2_1 {

    public static void main(String[] args) {

        /*
        2.1. Implementeaza o metoda care primeste ca parametru un numar si returneaza daca acel numar este sau nu magic.
        Tip: implementeaza, de asemenea, o metoda auxiliara, care sa returneze reducerea unui numar prin insumare, pentru a simplifica logica metodei tale si a modulariza codul sursa.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        int n = sc.nextInt();

        isMagic(n);

    }

    public static int reducingANumberBySummation(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            sum = sum + lastDigit;
        }

        while (sum > 10) {
            sum = reducingANumberBySummation(sum);
        }

        return sum;
    }

    public static void isMagic(int n) {
        int reducingANumberBySummation = reducingANumberBySummation(n);

        if (reducingANumberBySummation == 3 || reducingANumberBySummation == 7 || reducingANumberBySummation == 9) {
            System.out.println("The number is magic!");
        } else {
            System.out.println("The number is not magic!");
        }
    }
}

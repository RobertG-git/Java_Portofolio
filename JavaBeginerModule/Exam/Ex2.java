package Exam;

import java.util.Scanner;

public class Ex2 {

    /*
    Implementeaza o metoda care primeste ca parametru un array de numere intregi si returneaza:

        -1: daca numarul de numere pare este mai mic decat numarul de numere impare
        0: daca numarul de numere pare este egal cu numarul de numere impare
        1: daca numarul de numere pare este mai mare decat numarul de numere impare

    Implementeaza inclusiv metoda main astfel incat:

    INPUT: se citeste de la tastatura un array de numere intregi, astfel: se citeste initial numarul de numere (i.e. n) urmat de n numere
    OUTPUT: se afiseaza la consola rezultatul intors de metoda.
     */

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'number length': ");
        n =sc.nextInt();

        int[] array = new int[n];
        System.out.println("Please insert your 'int array': ");
        for ( int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(oddEvenCheck(array));
    }

    public static int oddEvenCheck(int[] array) {
        int counterEven = 0;
        int counterOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counterEven++;
            }
            if (array[i] % 2 == 1) {
                counterOdd++;
            }
        }

        if (counterEven > counterOdd) {
            return -1;
        } else if (counterEven < counterOdd) {
            return 1;
        } else {
            return 0;
        }
    }
}

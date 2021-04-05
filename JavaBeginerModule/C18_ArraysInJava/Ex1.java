package C18_ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    /* 1. Se citesc doi array (A respectiv B) de la tastatura, fiecare reprezentand cate o multime de numere.
     Prin definitie, orice multime de numere contine elemente unice, prin urmare cei doi vectori nu vor contine duplicate.
     Task-ul tau este sa implementezi operatia de diferenta a doua multimi (i.e. A \ B).
    */

    public static void displayArray(int[] array, String message) {
        System.out.print(message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static boolean search(int[] array, int value) {
        for (int it = 0; it < array.length; it++) {
            if (array[it] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stopKeyword = -404;
        int initialCapacity = 2;
        int numberOfElementsA = 0;
        int numberOfElementsB = 0;
        int numberOfElementsDif = 0;

        int[] arrayA = new int[initialCapacity];
        int[] arrayB = new int[initialCapacity];
        int[] arrayDif = new int[initialCapacity];

        // read array A
        System.out.println("\n Please insert first array: ");
        int read = sc.nextInt();
        while (read != stopKeyword) {
            arrayA[numberOfElementsA] = read;
            numberOfElementsA++;

            if (numberOfElementsA == arrayA.length) {
                arrayA = Arrays.copyOf(arrayA, arrayA.length * 2);
            }

            read = sc.nextInt();
        }

        arrayA = Arrays.copyOf(arrayA, numberOfElementsA);
        displayArray(arrayA, "arrayA is: ");

        //read arrayB
        System.out.println("\n Please insert second array: ");
        read = sc.nextInt();
        while (read != stopKeyword) {
            arrayB[numberOfElementsB] = read;
            numberOfElementsB++;

            if (numberOfElementsB == arrayB.length) {
                arrayB = Arrays.copyOf(arrayB, arrayB.length * 2);
            }

            read = sc.nextInt();
        }

        System.out.println();
        arrayB = Arrays.copyOf(arrayB, numberOfElementsB);
        displayArray(arrayB, "arrayB is: ");


        // create arrayDif
        for (int i = 0; i < arrayA.length; i++) {
            if (!search(arrayB, arrayA[i])) {
                arrayDif[numberOfElementsDif] = arrayA[i];
                numberOfElementsDif++;
            }

            if (numberOfElementsDif == arrayDif.length) {
                arrayDif = Arrays.copyOf(arrayDif, arrayDif.length * 2);
            }
        }

        arrayDif = Arrays.copyOf(arrayDif, numberOfElementsDif);

        System.out.println();
        displayArray(arrayDif, "arrayDif is: ");

        sc.close();
    }
}

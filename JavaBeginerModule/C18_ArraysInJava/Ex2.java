package C18_ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    /* 2.1Similar cu exercitiul anterior, se citesc de la tastatura 2 array, ce reprezinta 2 multimi de numere: A respectiv B.
    Se cere sa se calculeze:
     1. intersectia
     2. reuniunea
     */

    public static void displayArray(int[] array, String message) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean intersection(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
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
        int currentIndex = 2;
        int stopKeyword = -404;
        int numberOfElementsA = 0;
        int numberOfElementsB = 0;
        int numberOfElementsIntersect = 0;
        int numberOfElementsReunion;

        Scanner sc = new Scanner(System.in);

        int[] arrayB = new int[currentIndex];
        int[] arrayA = new int[currentIndex];
        int[] arrayIntersect = new int[currentIndex];
        int[] arrayReunion;

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

        // read array B
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
        arrayB = Arrays.copyOf(arrayB, numberOfElementsB);
        displayArray(arrayB, "\narrayB is: ");

        // intersection
        for (int i = 0; i < arrayA.length; i++) {
            if (intersection(arrayB, arrayA[i])) {
                arrayIntersect[numberOfElementsIntersect] = arrayA[i];
                numberOfElementsIntersect++;

                if (numberOfElementsIntersect == arrayIntersect.length) {
                    arrayIntersect = Arrays.copyOf(arrayIntersect, arrayIntersect.length * 2);
                }
            }
        }
        arrayIntersect = Arrays.copyOf(arrayIntersect, numberOfElementsIntersect);
        displayArray(arrayIntersect, "\narrayIntersect is: ");

        // reunion
        arrayReunion = Arrays.copyOf(arrayA, numberOfElementsA);
        numberOfElementsReunion = arrayA.length;

        for (int i = 0; i < arrayB.length; i++) {

            if (!search(arrayReunion, arrayB[i])) {

                if (numberOfElementsReunion == arrayReunion.length) {
                    arrayReunion = Arrays.copyOf(arrayReunion, arrayReunion.length * 2);
                }

                arrayReunion[numberOfElementsReunion] = arrayB[i];
                numberOfElementsReunion++;
            }

        }
        arrayReunion = Arrays.copyOf(arrayReunion, numberOfElementsReunion);
        displayArray(arrayReunion, "\narrayReunion is: ");
    }

}

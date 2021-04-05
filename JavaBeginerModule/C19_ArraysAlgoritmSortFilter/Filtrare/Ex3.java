package C19_ArraysAlgoritmSortFilter.Filtrare;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    /*
   3. Implementeaza o metoda care primeste ca parametri un array de numere intregi si o cifra (i.e. containsDigit(int[] array, int digit).
   Metoda va returna un array cu toate numerele care contin acea cifra.
    */

    public static void main(String[] args) {

        int n;
        int digit;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();

        System.out.println("Please insert your 'n numbers' : ");
        int[] array = new int[n];
        for (int i = 0 ; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Please insert your 'digit' : ");
        digit = sc.nextInt();

        System.out.println("Your lettersMatchIgnoreCase array is: ");
        displayArray(containsDigit(array, digit));

    }

    public static int[] containsDigit(int[] array, int digit) {
        int[] calculatedArray = new int[2];
        int numberOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            int copyCurrentArray = array[i];
            while (array[i] != 0) {
                int lastDigit = array[i] % 10;
                if (lastDigit == digit) {

                    if (numberOfElements == calculatedArray.length) {
                        calculatedArray = Arrays.copyOf(calculatedArray,calculatedArray.length * 2);
                    }
                    calculatedArray[numberOfElements] = copyCurrentArray;
                    numberOfElements++;
                    break;

                }
                array[i] /= 10;
            }
        }
        calculatedArray = Arrays.copyOf(calculatedArray,numberOfElements);
        return calculatedArray;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}


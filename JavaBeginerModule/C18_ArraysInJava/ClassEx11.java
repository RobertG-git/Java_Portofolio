package C18_ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class ClassEx11 {

    // Citirea de la tastatura (Numar cunoscut de elemente)

    public static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de numere:");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];
        for (int i=0; i<array.length; i++) {
            System.out.println("Introduceti numarul " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

        sc.close();
        return array;
    }

    // Citirea de la tastatura (Numar necunoscut de elemente)

    public static int[] readArrayUnk() {
        Scanner sc = new Scanner(System.in);
        int stopKeyword = -404;

        int initCapacity = 2; // the initial capacity of the array
        int[] array = new int[initCapacity];
        int numberOfElements = 0;

        int read = sc.nextInt();
        while (read != stopKeyword) {
            array[numberOfElements] = read;
            numberOfElements++;

            // if max capacity is reached, "resize" the array
            if (numberOfElements == array.length) {
                array = Arrays.copyOf(array, array.length * 2);
            }

            read = sc.nextInt();
        }

        return Arrays.copyOf(array, numberOfElements);
    }
}

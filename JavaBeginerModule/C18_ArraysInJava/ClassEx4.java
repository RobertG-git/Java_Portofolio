package C18_ArraysInJava;

import java.util.Scanner;

public class ClassEx4 {

    // Numar variabil de elemente - Versiune imbunatatita

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initCapacity = 2;
        String[] array = new String[initCapacity];
        int numberOfElements = 0;

        String read = sc.next();
        while (!read.equals("St0p")) {
            array[numberOfElements] = read;
            numberOfElements++;

            // if max capacity is reached, "resize" the array
            if (array.length == numberOfElements) {
               array = increaseCapacity(array, array.length*2);
            }

            read = sc.next();
        }

        System.out.println("Number of elements read and stored: " + numberOfElements);
        System.out.println("Array dimension: " + array.length);
        System.out.println("Elements:");
        for (int i=0; i<numberOfElements; i++) { // we can't use '.length'
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static String[] increaseCapacity(String[] array, int newLength) {

        // a. create a new array, that is double in size
        String[] longerArray = new String[newLength];

        // b. copy all elements in the new array
        for (int it = 0; it < array.length; it++) {
            longerArray[it] = array[it];
        }

        // c. return the reference of the new array
        //    in order to override existing reference
        return longerArray;
    }

}

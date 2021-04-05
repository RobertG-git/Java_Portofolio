package C18_ArraysInJava;

import java.util.Scanner;

public class ClassEx3 {

    // Numar variabil de elemente

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stopKeyword = "St0p!";

        int maxLength = 1000;
        String[] largeArray = new String[maxLength];
        int numberOfElements = 0;

        String read = sc.next();
        while (!read.equals(stopKeyword)) {
            largeArray[numberOfElements] = read;
            numberOfElements++;

            // if max capacity si reached, quit reading new words
            if (numberOfElements == maxLength) {
                System.out.println("Maximum capacity reached, sorry!");
                break;
            }

            read = sc.next();
        }

        System.out.println("Number of elements read and stored: " + numberOfElements);
        System.out.println("Array dimensions: " + largeArray.length);
        System.out.println("Elements: ");
        for (int it = 0; it < numberOfElements; it++) {
            System.out.print(largeArray[it] + ", ");
        }
        System.out.println();

    }

}

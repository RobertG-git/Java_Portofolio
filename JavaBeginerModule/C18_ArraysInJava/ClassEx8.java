package C18_ArraysInJava;

import java.util.Scanner;

public class ClassEx8 {

    // SquareNumbers in array

    public static void displayArray (int[] array, String message) {
        System.out.println(message);
        for (int it = array.length-1 ; it >= 0; it--) {
            System.out.print(array[it] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert array length: ");
        int n = sc.nextInt();

        int[] pp = new int[n];
        for (int it = 0; it < pp.length; it++) {
            pp[it] = it * it;
        }
        displayArray(pp, "Last " + n + " square numbers are: ");
    }

}

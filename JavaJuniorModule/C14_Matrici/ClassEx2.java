package src.C14_Matrici;

import java.util.ArrayList;

/*
    Operatii de baza - ArrayList
 */
public class ClassEx2 {

    public static void main(String[] args) {
        // matrix dimensions:
        int n = 5, m = 6;

        // 1. Defining a new bi-dimensional array, using ArrayList
        ArrayList<ArrayList<Integer>> numbers;


        // 2. Initializing the matrix
        // -> The process takes 2 steps:
        //    1. Initializing the main ArrayList
        //    2. Creating one (new) ArrayList for each row
        numbers = new ArrayList<ArrayList<Integer>>(n); // reserve n elements for efficiency
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> newRow = new ArrayList<Integer>(m); // new row
            for (int j = 0; j < m; j++) {
                newRow.add(0);
            }
            numbers.add(newRow);
        }

        // 3. Updating values of elements
        numbers.get(2).set(1, 101);  // Number is on line 2, column 1.
        // Note: numbering starts at 0 (as always).
        // Look for number 101 in the image!
        numbers.get(0).set(0, 2);  // first position in matrix
        numbers.get(4).set(5, 91); // last position in matrix
        numbers.get(3).set(3, 88);
        numbers.get(2).set(5, 55);
        numbers.get(3).set(0, 923);

        // 4. Accessing elements in the matrix
        System.out.println(numbers.get(2).get(5));
        System.out.println(numbers.get(2).get(4));


        // 5. Iterate over all elements
        // -> we have to use 2 iterators (which will work as in image)
        //   -> i will be used for rows
        //   -> j will be used for columns
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.get(i).size(); j++) {
                System.out.println("Element on line " + i +
                        " and column " + j + " is " + numbers.get(i).get(j));
            }
        }

        // 6. Printing the matrix (in space)
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.get(i).size(); j++) {
                System.out.print(numbers.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }
}

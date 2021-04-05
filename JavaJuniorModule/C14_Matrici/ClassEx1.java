package src.C14_Matrici;

public class ClassEx1 {

    /*
    Matrici examples
     */

    public static void main(String[] args) {

        // 1. Defining a new bi-dimensional array
        int[][] numbers;

        // 2. Initializing the array (i.e. allocate memory for the (6) elements)
        numbers = new int[5][6];  // int[<NUMBER_OF_ROWS>][<NUMBER_OF_COLUMNS>]

        // 3. Updating values of elements
        numbers[2][1] = 101;
        numbers[0][0] = 2;
        numbers[4][5] = 91;
        numbers[3][3] = 88;
        numbers[2][5] = 55;
        numbers[3][0] = 923;

        // 4. Accessing elements in the matrix
        System.out.println(numbers[2][5]);
        System.out.println(numbers[2][4]);

        // 5. Iterate over all elements
        // -> we have to use 2 iterators (which will work as in image)
        //   -> i will be used for rows
        //   -> j will be used for columns
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("Element on line " + i + " and column " + j + " is " + numbers[i][j]);
            }
        }
        System.out.println();

        // 6. Printing the matrix (in space)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }


    }

}

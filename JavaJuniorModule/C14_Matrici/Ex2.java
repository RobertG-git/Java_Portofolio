package src.C14_Matrici;

public class Ex2 {

    /*
    2. Urmareste continutul laboratorului si intelege practic operatiile aritmetice cu matrici, anume:
        - adunarea
        - scaderea
        - inmultirea a doua matrici
        - inmultirea cu un scalar
    Implementeaza pe rand fiecare operatie. Obs: Poti opta pentru orice tip de container (i.e. array, ArrayList etc.).
     */

    public static void main(String[] args) {

        // matrix creation
        int[][] matrix1 = matrix1Creation();
        int[][] matrix2 = matrix2Creation();


        // Matrix sum:
        System.out.println("Matrix sum is: ");
        matrixSum(matrix1, matrix2);
        System.out.println();

        // Matrix dif:
        System.out.println("Matrix dif is: ");
        matrixDif(matrix1, matrix2);
        System.out.println();

        // Matrix scalar multiplication:
        System.out.println("Matrix2 scalar multiplication is: ");
        matrixScalarMultiplication(matrix2, 2);
        System.out.println();

        // Matrix multiplication
        int[][] matrix3 = matrix3Creation();
        int[][] matrix4 = matrix4Creation();
        System.out.println("Matrix3 and matrix4 multiplication is: ");
        matrixMultiplication(matrix3,matrix4);


    }

    public static void matrixSum(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                if (matrix1[i].length == matrix2[i].length) {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        System.out.print(matrix1[i][j] + matrix2[i][j] + "\t");
                    }
                    System.out.println();
                } else {
                    System.out.println("Matrix 'columns' are not equals and sum cannot be performed.");
                }

            }

        } else {
            System.out.println("Matrix 'row' are not equals and sum cannot be performed.");
        }
    }

    public static void matrixDif(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                if (matrix1[i].length == matrix2[i].length) {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        System.out.print(matrix1[i][j] - matrix2[i][j] + "\t");
                    }
                    System.out.println();
                } else {
                    System.out.println("Matrix 'columns' are not equals and sum cannot be performed.");
                }

            }

        } else {
            System.out.println("Matrix 'row' are not equals and sum cannot be performed.");
        }
    }

    public static void matrixScalarMultiplication(int[][] matrix1, int scalar) {
        for (int[] ints : matrix1) {
            for (int anInt : ints) {
                System.out.print(anInt * scalar + "\t");
            }
            System.out.println();

        }
    }

    public static void matrixMultiplication(int[][] matrix3, int[][] matrix4) {

        int sum = 0;
        for (int[] ints : matrix3) { // 3
            if (ints.length == matrix4.length) {
                for (int j = 0; j < matrix3.length; j++) { // 3
                    for (int r = 0; r < matrix4.length; r++) { // 2
                        sum += ints[r] * matrix4[r][j];

                    }
                    System.out.print(sum + "\t");
                    sum = 0;
                }
                System.out.println();
            } else {
                System.out.println("First matrix 'column' is not equals with second matrix row and multiplication" +
                        " cannot be performed.");
                break;
            }
        }
    }

    public static int[][] matrix1Creation() {
        int[] matrix1Data = {2, 10, 8, 1, 5, 5};
        int[][] matrix1 = new int[3][2];
        System.out.println("Matrix 1 is: ");
        int k = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = matrix1Data[k];
                k++;
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }
        return matrix1;
    }

    public static int[][] matrix2Creation() {
        int k;
        int[] matrix2Data = {4, 7, 0, 3, 5, 10};
        int[][] matrix2 = new int[3][2];
        System.out.println();
        System.out.println("Matrix 2 is: ");
        k = 0;
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = matrix2Data[k];
                k++;
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return matrix2;
    }

    public static int[][] matrix3Creation() {
        int[] matrix3Data = {2, 3, 6, 1, 5, 1};
        int[][] matrix3 = new int[3][2];
        System.out.println("Matrix 3 is: ");
        int k = 0;
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                matrix3[i][j] = matrix3Data[k];
                k++;
                System.out.print(matrix3[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return matrix3;
    }

    public static int[][] matrix4Creation() {
        int k;
        int[] matrix4Data = {4, 3, 0, 5, 5, 1};
        int[][] matrix4 = new int[2][3];
        System.out.println("Matrix 4 is: ");
        k = 0;
        for (int i = 0; i < matrix4.length; i++) {
            for (int j = 0; j < matrix4[i].length; j++) {
                matrix4[i][j] = matrix4Data[k];
                k++;
                System.out.print(matrix4[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return matrix4;
    }
}

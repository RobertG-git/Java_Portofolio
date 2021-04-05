package src.C14_Matrici;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    /*
    1. Se citesc urmatoarele valori de la tastatura, in ordine:

    matrixDimension	Dimensiunea matricei. Ambele dimensiuni vor fi egale, fiind deci vorba despre o matrice patratica.
    mainDiagValue	Un numar intreg, ce reprezinta valoarea elementelor de pe diagonala principala.
    sndDiagValue	Un numar intreg, ce reprezinta valoarea elementelor de pe diagonala secundara.
    centerValue	    Un numar intreg, ce reprezinta valoarea elementului de pe pozitia din centru a matricei.
         → Daca dimensiunea este un numar par, matricea nu va avea un element central si prin urmare aceasta valoare nu se va citi.
    leftValue	    Un numar intreg, ce reprezinta valoarea elementelor din „stanga“: cele aflate sub diagonala principala si deasupra diagonalei secundare.
    upValue	        Un numar intreg, ce reprezinta valoarea elementelor din „partea de sus“: cele aflate deasupra diagonalei principale si deasupra diagonalei secundare.
    rightValue    	Un numar intreg, ce reprezinta valoarea elementelor din „dreapta“: cele aflate deasupra diagonalei principale si sub diagonala secundara.
    bottomValue 	Un numar intreg, ce reprezinta valoarea elementelor din „partea de jos“: cele aflate sub diagonala principala si sub diagonala secundara.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert matrix details: ");

        int matrixDimension = 5; //sc.nextInt();
        int mainDiagValue = 1; //sc.nextInt();
        int secondDiagValue = 2; // sc.nextInt();
        int centerValue = 3; //sc.nextInt();
        int leftValue = 4; //sc.nextInt();
        int upValue = 5; //sc.nextInt();
        int rightValue = 6; // sc.nextInt();
        int bottomValue = 7; //sc.nextInt();

        arrayMatrix(matrixDimension,mainDiagValue,secondDiagValue,centerValue,
                leftValue,upValue,rightValue,bottomValue);

        System.out.println();

        arrayListMatrix(matrixDimension, mainDiagValue, secondDiagValue, centerValue,
                leftValue, upValue, rightValue, bottomValue);
    }

    public static void arrayMatrix(int matrixDimension, int mainDiagValue, int secondDiagValue, int centerValue,
                                   int leftValue, int upValue, int rightValue, int bottomValue) {

        int[][] matrix = new int[matrixDimension][matrixDimension];

        // mainDiag
        for (int i = 0; i < matrixDimension; i++) {
            matrix[i][i] = mainDiagValue;
        }

        // secondDiag
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i + j == matrixDimension - 1) {
                    matrix[i][j] = secondDiagValue;
                }
            }
        }

        // centerValue
        if (matrixDimension % 2 == 1) {
            matrix[matrixDimension / 2][matrixDimension / 2] = centerValue;
        }

        // leftValue
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i > j && i + j < matrixDimension - 1) {
                    matrix[i][j] = leftValue;
                }
            }
        }

        // upValue
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i < j && i + j < matrixDimension - 1) {
                    matrix[i][j] = upValue;
                }
            }
        }

        // rightValue
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i < j && i + j > matrixDimension - 1) {
                    matrix[i][j] = rightValue;
                }
            }
        }

        // bottomValue
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i > j && i + j > matrixDimension - 1) {
                    matrix[i][j] = bottomValue;
                }
            }
        }

        //matrix print
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " \t");
            }
            System.out.println();
        }
    }

    public static void arrayListMatrix(int matrixDimension, int mainDiagValue, int secondDiagValue, int centerValue,
                                       int leftValue, int upValue, int rightValue, int bottomValue) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(matrixDimension);

        for (int i = 0; i < matrixDimension; i++) {
            ArrayList<Integer> newRow = new ArrayList<>(matrixDimension);
            for (int j = 0; j < matrixDimension; j++) {
                newRow.add(0);
            }
            matrix.add(newRow);
        }

        // mainDiag
        for (int i = 0; i < matrixDimension; i++) {
            matrix.get(i).set(i, mainDiagValue);
        }

        // secondDiag
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i + j == matrixDimension - 1) {
                    matrix.get(i).set(j, secondDiagValue);
                }
            }
        }

        // centerValue
        if (matrixDimension % 2 == 1) {
            matrix.get(matrixDimension / 2).set(matrixDimension / 2, centerValue);
        }

        // leftValue
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i > j && i + j < matrixDimension - 1) {
                    matrix.get(i).set(j,leftValue);
                }
            }
        }

        // upValue
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i < j && i + j < matrixDimension - 1) {
                    matrix.get(i).set(j,upValue);
                }
            }
        }

        // rightValue
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i < j && i + j > matrixDimension - 1) {
                    matrix.get(i).set(j,rightValue);
                }
            }
        }

        // bottomValue
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i > j && i + j > matrixDimension - 1) {
                    matrix.get(i).set(j,bottomValue);
                }
            }
        }

        //matrix print
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                System.out.print(matrix.get(i).get(j) + " \t");
            }
            System.out.println();
        }
    }
}

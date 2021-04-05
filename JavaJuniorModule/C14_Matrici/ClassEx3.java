package src.C14_Matrici;

import java.util.Random;

/*
Lista de vecini ai unui element
 */
public class ClassEx3 {

    private static final int dimensionLimit = 10;
    private static final int valueLimit = 1000;

    private static int[] dirX = {-1, -1, 0, +1, +1, +1, 0, -1};
    private static int[] dirY = {0, +1, +1, +1, 0, -1, -1, -1};

    // Optional: this is for demo only.
    private static String[] dirName = {"N", "NE", "E", "SE", "S", "SV", "V", "NV"};

    private static Random random = new Random();

    public static void main(String[] args) {
    // Generate a random matrix, max of 9x9

        int n = (random.nextInt(dimensionLimit - 2) + 2);
        int m = (random.nextInt(dimensionLimit -2) + 2);

        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = random.nextInt(valueLimit);
            }
        }

        System.out.println("The matrix is: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        int elementI = random.nextInt(n);
        int elementJ = random.nextInt(m);

        System.out.println("The (randomly) chosen point is: matrix[" +
                elementI + "][" + elementJ + "] = " + mat[elementI][elementJ]);
        System.out.println();

        System.out.println("The neighbours are: ");
        int countNeigh = 0;
        for (int  i = 0; i < dirX.length; i++) {
            int neightI = elementI + dirX[i];
            int neightJ = elementJ + dirY[i];
            if (neightI >= 0 && neightI < n && neightJ >=0 && neightJ <m) {
                System.out.println("The " + dirName[i] + " neighbor is: matrix[" +
                        neightI + "][" + neightJ + "]=" + mat[neightI][neightJ]);
                countNeigh++;
            }
        }
        System.out.println();

        System.out.println("Number of neighbors: " + countNeigh + ".");



    }


}

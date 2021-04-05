package src.C16_ClaseInterneLocaleAnonimeStatice.ClassEx1;

public class BigNumbers {

    public int[] sum(int[] op1, int[] op2) {

        long intOp1 = 0;
        long intOp2 = 0;

        for (int k : op1) {
            intOp1 = intOp1 * 10 + k;
        }

        for (int j : op2) {
            intOp2 = intOp2 * 10 + j;
        }

        long sum = intOp1 + intOp2;

        long copySum = sum;
        int n = 0;

        for (int i = 0; i < sum; i++) {
            if (sum / 10 > 0) {
                n++;
                sum /= 10;
            }
        }
        int[] intSum = new int[Integer.parseInt(String.valueOf(String.valueOf(copySum).length()))];
        n = intSum.length - 1;

        for (int i = 0; i < intSum.length + 1; i++) {
            while (copySum != 0) {
                int lastDigit = (int) (copySum % 10);
                intSum[n] = lastDigit;
                copySum /= 10;
                n--;
            }

        }

        return intSum;
    }

    public static void main(String[] args) {
        int noTests = 6;

        int[][] op1 = {{0}, {9, 9}, {9}, {2, 1, 7, 8},
                {5, 0, 5, 0, 5}, {1, 0, 8, 6, 7, 8, 9, 4, 2, 3, 4}};
        int[][] op2 = {{1, 0, 1}, {1}, {9, 9, 9, 9}, {5, 9, 6},
                {5, 5, 0, 5, 0}, {3, 4, 2, 8, 9, 7, 9, 2, 3, 4, 9}};
        int[][] correct = {{1, 0, 1}, {1, 0, 0}, {1, 0, 0, 0, 8}, {2, 7, 7, 4},
                {1, 0, 5, 5, 5, 5}, {4, 5, 1, 5, 7, 6, 8, 6, 5, 8, 3}};

        int total = 0;
        for (int i = 0; i < noTests; i++) {
            System.out.println("Test " + (i+1) + ":");
            String op1S = noToString(op1[i]);
            String op2S = noToString(op2[i]);

            BigNumbers bn = new BigNumbers();
            int[] rez = bn.sum(op1[i], op2[i]);

            String rezS = noToString(rez);
            String correctS = noToString(correct[i]);
            System.out.println(op1S + " + " + op2S + " = " + rezS + " C: " + correctS +
                    "......" + (rezS.equals(correctS) ? "OK" : "WRONG"));
            System.out.println();

            total += rezS.equals(correctS) ? 1 : 0;
        }

        System.out.println("Your total score is: " + total + " / " + noTests);
        System.out.println(total > 3 ? "You passed! Hurray! :)" : "Sorry.. :(");
    }

    private static String noToString(int[] no) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < no.length; i++) {
            sb.append(no[i]);
        }
        return sb.toString();
    }
}


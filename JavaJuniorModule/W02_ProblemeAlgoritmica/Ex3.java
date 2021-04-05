package src.W02_ProblemeAlgoritmica;

public class Ex3 {
    /*
    https://leetcode.com/problems/largest-number/
     */

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int n) {

        if(n == 0) {
            return 0;
        }

        int previousValue = 1;
        int currentValue = 2;
        int nextValue;

        for (int i = 2; i <= n; i++) {
            nextValue = previousValue + currentValue; // 1 + 2 = 3
            previousValue = currentValue; // 2
            currentValue = nextValue; // 3
        }

        return previousValue;
    }
}

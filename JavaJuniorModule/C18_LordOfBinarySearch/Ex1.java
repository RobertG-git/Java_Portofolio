package src.C18_LordOfBinarySearch;

/*
https://leetcode.com/problems/valid-perfect-square/
 */

public class Ex1 {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;



        while (left <= right) {

            int midle = (left + right) / 2;
            long product = (long) midle * midle;

            if (product == num) {
                return true;
            } else if (product > num) {
                right = midle - 1;
            } else{
                left = midle +1;
            }
        }

        return false;
    }
}

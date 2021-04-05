package src.LeetCode;

public class Ex3 {
    /*
    https://leetcode.com/problems/reverse-integer/
     */
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long reverseX = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            reverseX = reverseX * 10 + lastDigit;
            x /= 10;

            if (reverseX > Integer.MAX_VALUE || reverseX < Integer.MIN_VALUE) {
                return 0;
            }
        }


        return (int) reverseX;

    }
}

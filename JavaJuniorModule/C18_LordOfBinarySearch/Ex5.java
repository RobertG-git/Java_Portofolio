package src.C18_LordOfBinarySearch;

public class Ex5 {

    /*
    Given a non-negative integer x, compute and return the square root of x.
    Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned
     */
    
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int m;

        while (l <= r) {
            m = l + (r - l) / 2;
            if ((int) Math.sqrt(x) == m) {
                return m;
            } else if (Math.sqrt(x) > m) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}

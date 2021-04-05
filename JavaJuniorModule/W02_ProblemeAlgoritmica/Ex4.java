package src.W02_ProblemeAlgoritmica;

public class Ex4 {

    /*
    https://leetcode.com/problems/single-number/
     */

    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {

        for (int num : nums) {
            int counter = 0;
            for (int i : nums) {
                if (num == i) {
                    counter++;
                }
            }

            if (counter == 1) {
                return num;
            }
        }

        return -1;
    }
}

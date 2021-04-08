package src.C27_Seturi_Proprietati_Utilizare.Ex1;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {

    /*
    https://leetcode.com/problems/single-number/
     */

    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        int doubleSum = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                doubleSum += nums[i];
                set.add(nums[i]);
            }

            sum += nums[i];
        }

        return (2 * doubleSum) - sum;

    }
}

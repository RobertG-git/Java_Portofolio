package src.W01_ProblemeDeAlgoritmica;

import java.util.Arrays;

public class Ex3 {
    /*
    Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int curentNumber = nums[0];
        int nbElem = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > curentNumber) {
                nums[nbElem] = nums[i];
                curentNumber = nums[i];
                nbElem++;
            }
        }
        nums = Arrays.copyOf(nums, nbElem);
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
}

package src.LeetCode;

/*
https://leetcode.com/problems/longest-continuous-increasing-subsequence/solution/
 */
public class Ex2 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 2, 3, 4, 5};
        System.out.println("Longes" + findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums) {

        if (nums.length == 0)
            return 0;

        int maxCounter = 1;

        for (int i = 1; i < nums.length; i++) {
            int counter = 1;
            while (i < nums.length && nums[i - 1] < nums[i]) {
                counter++;
                i++;
            }
            maxCounter = Math.max(counter, maxCounter);
        }
        return maxCounter;
    }
}

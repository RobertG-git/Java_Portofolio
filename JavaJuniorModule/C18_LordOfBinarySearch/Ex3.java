package src.C18_LordOfBinarySearch;
/*
https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class Ex3 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = 0;

        // index searcher
        while (l < r) {
            m = (l + r) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        int s = l;
        l = 0; r = nums.length - 1;
        if ( target >= nums[s] && target <= nums[r]) {
            l = s;
        } else {
            r = s;
        }

        while (l <= r) {
            m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (target > nums[m]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}

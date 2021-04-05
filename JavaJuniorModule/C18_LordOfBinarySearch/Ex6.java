package src.C18_LordOfBinarySearch;

import java.util.Arrays;

/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
 */

public class Ex6 {

    public static void main(String[] args) {
        int[] a = {1, 3};
        int target = 1;

        System.out.println(Arrays.toString(searchRange(a, target)));
        System.out.println(search(a, target));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] indexMinMax;
        int index = (search(nums, target));
        int minIndex = index;
        int maxIndex = index;

        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }

        if (index == -1) {
            indexMinMax = new int[]{index, index};
            return indexMinMax;
        } else {

            while (minIndex >= 0 && minIndex <= nums.length - 1 && nums[minIndex] == target) {
                minIndex--;
            }

            while (maxIndex >= 0 && maxIndex <= nums.length - 1 && nums[maxIndex] == target) {
                maxIndex++;
            }
            System.out.println("minIndex: " + minIndex + " maxIndex: " + maxIndex);
            indexMinMax = new int[]{minIndex + 1, maxIndex - 1};
        }
        return indexMinMax;
    }

    public static int search(int[] nums, int target) {
        int i = 0;
        int r = nums.length - 1;

        while (i <= r) {
            int m = (i + r) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                i = m + 1;
            }
        }
        return -1;
    }
}

package src.C26_Dictionar_Proprietati_Utilizare_Implementare.Ex4;

import java.util.HashMap;

public class Ex4 {
    /*
    https://leetcode.com/problems/two-sum/solution/
     */

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[] {i, map.get(target - nums[i]) };
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}

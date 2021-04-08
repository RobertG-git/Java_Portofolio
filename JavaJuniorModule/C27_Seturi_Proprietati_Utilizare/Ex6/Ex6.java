package src.C27_Seturi_Proprietati_Utilizare.Ex6;

import java.util.HashSet;
import java.util.Set;

public class Ex6 {
    /*
        https://leetcode.com/problems/contains-duplicate/
     */

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return set.size() != nums.length;
    }
}

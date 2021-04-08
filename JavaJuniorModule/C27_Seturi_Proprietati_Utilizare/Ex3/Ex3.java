package src.C27_Seturi_Proprietati_Utilizare.Ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex3 {

    /*
        https://leetcode.com/problems/intersection-of-two-arrays/
     */

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int j : nums1) {
            set1.add(j);
        }

        for (int j : nums2) {
            if (set1.contains(j) && !res.contains(j)) {
                res.add(j);
            }
        }

        int[] copyRes =  new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            copyRes[i] = res.get(i);
        }

        return copyRes;
    }
}

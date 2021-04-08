package src.C27_Seturi_Proprietati_Utilizare.Ex5;

import java.util.HashSet;
import java.util.Set;

public class Ex5 {
    /*
        https://leetcode.com/problems/distribute-candies/
     */

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for (int i : candyType) {
            set.add(i);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
}

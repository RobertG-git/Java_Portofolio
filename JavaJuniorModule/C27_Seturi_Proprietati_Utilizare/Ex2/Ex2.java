package src.C27_Seturi_Proprietati_Utilizare.Ex2;

import java.util.HashSet;

public class Ex2 {
    /*
        https://leetcode.com/problems/jewels-and-stones/
     */

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int counter = 0;

        for (int i = 0 ; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }
}

package src.C26_Dictionar_Proprietati_Utilizare_Implementare.Ex5;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex5 {
    /*
    https://leetcode.com/problems/longest-substring-without-repeating-characters/
     */

    // v1.
    public int lengthOfLongestSubstringV1(String s) {

        int counter = 0;
        ArrayList<Character> substring = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!substring.contains(s.charAt(i))) {
                substring.add(s.charAt(i));
            } else {
                while (substring.contains(s.charAt(i))) {
                    substring.remove(0);
                }

                substring.add(s.charAt(i));
            }
            counter = Math.max(counter, substring.size());
        }

        return counter;

    }

    // v2.
    public int lengthOfLongestSubstringV2(String s) {

        if(s.length() == 1) return 1;

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0, j = 0; i < s.length(); i++ ) {
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }

            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }

        return max;

    }

}

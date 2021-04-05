package src.C26_Dictionar_Proprietati_Utilizare_Implementare.Ex7;

import java.util.HashMap;

public class Ex7 {
    /*
    https://leetcode.com/problems/longest-palindrome/
     */

    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map =  new HashMap<>();

        char[] sChar = s.toCharArray();
        int counter = 0;


        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(sChar[i])) {
                map.remove(sChar[i]);
                counter++;
            } else {
                map.put(sChar[i] , i);
            }
        }

        if (map.size() != 0) {
            return counter * 2 + 1;
        }

        return counter * 2;
    }
}

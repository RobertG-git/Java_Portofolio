package src.C26_Dictionar_Proprietati_Utilizare_Implementare.Ex6;

import java.util.HashMap;

public class Ex6 {
    /*
        https://leetcode.com/problems/first-unique-character-in-a-string/submissions/
     */


    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap();
        HashMap<Character, Integer> testedChars = new HashMap();

        char[] sChar = s.toCharArray();

        for (int i = 0; i < sChar.length; i++) {
            map.put(sChar[i], i);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(sChar[i]) && !testedChars.containsKey(sChar[i]) && map.get(sChar[i]) == i) {
                return i;
            }

            testedChars.put(sChar[i], i);
        }

        return -1;
    }
}

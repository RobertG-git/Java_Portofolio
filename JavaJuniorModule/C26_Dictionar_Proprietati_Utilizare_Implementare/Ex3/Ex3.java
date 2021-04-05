package src.C26_Dictionar_Proprietati_Utilizare_Implementare.Ex3;

public class Ex3 {
    /*
    https://leetcode.com/problems/valid-anagram/
     */

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        char[] alphabet = new char[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }

        for (char i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

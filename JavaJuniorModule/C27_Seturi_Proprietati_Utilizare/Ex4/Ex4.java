package src.C27_Seturi_Proprietati_Utilizare.Ex4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex4 {

    /*
    https://leetcode.com/problems/keyboard-row/
     */

    public String[] findWords(String[] words) {
        Set<Character> firstRow = new HashSet<>();
        Set<Character> secondRow = new HashSet<>();
        Set<Character> thirdRow = new HashSet<>();

        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        int counter = 0;
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            firstRow.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            secondRow.add(s2.charAt(i));
        }

        for (int i = 0; i < s3.length(); i++) {
            thirdRow.add(s3.charAt(i));
        }

        for (String word : words) {
            counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (firstRow.contains(word.toLowerCase().charAt(j))) {
                    counter++;
                }
            }

            if (counter == word.length()) {
                res.add(word);
            }

            counter = 0;

            for (int j = 0; j < word.length(); j++) {
                if (secondRow.contains(word.toLowerCase().charAt(j))) {
                    counter++;
                }
            }

            if (counter == word.length()) {
                res.add(word);
            }

            counter = 0;

            for (int j = 0; j < word.length(); j++) {
                if (thirdRow.contains(word.toLowerCase().charAt(j))) {
                    counter++;
                }
            }

            if (counter == word.length()) {
                res.add(word);
            }
        }

        String[] finalRes = new String[res.size()];

        for (int i = 0; i < res.size(); i++) {
            finalRes[i] = res.get(i);
        }

        return finalRes;

    }
}

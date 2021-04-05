package src.W01_ProblemeDeAlgoritmica;

import java.util.Arrays;

public class Ex7 {
    /*
    Given a list of sorted characters letters containing only lowercase letters, and given a target letter target,
    find the smallest element in the list that is larger than the given target.
    Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
     */

    public static char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);

        for (int i = 0 ; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'b', 'a', 'c'};
        char target = 'z';

        System.out.println(nextGreatestLetter(letters, target));
    }
}

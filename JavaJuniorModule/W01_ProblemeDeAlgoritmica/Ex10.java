package src.W01_ProblemeDeAlgoritmica;

import java.util.Arrays;

public class Ex10 {

    /*
    Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of
    American keyboard like the image below.

    In the American keyboard:

    the first row consists of the characters "qwertyuiop",
    the second row consists of the characters "asdfghjkl", and
    the third row consists of the characters "zxcvbnm".
     */

    public static void main(String[] args) {
    String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {

        String[] findWords = new String[words.length];
        int numberOfElements = 0;

        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        int counter1;
        int counter2;
        int counter3;

        for (String i : words) {
            counter1 = 0;
            counter2 = 0;
            counter3 = 0;

            for (int j = 0; j < i.length(); j++) {

                for (int k = 0; k < firstRow.length(); k++) {
                    if (Character.toLowerCase(i.charAt(j)) == Character.toLowerCase(firstRow.charAt(k))) {
                        counter1++;
                    }
                }

                for (int l = 0; l < secondRow.length(); l++) {
                    if (Character.toLowerCase(i.charAt(j)) == Character.toLowerCase(secondRow.charAt(l))) {
                        counter2++;
                    }
                }

                for (int m = 0; m < thirdRow.length(); m++) {
                    if (Character.toLowerCase(i.charAt(j)) == Character.toLowerCase(thirdRow.charAt(m))) {
                        counter3++;
                    }
                }

                if (counter1 == i.length() || counter2 == i.length() || counter3 == i.length()) {
                    findWords[numberOfElements] = i;
                    numberOfElements++;
                }
            }
        }

        findWords = Arrays.copyOf(findWords, numberOfElements);

        return findWords;
    }
}

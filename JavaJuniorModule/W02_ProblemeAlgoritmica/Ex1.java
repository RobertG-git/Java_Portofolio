package src.W02_ProblemeAlgoritmica;

public class Ex1 {
    /*
    https://leetcode.com/problems/reverse-words-in-a-string/
     */

    public static void main(String[] args) {
       String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] arrayS = s.split(" +");

        StringBuilder reverseS = new StringBuilder("");

        for (int i = arrayS.length - 1; i >= 0; i--) {
            reverseS.append(arrayS[i] + " ");
        }

        return reverseS.toString().trim();

    }
}

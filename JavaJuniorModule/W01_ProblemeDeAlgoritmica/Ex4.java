package src.W01_ProblemeDeAlgoritmica;

public class Ex4 {
    /*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
     */

    public static String longestCommonPrefix(String[] strs) {
        String firstLetter = "";
        boolean aux = false;

        if (strs.length == 0) {
            return firstLetter;
        }


        for (int i = 1; i <= strs[0].length(); i++) {
            firstLetter = strs[0].substring(0, i);

            for (int j = 0; j < strs.length; j++) {
                if (strs[j].startsWith(firstLetter)) {
                    aux = true;
                } else {
                    aux = false;
                    firstLetter = firstLetter.substring(0, i - 1);
                    break;
                }
            }

            if (!aux) {
                break;
            }
        }
        return firstLetter;
    }

    public static void main(String[] args) {
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
    }
}

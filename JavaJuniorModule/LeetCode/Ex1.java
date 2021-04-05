package src.LeetCode;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder newS = new StringBuilder(s);
        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j) && !(s.substring(0,i)).contains(String.valueOf(s.charAt(j)))) {
                    System.out.println(s.charAt(i) + " " +  s.charAt(j) + " " + s.substring(0,i));
                    counter++;
                    System.out.println("Cnt: " + counter);
                } else {
                    if(counter > maxCounter) {
                        maxCounter = counter;
                        System.out.println("MCnt" + maxCounter);
                    }
                    counter = 0;
                }
            }
        }

        return maxCounter;
    }
}

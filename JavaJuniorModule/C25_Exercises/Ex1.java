package src.C25_Exercises;

public class Ex1 {
    /*
    https://leetcode.com/problems/crawler-log-folder/
     */

    public int minOperations(String[] logs) {

        int counter = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (counter > 0) {
                    counter--;
                }
            } else if (log.equals("./")) {
                continue;
            } else {
                counter++;
            }
        }

        return counter;
    }
}

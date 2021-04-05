package src.W01_ProblemeDeAlgoritmica;

public class Ex6 {
    /*
    Given a binary array, find the maximum number of consecutive 1s in this array.
     */

    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            } else {
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
                counter = 0;
            }
        }

        return Math.max(counter, maxCounter);
    }
}

package src.W02_ProblemeAlgoritmica;

public class Ex2 {
    /*
    https://leetcode.com/problems/duplicate-zeros/
     */
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int counter = 0;
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (counter >= arr.length) {
                break;
            }
            newArr[counter] = arr[i];
            counter++;

            if (arr[i] == 0) {
                if (counter >= arr.length) {
                    break;
                }
                newArr[counter] = 0;
                counter++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }

    }
}

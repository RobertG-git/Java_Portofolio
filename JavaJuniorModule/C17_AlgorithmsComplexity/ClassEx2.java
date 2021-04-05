package src.C17_AlgorithmsComplexity;

public class ClassEx2 {

    public static int binarySearch(int[] sortedList, int key) {
        int left = 0;
        int right = sortedList.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (key == sortedList[middle]) {
                return middle;
            } else if (key < sortedList[middle]) {
                right = middle - 1;
            } else if (key > sortedList[middle]) {
                left = middle + 1;
            }
        }

        return -1;
    }
}

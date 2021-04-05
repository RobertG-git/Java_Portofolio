package src.C17_AlgorithmsComplexity;

public class ClassEx3 {
    public static int binarySearchAux(int[] sortedList, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (right - left) / 2;
        if (sortedList[middle] == key) {
            return middle;
        } else if (sortedList[middle] < key) {
            return binarySearchAux(sortedList,key, left, middle -1);
        } else {
            return binarySearchAux(sortedList,key,middle + 1, left);
        }
    }

    public static int binarySearchR(int[] sortedList, int key) {
        return binarySearchAux(sortedList, key,0, sortedList.length);
    }

}


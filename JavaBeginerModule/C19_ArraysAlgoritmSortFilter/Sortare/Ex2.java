package C19_ArraysAlgoritmSortFilter.Sortare;

public class Ex2 {

    /*
    Bonus.
    1. 2. Implementeaza sortarea prin selectie pentru ordonarea descrescatoare a elementelor in urmatoarele cazuri:

        array-ul va contine elemente de tipul int
        array-ul va contine elemente de tipul String - sortare alfabetica
     */

    public static void main(String[] args) {

        int[] arrayInt = {418, 2, 784, 90, 10, 17};
        String[] arrayString = {"border", "ant", "drop", "Fly", "racoon", "class", "Plane"};

        displayArray(selectSort(arrayInt));
        System.out.println();
        displayArray(selectSort(arrayString));

    }

    public static int[] selectSort(int[] array) {
        int minPosition = -1;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            int minValue = Integer.MAX_VALUE;

            for (int j = counter; j < array.length; j++) {
                if (minValue > array[j]) {
                    minValue = array[j];
                    minPosition = j;
                }
            }
            swapElements(array, minPosition, i);
            counter++;
        }
        return array;
    }

    public static String[] selectSort(String[] array) {
        int minPosition = -1;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            String minValue = "zzzzzzzzzzzzzz";

            for (int j = counter; j < array.length; j++) {

                if (array[j].compareToIgnoreCase(minValue) < 0) {
                    minValue = array[j];
                    minPosition = j;
                }
            }

            swapElements(array, minPosition, i);
            counter++;
        }
        return array;
    }

    public static void swapElements(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void swapElements(String[] array, int index1, int index2) {
        String aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void displayArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

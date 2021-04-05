package C19_ArraysAlgoritmSortFilter.Sortare;

public class Ex1 {

    /*
    Sortare
    1. Implementeaza sortarea prin metoda bulelor pentru ordonarea crescatoare a elementelor in urmatoarele cazuri:
        array-ul va contine elemente de tipul double
        array-ul va contine elemente de tipul String - sortare alfabetica

     */

    public static void main(String[] args) {

        int[] arrayInt = {418, 2, 784, 90, 10, 17};
        String[] arrayString = {"border", "ant", "drop", "Fly", "racoon", "class", "Plane"};

        displayArray(bubbleSort(arrayInt));
        System.out.println();
        displayArray(bubbleSort(arrayString));

    }

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    swapElements(array, j, j + 1);
                }
            }
        }
        return array;
    }
    public static String[] bubbleSort(String[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    swapElements(array, j, j + 1);
                }
            }
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

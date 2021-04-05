package C19_ArraysAlgoritmSortFilter.Sortare;

public class Ex3 {

        /*
        Extra mile.
        3. Implementeaza sortarea prin selectie si respectiv sortarea prin metoda bulelor pentru ordonarea crescatoare a elementelor in urmatoarele cazuri:
         - array-ul va contine elemente de tipul String - sortare in functie de lungimea cuvintelor
         - fiecare caz va fi implementat intr-o metoda separata.
       */

    public static void main(String[] args) {

        String[] arrayString = {"border", "ant", "drop", "Fly", "racoon", "class", "Plane"};

        displayArray(bubbleSort(arrayString));
        System.out.println();
        displayArray(selectSort(arrayString));

    }

    public static String[] bubbleSort(String[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j].length() > array[j + 1].length()) {
                    swapElements(array, j, j + 1);
                }
            }
        }
        return array;
    }
    public static String[] selectSort(String[] array) {
        int minPosition = -1;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            int minValue = Integer.MAX_VALUE;

            for (int j = counter; j < array.length; j++) {

                if (array[j].length() < minValue) {
                    minValue = array[j].length();
                    minPosition = j;
                }
            }

            swapElements(array, minPosition, i);
            counter++;
        }
        return array;
    }

    public static void swapElements(String[] array, int index1, int index2) {
        String aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void displayArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

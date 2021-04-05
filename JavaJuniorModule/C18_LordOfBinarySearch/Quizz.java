package src.C18_LordOfBinarySearch;

public class Quizz {
    /*
    Sa se implementeze un algoritm eficient care intoarce numarul de aparitii ale unui element dat in cadrul unui vector de elemente sortat.

    Exemplu
        Date de intrare
        array: 0 2 3 5 5 5 8 11 11 101
        key: 11
        Date de iesire
        return: 2
        Explicatie:
        Exista 2 valori 11 in vectorul de elemente sortat.
     */

    public static void main(String[] args) {
        System.out.println("Checking input...");

        int[] array = {0, 2, 3, 5, 5, 5, 8, 11, 11, 101};

        int rez = countOccurrences(array, 11);
        System.out.println("You got: " + rez + " Correct: " + 2);
    }

    public static int countOccurrences(int[] array, int key) {
        int counter = 0;

        if (binarySearch(array,key) != -1 ) {
            int indexKey = binarySearch(array,key);
            while (array[indexKey] == key) {
                indexKey--;
            }
            while (array[indexKey + 1] == key) {
                indexKey++;
                counter++;
            }
        } else {
            return -1;
        }

        return counter;
    }

    public static int binarySearch(int[] sortedList, int key) {
        int left = 0, right = sortedList.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (key == sortedList[middle]) {
                return middle;
            } else if (key < sortedList[middle]) {
                right = middle - 1;
            } else if (key > sortedList[middle]) {
                left  = middle + 1;
            }
        }
        return -1;
    }
}

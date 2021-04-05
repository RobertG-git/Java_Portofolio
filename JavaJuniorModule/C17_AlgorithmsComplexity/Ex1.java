package src.C17_AlgorithmsComplexity;

public class Ex1 {
    /*
    1. Modifica algoritmul de cautare binara prezentat in curs astfel incat sa returneze:

        - la gasirea elementului: pozitia acestuia in lista
        Obs: acest caz ramane neschimbat fata de implementarea initiala.
        - daca elementul nu se afla in lista: pozitia de insertie a elementului in lista. Mai exact, se va returna
        pozitia pe care ar trebui inserat elementul a.i. lista sa ramana ordonata.
         Obs: in algoritmul initial, pentru acest caz se returna -1.
     */

    // returns element index in list OR -1 for "not found"
    public static int binarySearchI(int[] sortedList, int key) {
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

        return right + 1;
    }
}

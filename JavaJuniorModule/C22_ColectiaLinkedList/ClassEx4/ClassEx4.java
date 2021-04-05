package src.C22_ColectiaLinkedList.ClassEx4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassEx4 {
    /*
    1. Implementeaza o metoda simpla care intoarce numarul de aparitii ale unui element intr-un ArrayList folosind Iterator pentru a parcurge colectia.
     */

    private int countOccurrences(ArrayList<String> list, String key) {
        Iterator<String> it = list.iterator();
        int count = 1;
        for (String valList: list) {
            if (valList.equals(key)) {
                count++;
            }
        }

        return count;

    }

    /*
    2. Modifica doar semnatura metodei scrise anterior pentru a putea primi ca parametru atat un ArrayList cat si un LinkedList.
        a. Cum pot fi tratate cele 2 obiecte, dintr-o perspectiva comuna? Analizeaza paginile API pentru fiecare (Hint: inheritance).
        b. Exista si o perspectiva mai generica, pentru care metoda sa functioneze in continuare? Analizeaza paginile API pentru fiecare (Hint: inheritance).

     */
        //a.
    private int countOccurrencesV2(List<String> list, String key) {
        Iterator<String> it = list.iterator();
        int count = 1;
        for (String valList: list) {
            if (valList.equals(key)) {
                count++;
            }
        }

        return count;
    }

        //b.

    private int countOccurrencesV3(Iterable<String> list, String key) {
        Iterator<String> it = list.iterator();
        int count = 1;
        for (String valList: list) {
            if (valList.equals(key)) {
                count++;
            }
        }

        return count;
    }
}

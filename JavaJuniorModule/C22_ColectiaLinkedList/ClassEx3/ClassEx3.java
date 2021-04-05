package src.C22_ColectiaLinkedList.ClassEx3;

import java.util.Iterator;
import java.util.LinkedList;

public class ClassEx3 {
    /*
    Numarul de aparitii
     */
    public static void countOccurrences(LinkedList<String> list, String key) {
        int counter = 0;
        for (String s : list) {
            if (s.equals(key)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void countOccurrencesV2(LinkedList<String> list, String key) {
        Iterator<String> it = list.iterator();
        int counter = 0;

        while (it.hasNext()) {
            if(it.next().equals(key)) {
                counter++;
            }
        }
        System.out.println(counter);

    }


}

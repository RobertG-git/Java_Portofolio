package src.C22_ColectiaLinkedList.Ex4;

import java.util.Collections;
import java.util.LinkedList;

public class Ex4 {
    /*
    Merge two sorted linked lists and return it as a sorted list with LinkedList.
    The list should be made by splicing together the nodes of the first two lists.
     */

    private static LinkedList<Integer> mergeTwoLists2(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        System.out.println(mergeTwoLists2(list1, list2));
    }
}

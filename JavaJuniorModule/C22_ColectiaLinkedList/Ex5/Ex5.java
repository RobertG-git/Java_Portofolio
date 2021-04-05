package src.C22_ColectiaLinkedList.Ex5;

import java.util.LinkedList;

public class Ex5 {
    /*
    Given the head of a linked list, rotate the list to the right by k places.
     */

    public static LinkedList<Integer> rotateRight(LinkedList<Integer> list, int k) {
        int newK = list.size() - k % list.size();
        int aux;

        while(newK > 1) {
            aux = list.getLast();
            list.removeLast();
            list.addFirst(aux);
            newK--;
        }

        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(rotateRight(list,4));
    }
}

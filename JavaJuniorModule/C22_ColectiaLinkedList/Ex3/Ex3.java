package src.C22_ColectiaLinkedList.Ex3;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex3 {

    /*
    3. [P] Quiz 12 Aminteste-ti problema de la quiz. Implementeaza acelasi algoritm folosind LinkedList.
    Concret, metoda pe care trebuie sa o implementezi devine:

    Detail: suma of 2 number codded on linkedList
     */

    public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
        ListIterator<Integer> it = op1.listIterator();
        ListIterator<Integer> it2 = op2.listIterator();

        if(!it.hasNext()) return op2;
        if(!it2.hasNext()) return op1;

        LinkedList<Integer> sum = new LinkedList<>();

        int index = 0;
        int value;

        while (it.hasNext()) it.next();
        while (it2.hasNext()) it2.next();

        while (it.hasPrevious() && it2.hasPrevious()) {
            value = it.previous() + it2.previous() + index;
            if (value > 9) {
                index = 1;
                value = value % 10;
            } else {
                index = 0;
            }
            sum.addFirst(value);
        }

        while (it.hasPrevious()) {
            value = it.previous() + index;
            if (value > 9) {
                index = 1;
                value = value % 10;
            } else {
                index = 0;
            }
            sum.addFirst(value);
        }
        while (it2.hasPrevious()) {
            value = it2.previous() + index;
            if (value > 9) {
                index = 1;
                value = value % 10;
            } else {
                index = 0;
            }
            sum.addFirst(value);
        }

        if (index > 0) {
            sum.addFirst(index);
        }

        return sum;
    }


    public static void main(String[] args) {
        LinkedList<Integer> op1 = new LinkedList<>();
        op1.add(9);
        op1.add(9);

        LinkedList<Integer> op2 = new LinkedList<>();
        op2.add(9);
        op2.add(9);
        op2.add(9);
        op2.add(9);

        System.out.println(op1);
        System.out.println(op2);

        System.out.println(sum(op1, op2));

    }
}

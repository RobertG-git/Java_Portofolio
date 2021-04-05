package src.C22_ColectiaLinkedList.Ex2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex2 {
    /*
    2.1. Se da o lista dublu inlantuita (i.e. un obiect LinkedList) ce contine valori intregi, ordonate.
        Implementeaza o metoda removeDuplicates(LinkedList<Integer>) care sterge duplicatele din lista.
        Obs: Implementarea trebuie sa fie una eficienta - tine cont de timpul / modul de functionare a operatiilor folosite.

   2.2. Se da o lista dublu inlantuita (i.e. un obiect LinkedList) ce contine valori intregi, ordonate.
        Implementeaza o metoda removeDuplicates2(LinkedList<Integer>) care sterge total duplicatele din lista (vezi exemplul, in comparatie cu 2.1).
        Obs: Si in acest caz, implementarea trebuie sa fie una eficienta - tine cont de timpul / modul de functionare a operatiilor folosite

     */
    // 2.1
    public static void removeDuplicates(LinkedList<Integer> list) {
        ListIterator<Integer> it = list.listIterator();

        int aux1 = it.next();
        int aux2 = it.next();

        while (it.hasNext()) {

            if (aux1 == aux2) {
                it.remove();
            } else {
                aux1 = aux2;
            }
            aux2 = it.next();
        }
        if (aux1 == aux2) {
            it.remove();
        }
    }

    // 2.2
    public static void removeDuplicates2(LinkedList<Integer> list) {
        ListIterator<Integer> it = list.listIterator();

        int aux1 = it.next();
        int aux2 = it.next();

        boolean previousToRemove = false;

        while (it.hasNext()) {

            while (aux1 == aux2) {
                it.remove();
                aux2 = it.next();
                previousToRemove = true;
            }

            if (previousToRemove) {
                it.previous();
                it.previous();
                it.remove();
                aux1 = it.next();
                if (it.hasNext()) {
                    aux2 = it.next();
                } else {
                    break;
                }
                previousToRemove = false;
            } else {
                aux1 = aux2;
                aux2 = it.next();
            }
        }

        if (aux1 == aux2) {
            it.previous();
            it.remove();
            it.previous();
            it.remove();
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(10);
        list.add(10);

//        System.out.println("2.1 list test:");
//        System.out.println(list.toString());
//        removeDuplicates(list);

        System.out.println("2.2 list test:");
        System.out.println(list.toString());
        removeDuplicates2(list);

        System.out.println(list);

    }
}

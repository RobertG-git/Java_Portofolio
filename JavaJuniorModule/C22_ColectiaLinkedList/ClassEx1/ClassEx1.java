package src.C22_ColectiaLinkedList.ClassEx1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ClassEx1 {

    public static void main(String[] args) {
        LinkedList<String> towns = new LinkedList<>();

        towns.add("Cluj");
        towns.add("Targu Jiu");
        towns.add("Suceava");
        towns.add("Bucuresti");
        towns.add("Brasov");

        //List read

        // O(n^2) -> not recommended
        for (int i = 0; i < towns.size(); i++) {
            System.out.println(towns.get(i));
        }
        System.out.println();

        // with iterator O(n)
        Iterator<String> it = towns.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        // with for each O(n)
        for (String s : towns) {
            System.out.println(s);
        }
        System.out.println();

        // ListIterator

        // iterate over a list, using a specialized LinkedList iterator:
        ListIterator<String> listIt = towns.listIterator();

        // I. forward
        while (listIt.hasNext()) {
            System.out.println("Current town is: " + listIt.next());
        }
        System.out.println();

        // II. backward
        while (listIt.hasPrevious()) {
            System.out.println("Curent town is: " + listIt.previous());
        }
        System.out.println();


    }
}

package src.C5_ArrayListColectii;

import java.util.ArrayList;

public class Ex1 {

    /*
    0. Scrie o aplicatie care sa gestioneze o lista de elemente, folosind cat mai multe metode de lucru cu ArrayList<E>
    dintre cele prezentate anterior. Scopul exercitiului este sa devii familiar cu utilizarea colectiei studiate si sa
    observi, in practica, facilitatile de manipulare a elementelor oferite, comparativ cu array-urile. In consecinta,
    aplicatia ta trebuie sa utilizeze cel putin urmatoarele metode:

    Metoda	void add(int index, E element)
    boolean add(E element)
    int size()
    boolean contains(Object o)
    E get(int index)
    int indexOf(Object o)
    int lastIndexOf(Object o)
    boolean remove(Object o)
    E remove(int index)
    void clear()
    E set(int index, E element)
     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add(0,"Robert");
        names.add(1, "Ioana");
        names.add(0,"George");
        names.add("Anna");
        names.add("Robert");

        System.out.println("List: " + names);
        System.out.println("Size: " + names.size());

        System.out.println("Contain Ioana? R: " + names.contains("Ioana"));
        System.out.println("Contain Radu? R: " + names.contains("Radu"));

        System.out.println("Get '2': " + names.get(2));
        System.out.println("IndexOf Robert: " + names.indexOf("Robert"));
        System.out.println("LastIndexOf Robert: " + names.lastIndexOf("Robert"));

        System.out.println("Remove George: " + names.remove("George"));
        System.out.println("New list: " + names);

        names.set(1,"Raluca");
        System.out.println("Position '1' name change: " + names);

        names.clear();
        System.out.println("List after clear: " + names);

    }
}

package src.C6_MyIntArrayList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //add
        MyIntArrayList a = new MyIntArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("a.add(3) is: " +  a.add(3));
        System.out.print("ArrayList 'a' is: ");
        a.display();

        //constructor + add with index
        MyIntArrayList b = new MyIntArrayList(a);
        b.add(4, 5);
        System.out.print("ArrayList 'b' is: ");
        b.display();

        //size
        System.out.println("\n" + "Size of 'a' is: " + a.size());
        System.out.println("Size of 'b' is: " + b.size());

        //contains
        System.out.println("\n" + "A contains'4' is: " + a.contains(4));
        System.out.println("B contains'6' is: " + b.contains(6));

        //get
        System.out.println("\n" + "a.get(0) is: " + a.get(0));
        System.out.println("b.get(3) is: " + b.get(3));

        //indexOf
        System.out.println("\n" + "a.indexOf(3) is: " + a.indexOf(3));
        System.out.println("b.indexOf(9) is: " + b.indexOf(9));

        //lastIndexOf
        System.out.println("\n" + "a.lastIndexOf(3) is: " + a.lastIndexOf(3));
        System.out.println("b.lastIndexOf(4) is: " + b.lastIndexOf(4));

        //remove
        System.out.println("\n" + "a.remove(1) is: " + a.remove(1));
        System.out.print("ArrayList 'a' is: ");
        a.display();

        //removeElementAtIndex
        System.out.println("\n" + "a.removeElementAtIndex(1) is: " + a.removeElementAtIndex(1));
        System.out.print("ArrayList 'a' is: ");
        a.display();

        //void clear()
        a.clear();
        System.out.print("\n" + "ArrayList 'a' after clear is: ");
        a.display();
        System.out.println();

        //set
        System.out.println("b.set(0,9) is: " + b.set(0,9));
        System.out.print("ArrayList 'b' after set is: ");
        b.display();

        //addAll
        System.out.println("\n" + "a.addAll(b) is: " + a.addAll(b));
        System.out.print("ArrayList 'a' after a.add(b) is: ");
        a.display();
        System.out.println("a.size is: " + a.size());

        //addAll with Index
        System.out.println();
        System.out.println("a.addAll(3,b) is: " + a.addAll(3,b));
        System.out.print("ArrayList 'a' after a.add(3, b) is: ");
        a.display();
        System.out.print("ArrayList 'b' after a.add(3, b) is: ");
        b.display();

        //int[] toArray()
        System.out.print("\n" + "a.toArray() is: ");
        System.out.println(Arrays.toString(a.toArray()));

        //ensureCapacity
        a.ensureCapacity(12);

        //trimToSize
        a.trimToSize();
    }
}

package src.C24_Stiva_LinkedList_Work.Ex1;

import java.util.Arrays;

public class Testing_MyLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> rgList = new MyLinkedList<>();
        rgList.add(10);
        rgList.add(12);
        rgList.add(10);
        rgList.add(20);
        rgList.add(3,100);


        System.out.println("MyList: " + Arrays.toString(rgList.toArray()));

        System.out.println("MyListFromTail: " + Arrays.toString(rgList.toArrayFromTail()));

        System.out.println("Size: " + rgList.size());

        int e = 100;
        System.out.println("Contain '" + e + "'? R: " + rgList.contains(e));

        int g = 2;
        System.out.println("Get '" + g + "'? R: " + rgList.get(g));

        int i = 10;
        System.out.println("IndexOf '" + i + "'? R: " + rgList.indexOf(i));

        int l = 10;
        System.out.println("LastIndexOf '" + l + "'? R: " + rgList.lastIndexOf(l));

        int r = 10;
        System.out.println("Remove '" + r + "'? R: " + rgList.remove(r));
        System.out.println("MyList: " + Arrays.toString(rgList.toArray()));

        int r2 = 2;
        System.out.println("RemoveAtIndex '" + r2 + "'? R: " + rgList.removeElementAtIndex(r2));
        System.out.println("MyList: " + Arrays.toString(rgList.toArray()));

        rgList.clear();
        System.out.println("Cleared list: " + Arrays.toString(rgList.toArray()));
        rgList.add(10);
        rgList.add(12);
        rgList.add(10);
        rgList.add(20);
        rgList.add(3,100);
        System.out.println("MyList: " + Arrays.toString(rgList.toArray()));

        System.out.println("Value changed: " + rgList.set(0,11));
        System.out.println("New List after value change: " + Arrays.toString(rgList.toArray()));

        MyLinkedList<Integer> rgList2 = new MyLinkedList<>();
        rgList2.add(99);
        rgList.addAll(rgList2);
        System.out.println("Add all: " + Arrays.toString(rgList.toArray()));

        rgList.addAll(5,rgList2);
        System.out.println("Add all from index: " + Arrays.toString(rgList.toArray()));

    }
}

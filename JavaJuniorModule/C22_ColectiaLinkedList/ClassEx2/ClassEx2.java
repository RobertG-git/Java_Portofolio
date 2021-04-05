package src.C22_ColectiaLinkedList.ClassEx2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ClassEx2 {

    /*
    ListIterator: Utilizarea combinata a next() si previous()
     */

    private static Scanner scanner = new Scanner(System.in);

    public static void printManual() {
        System.out.println("Options are:\n" +
                "\t0 - quit\n" +
                "\t1 - next element\n" +
                "\t2 - previous element\n" +
                "\t3 - this list\n");
    }

    public static void iterate(LinkedList<String> towns){
        ListIterator<String> it = towns.listIterator();
        printManual();

        boolean moveForward =  true;

        while (true) {
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    return;
                case 1:
                    if (!moveForward) {
                        moveForward = true;
                        if(it.hasNext()) {
                            it.next();
                        }
                    }
                    if(it.hasNext()) {
                        System.out.println(it.next());
                        moveForward = true;
                    }
                    break;
                case 2:
                    if (moveForward) {
                        moveForward = false;
                        if(it.hasPrevious()) {
                            it.previous();
                        }
                    }
                    if(it.hasPrevious()) {
                        System.out.println(it.previous());
                    }
                    break;
                case 3:
                    printManual();
                    break;
                default:
                    System.out.println("Unknown command");
                    printManual();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<String> towns = new LinkedList<>();

        towns.add("Cluj");
        towns.add("Targu Jiu");
        towns.add("Suceava");
        towns.add("Bucuresti");
        towns.add("Brasov");

        iterate(towns);
    }

}

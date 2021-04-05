package src.P3_AplicatiiCuStiveSiCozi.RadixSort;

import java.util.*;

public class RadixSort {

    /*
    Un algoritm celebru de sortare a numerelor intregi este Radix sort.
    Modelul de sortare folosit de acesta implica comparatii succesive la nivel de cifra, toata colectia de numere
        fiind ordonata la fiecare pas in functie de valorile cifrelor de pe o anumita pozitie (i.e. corespunzatoare
        pasului / iteratiei curente).

    Vom implementa la curs o varianta simplificata a Radix Sort pentru ordonarea numerelor naturale.
    Acesta varianta foloseste 10 cozi (i.e. cate una pentru fiecare cifra de la 0 la 9) si functioneaza prin sortarea
        numerelor pas cu pas, in functie de valorile cifrelor de pe o anumita pozitie, anume:

        1. in prima iteratie numerele se vor sorta dupa cifra unitatilor,
        2. apoi, in a doua dupa cifra zecilor,
        3. a sutelor,
        4. s.a.m.d.
   Dupa fiecare pas de sortare (i.e. iteratie), numerele sunt repuse in colectie "pseudo-ordonate" in functie de
        valoarea cifrelor de pe pozitia sortata la pasul curent. Sa analizam in continuare un exemplu.

        Cerinte:
        1. Implementeaza Radix Sort conform specificatiilor anterioare, astfel incat sa se ordoneze crescator orice
            multime de numere naturale.
        2. Modifica algoritmul anterior astfel incat programul sa realizeze ordonarea descrescatoare a numerelor naturale.

     */

    public static void main(String[] args) {
        int[] unsortedList = {1000, 4, 25, 319, 88, 51, 3430, 8471, 701, 1, 2989, 657, 713};

        System.out.println("Unsorted list is:");
        System.out.println(Arrays.toString(unsortedList));
        System.out.println("Ascending sort is:");
        ascendingRadixSort(unsortedList);
        System.out.println("Descending sort is:");
        descendingRadixSort(unsortedList);
    }

    public static void ascendingRadixSort(int[] unsortedList) {
        Queue<String> sortedList = numberLengthConvertor(unsortedList);

        int maxLength;
        if (!sortedList.isEmpty()) {
            maxLength = sortedList.peek().length() - 1;
        } else {
            System.out.println("list to sort si empty");
            return;
        }

        Queue<String> zero = new LinkedList<>();
        Queue<String> one = new LinkedList<>();
        Queue<String> two = new LinkedList<>();
        Queue<String> three = new LinkedList<>();
        Queue<String> four = new LinkedList<>();
        Queue<String> five = new LinkedList<>();
        Queue<String> six = new LinkedList<>();
        Queue<String> seven = new LinkedList<>();
        Queue<String> eight = new LinkedList<>();
        Queue<String> nine = new LinkedList<>();

        for (int i = maxLength; i >= 0; i--) {
            while (!sortedList.isEmpty()) {
                String aux = sortedList.poll();
                String s = String.valueOf(aux.charAt(i));
                switch (s) {
                    case "0" -> zero.offer(aux);
                    case "1" -> one.offer(aux);
                    case "2" -> two.offer(aux);
                    case "3" -> three.offer(aux);
                    case "4" -> four.offer(aux);
                    case "5" -> five.offer(aux);
                    case "6" -> six.offer(aux);
                    case "7" -> seven.offer(aux);
                    case "8" -> eight.offer(aux);
                    case "9" -> nine.offer(aux);
                }
            }
            while (!zero.isEmpty()) sortedList.offer(zero.poll());
            while (!one.isEmpty()) sortedList.offer(one.poll());
            while (!two.isEmpty()) sortedList.offer(two.poll());
            while (!three.isEmpty()) sortedList.offer(three.poll());
            while (!four.isEmpty()) sortedList.offer(four.poll());
            while (!five.isEmpty()) sortedList.offer(five.poll());
            while (!six.isEmpty()) sortedList.offer(six.poll());
            while (!seven.isEmpty()) sortedList.offer(seven.poll());
            while (!eight.isEmpty()) sortedList.offer(eight.poll());
            while (!nine.isEmpty()) sortedList.offer(nine.poll());

        }

        System.out.println(sortedList.toString());
    }

    public static void descendingRadixSort(int[] unsortedList) {
        Queue<String> sortedList = numberLengthConvertor(unsortedList);

        int maxLength;
        if (!sortedList.isEmpty()) {
            maxLength = sortedList.peek().length() - 1;
        } else {
            System.out.println("list to sort si empty");
            return;
        }

        Deque<String> zero = new LinkedList<>();
        Deque<String> one = new LinkedList<>();
        Deque<String> two = new LinkedList<>();
        Deque<String> three = new LinkedList<>();
        Deque<String> four = new LinkedList<>();
        Deque<String> five = new LinkedList<>();
        Deque<String> six = new LinkedList<>();
        Deque<String> seven = new LinkedList<>();
        Deque<String> eight = new LinkedList<>();
        Deque<String> nine = new LinkedList<>();

        for (int i = maxLength; i >= 0; i--) {
            while (!sortedList.isEmpty()) {
                String aux = sortedList.poll();
                String s = String.valueOf(aux.charAt(i));
                switch (s) {
                    case "0" -> zero.offer(aux);
                    case "1" -> one.offer(aux);
                    case "2" -> two.offer(aux);
                    case "3" -> three.offer(aux);
                    case "4" -> four.offer(aux);
                    case "5" -> five.offer(aux);
                    case "6" -> six.offer(aux);
                    case "7" -> seven.offer(aux);
                    case "8" -> eight.offer(aux);
                    case "9" -> nine.offer(aux);
                }
            }

            while (!nine.isEmpty()) sortedList.offer(nine.poll());
            while (!eight.isEmpty()) sortedList.offer(eight.poll());
            while (!seven.isEmpty()) sortedList.offer(seven.poll());
            while (!six.isEmpty()) sortedList.offer(six.poll());
            while (!five.isEmpty()) sortedList.offer(five.poll());
            while (!four.isEmpty()) sortedList.offer(four.poll());
            while (!three.isEmpty()) sortedList.offer(three.poll());
            while (!two.isEmpty()) sortedList.offer(two.poll());
            while (!one.isEmpty()) sortedList.offer(one.poll());
            while (!zero.isEmpty()) sortedList.offer(zero.poll());
        }

        System.out.println(sortedList.toString());
    }

    public static Queue<String> numberLengthConvertor(int[] unsortedList) {
        int maxValue = 0;
        int counter = 0;
        Queue<String> convertedList = new ArrayDeque<>();

        for (int j : unsortedList) {
            if (maxValue < j) {
                maxValue = j;
            }
        }

        while (maxValue > 0) {
            counter++;
            maxValue /= 10;
        }

        for (int j : unsortedList) {
            convertedList.offer(String.format("%0" + counter + "d", j));
        }

        return convertedList;
    }
}

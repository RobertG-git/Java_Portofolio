package C23_RecapitulareFinala;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    /*
    Implementeaza o metoda care primeste ca parametru un array de numere intregi si o valoare cautata key.
    Metoda returneaza numarul total de aparitii ale cheii in array.
     */

    public static void main(String[] args) {
        int key;
        int counter = 0;
        int numberOfElements = 0;
        int[] array = new int[2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'key': ");
        key = sc.nextInt();
        System.out.println("Please insert your array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] == key) {
                counter++;
            }
            numberOfElements++;
            if (numberOfElements == array.length) {
                array = Arrays.copyOf(array, array.length * 2);
            }
        }
        array = Arrays.copyOf(array, numberOfElements);

        System.out.println(counter);

    }
}

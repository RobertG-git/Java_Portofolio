package C23_RecapitulareFinala;

import java.util.Arrays;

public class Ex2 {
    /*
    Implementeaza o metoda in Java care primeste ca parametru un array de siruri de caractere ce poate contine duplicate si returneaza un nou array fara duplicate.
    Concret, array-ul returnat va contine fiecare String din array-ul primit ca parametru o singura data.
     */

    public static void main(String[] args) {
        String[] array = {"Ana", "are", "mere", "mere"};
        displayArray(array);
        System.out.println();
        displayArray(removeDuplicates(array));
    }

    public static String[] removeDuplicates(String[] array) {
        String[] newArray = new String[array.length];
        int numberOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].equals(array[i])) {
                    counter++;
                }
            }

            if (counter < 1) {
                newArray[numberOfElements] = array[i];
                numberOfElements++;
            }
        }
        newArray = Arrays.copyOf(newArray,numberOfElements);
        return newArray;
    }

    public static void displayArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

package C21_PrelucrareaSirurilorStringBuilder.Ex2;

import java.util.Scanner;

public class Main {
    /*
    2. Se citeste de la tastatura un numar n, ce reprezinta numarul de cuvinte, urmat de citirea a n cuvinte (i.e. fara spatii).
    Cuvintele vor fi stocate intr-un array corespunzator. Sa se implementeze urmatoarele metode:

    String secondWordInArray(String[])
        - primeste ca parametru multimea de cuvinte si returneaza al doilea cuvant in ordine lexicografica
    String lastButOneInArray(String[])
        - primeste ca parametru multimea de cuvinte si returneaza penultimul cuvant in ordine lexicografica
     */

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();
        System.out.println("Please insert your " + n + " names: ");

        String[] arrayWords = new String[n];
        for (int i = 0; i < arrayWords.length; i++){
            arrayWords[i] = sc.next();
        }

        System.out.print("Second word in array is: ");
        System.out.print(secondWordInArray(arrayWords));

        System.out.println();
        System.out.print("Last but one in array is: ");
        System.out.print(lastButOneInArray(arrayWords));

    }

    public static String secondWordInArray(String[] array) {
        int minPosition = -1;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            String minValue = "zzzzzzzzzzzzzzzzz";

            for (int j = counter; j < array.length; j++) {

                if (minValue.compareToIgnoreCase(array[j]) > 0) {
                    minValue = array[j];
                    minPosition = j;
                }
            }

            swap(array, minPosition, i);
            counter++;
        }
        System.out.println("array is: ");
        displayArray(array);
        System.out.println();

        return array[1];


    }

    public static String lastButOneInArray(String[] array) {
        int minPosition = -1;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            String minValue = array[i];

            for (int j = counter; j < array.length; j++) {

                if (minValue.compareToIgnoreCase(array[j]) > 0) {
                    minValue = array[j];
                    minPosition = j;
                }
            }

            swap(array, minPosition, i);
            counter++;
        }
        return array[array.length - 2];
    }

    public static boolean swap(String[] array, int index1, int index2) {

        // validarea indecsilor
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {

            return false;
        }

        // algoritmul de interschimbare
        String aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;

        return true;

    }

    public static void displayArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }


}

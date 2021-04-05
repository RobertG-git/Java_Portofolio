package C19_ArraysAlgoritmSortFilter.Filtrare;

import java.util.Scanner;

public class Ex1 {
    /*
    1. Se citeste de la tastatura un numar n, ce reprezinta numarul de cuvinte, urmat de citirea a n cuvinte (i.e. fara spatii).
    Cuvintele vor fi stocate intr-un array corespunzator. Ulterior se citeste de la tastatura un cuvant, ce contine numai litere.
    Sa se afiseze pentru fiecare litera a cuvantului, pe rand, toate elementele din multime care incep cu litera respectiva.
     */

    public static void main(String[] args) {

        int n;
        String stringLetter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();

        System.out.println("Please insert your 'n words string' : ");
        String[] arrayString = new String[n];
        for (int i = 0; i < n; i++) {
            arrayString[i] = sc.next();
        }

        System.out.println("Please insert your 'stringLetter' : ");
        stringLetter = sc.next();

        System.out.println("Your filtered string is: ");
        filterBasedOnStringLetter(arrayString, stringLetter);

    }

    public static void filterBasedOnStringLetter(String[] array, String stringLetter) {
        stringLetter = convertToUniqueString(stringLetter);
        char[] charStringLetter = stringLetter.toCharArray();

        for (int j = 0; j < charStringLetter.length; j++) {
            int counter = 0;

            for (int i = 0; i < array.length; i++) {
                char[] charArray = array[i].toLowerCase().toCharArray();

                if (charStringLetter[j] == charArray[0]) {
                    counter++;
                    if (counter <= 1) {
                        System.out.print("\n" + charStringLetter[j] + ": ");
                    }
                    System.out.print(array[i] + ", ");
                }
            }
        }
    }

    public static String convertToUniqueString(String string) {
        string = string.toLowerCase();
        String uniqueStringLetter = "";
        char[] arrayStringLetter = string.toCharArray();

        for (int i = 0; i < arrayStringLetter.length; i++) {
            boolean isUnique = true;

            for (int j = i + 1; j < arrayStringLetter.length; j++) {
                if (arrayStringLetter[i] == arrayStringLetter[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueStringLetter += arrayStringLetter[i] + "";
            }
        }

        return uniqueStringLetter;
    }

}

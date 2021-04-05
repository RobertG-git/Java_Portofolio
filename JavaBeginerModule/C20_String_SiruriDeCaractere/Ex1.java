package C20_String_SiruriDeCaractere;

import java.util.Scanner;

public class Ex1 {

    /*
    1. Se citeste de la tastatura un sir de caractere, care poate contine spatii.
    Afiseaza numarul de aparitii ale fiecarui caracter din String.
     */

    public static void characterOccurrence(String string) {
        int counter;
        int charToCheck;

        for (int i = 0; i < string.length(); i++) {
            counter = 0;
            charToCheck = string.charAt(i);

            for (int j = 0; j < string.length(); j++) {
                if (charToCheck == string.charAt(j)) {
                    counter++;
                }
            }

            if (isCharUnique(string.substring(i), string.charAt(i))) {
                System.out.println("Character " + (char) charToCheck + " appears: " + counter + " time(s).");
            }
        }
    }

    public static boolean isCharUnique(String string, char charToCheck) {
        int counter = 0;
        boolean isCharUnique = false;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == charToCheck) {
                counter++;
            }
        }
        if (counter <= 1) {
            isCharUnique = true;
        }

        return isCharUnique;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'string to check': ");

        String stringToCheck = sc.nextLine();
        characterOccurrence(stringToCheck);

    }
}

package C22_AlgoritmiDeProcesareAStringurilor;

public class Ex1 {
    /*
    1. Implementeaza o metoda care primeste ca parametri (1) o propozitie,
    alcatuita din cuvinte separate prin spatii si semne de punctuatie si (2) un cuvant,
    denumit cheie, alcatuit numai din literele alfabetului englez si care returneaza:

        a) numarul de cuvinte care contin cel putin un caracter din cheie
        b) numarul de cuvinte din propozitie care incep cu oricare dintre literele cheii
     */

    public static void main(String[] args) {
        String key = "WORDS";
        String sentence = "Ana are mere";

        // a)
        System.out.println(nbWOrdsWithCharFromKey(sentence, key));
        // b)
        System.out.println(nbWOrdsWhichStartWithCharKey(sentence, key));

    }

    public static int nbWOrdsWithCharFromKey(String sentence, String key) {
        key = key.toLowerCase();
        sentence = sentence.toLowerCase();

        StringBuilder sbKey = new StringBuilder(key);
        for (int i = 0; i < sbKey.length(); i++) {
            for (int j = 0; j < sbKey.length(); j++) {
                if (!isCharUnique(sbKey, sbKey.charAt(j))) {
                    sbKey.delete(j,j+1);
                }
            }
        }

        String[] arraySentence = sentence.split("\\W+");

        int counter = 0;
        int previousCounter = 0;

        for (int i = 0; i < arraySentence.length; i++) {
            for (int j = 0; j < arraySentence[i].length(); j++) {
                for (int k = 0; k < key.length(); k++) {
                    if (arraySentence[i].charAt(j) == key.charAt(k)) {
                        counter++;
                        break;
                    }
                }
                if (previousCounter != counter) {
                    previousCounter = counter;
                    break;
                }
            }
        }

        return counter;
    }

    public static int nbWOrdsWhichStartWithCharKey(String sentence, String key) {
        key = key.toLowerCase();
        sentence = sentence.toLowerCase();

        StringBuilder sbKey = new StringBuilder(key);
        for (int i = 0; i < sbKey.length(); i++) {
            for (int j = 0; j < sbKey.length(); j++) {
                if (!isCharUnique(sbKey, sbKey.charAt(j))) {
                    sbKey.delete(j,j+1);
                }
            }
        }

        String[] arraySentence = sentence.toLowerCase().split("\\W+");

        int counter = 0;

        for (int i = 0; i < arraySentence.length; i++) {
            for (int k = 0; k < key.length(); k++) {
                if (arraySentence[i].charAt(0) == key.charAt(k)) {
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }

    public static boolean isCharUnique(StringBuilder string, char charToCheck) {
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
}

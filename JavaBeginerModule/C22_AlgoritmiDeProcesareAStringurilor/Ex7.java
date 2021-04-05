package C22_AlgoritmiDeProcesareAStringurilor;

public class Ex7 {
    /*
     7. Implementeaza o metoda int countVowels(String str) care returneaza numarul total de litere vocale
     (i.e. din alfabetul limbii engleze) dintr-un sir de caractere primit ca parametru.

     7.1. Implementeaza o metoda int countUniqueVowels(String str) care returneaza numarul de vocale unice (i.e. din alfabetul limbii engleze) dintr-un sir de caractere primit ca parametru.
     Exemplu: „Andrei va deveni programator“ → 4

     7.2. Implementeaza o metoda int countUniqueAppearanceVowels(String str) care returneaza numarul de litere vocale (i.e. din alfabetul limbii engleze) ce apar o singura data in sirul de caractere primit ca parametru.
     Exemplu: „Andrei va deveni instructor“ → 2

     */
    public static void main(String[] args) {
        String str = "Andrei va deveni instructor";

        System.out.println(countVowels(str));
        System.out.println(countUniqueVowels(str));
        countUniqueAppearanceVowels(str);
    }

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                counter++;
            }
        }

        return counter;
    }

    public static int countUniqueVowels(String str) {
        str = str.toLowerCase();
        int counterA = 0;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                counterA++;
            }
            if (str.charAt(i) == 'e') {
                counterE++;
            }
            if (str.charAt(i) == 'i') {
                counterI++;
            }
            if (str.charAt(i) == 'o') {
                counterO++;
            }
            if (str.charAt(i) == 'U') {
                counterU++;
            }
        }

        if (counterA > 0) {
            sum += 1;
        }
        if (counterE > 0) {
            sum += 1;
        }
        if (counterI > 0) {
            sum += 1;
        }
        if (counterO > 0) {
            sum += 1;
        }
        if (counterU > 0) {
            sum += 1;
        }

        return sum;
    }

    public static void countUniqueAppearanceVowels(String str) {
        str = str.toLowerCase();
        int counterA = 0;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                counterA++;
            }
            if (str.charAt(i) == 'e') {
                counterE++;
            }
            if (str.charAt(i) == 'i') {
                counterI++;
            }
            if (str.charAt(i) == 'o') {
                counterO++;
            }
            if (str.charAt(i) == 'u') {
                counterU++;
            }
        }
        if (counterA == 1) {
            System.out.println("a");
        }
        if (counterE == 1) {
            System.out.println("e");
        }
        if (counterI == 1) {
            System.out.println("i");
        }
        if (counterO == 1) {
            System.out.println("o");
        }
        if (counterU == 1) {
            System.out.println("u");
        }
    }
}

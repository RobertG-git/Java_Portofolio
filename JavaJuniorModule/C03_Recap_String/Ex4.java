package src.C3_Recap_String;

import java.util.Arrays;

public class Ex4 {
    /*
    4. Filter: String template
    Implementeaza o metoda care realizeaza filtrarea selectiva a tuturor cuvintelor dintr-un array (i.e. words),
    in functie de o cheie (i.e. key) si o valoare a gradului de asemanare (i.e. matchKey), dat de numarul minim de caractere identice.

    Spunem ca doua cuvinte au o litera identica daca: (1) litera este aceeasi (i.e. se ignora diferenta majuscula / minuscula)
    si (2) se afla pe aceeasi pozitie in cele doua cuvinte. Cateva exemple sunt:

    car ↔ rabbit: o litera identica (ingrosata)
    doctor ↔ risk: nicio litera identica
    design ↔ engineer: o litera identica (ingrosata)
    dance ↔ vaccine: 2 litere identice (ingrosate)
     */

    public static void main(String[] args) {
        String[] words = {"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
        String key = "plot";

        wordFilter(words,key,3);
    }

    public static void wordFilter(String[] words, String key, int n) {
        String[] newWords = new String[words.length];
        int numberOfElements = 0;

        for (int i = 0; i < words.length; i++) {
            int counter = 0;
            for (int j = 0; j < (Math.min(words[i].length(), key.length())); j++) {
                if (words[i].toLowerCase().charAt(j) == key.toLowerCase().charAt(j)) {
                    counter++;
                }
            }

            if(counter >= n) {
                newWords[numberOfElements] = words[i];
                numberOfElements++;
            }
        }
        newWords = Arrays.copyOf(newWords,numberOfElements);

        for(int i = 0; i < newWords.length; i++) {
            System.out.print(newWords[i] + " ");
        }
    }
}

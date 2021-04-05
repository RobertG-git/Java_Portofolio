package src.C5_ArrayListColectii;

import java.util.ArrayList;

public class Ex2 {
    /*
    1. (Recapitulare II - Frecventa maxima) Aminteste-ti problema frecventei maxime intr-o colectie de elemente.
    Pe scurt, dandu-se o multime de elemente (ce poate contine duplicate) sa se determine subsetul de elemente care apar cel mai des in lista.

    In capitolul recapitulativ, am rezolvat problema prin 2 parcurgeri ale array-ului de elemente:

        1. prima parcurge determina numarul maxim de aparitii ale unui element
        2. a doua parcurgere detecta si afisa fiecare element din array care are un numar de aparitii egal cu numarul
            maxim de aparitii (i.e. determinat in pasul anterior).
    Task-ul tau este sa gasesti o noua abordare de rezolvare, care sa rezolve problema frecventei maxime dintr-o singura iteratie.
    In acest sens, poti folosi un ArrayList<E> suplimentar care sa stocheze, toate elementele cu frecventa maxima.
     */

    public static void main(String[] args) {
        String sentence = "Sssiiiimple sentence!";
        printCharWithMaxFrequency(sentence);
        System.out.println();
        printCharWithMinFrequency(sentence);
    }

    public static void printCharWithMaxFrequency(String sentence) {
        sentence = sentence.toLowerCase();
        ArrayList<Character> newChar = new ArrayList<Character>();
        int counter;
        int maxFrequency = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i))) {
                continue;
            }
            counter = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(i) == sentence.charAt(j)) {
                    counter++;
                }
            }
            if ((counter > maxFrequency) && (!newChar.contains(sentence.charAt(i)))) {
                newChar.clear();
                newChar.add(sentence.charAt(i));
                maxFrequency = counter;
            }
            if ((counter == maxFrequency) && (!newChar.contains(sentence.charAt(i)))) {
                newChar.add(sentence.charAt(i));
            }
        }

        System.out.println("Char(s) with max frequency :" + newChar + "\nFrequency is: " + maxFrequency);
    }

    public static void printCharWithMinFrequency(String sentence) {
        sentence = sentence.toLowerCase();
        ArrayList<Character> newChar = new ArrayList<Character>();
        int counter;
        int minFrequency = Integer.MAX_VALUE;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i))) {
                continue;
            }
            counter = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(i) == sentence.charAt(j)) {
                    counter++;
                }
            }
            if ((counter < minFrequency) && (!newChar.contains(sentence.charAt(i)))) {
                newChar.clear();
                newChar.add(sentence.charAt(i));
                minFrequency = counter;
            }
            if ((counter == minFrequency) && (!newChar.contains(sentence.charAt(i)))) {
                newChar.add(sentence.charAt(i));
            }
        }

        System.out.println("Char(s) with min frequency :" + newChar + "\nFrequency is: " + minFrequency);
    }
}

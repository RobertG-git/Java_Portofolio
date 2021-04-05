package src.C3_Recap_String;

public class Ex1 {
    /*
    1. Frecventa maxima
    a. Implementează o metoda care primeste ca parametru un sir de caractere si afiseaza caracterul,
    diferit de spatii albe, cu cea mai mare frecventa din sir alaturi de numarul de aparitii.
    In cazul in care exista mai multe caractere cu aceeasi frecventa (maxima), metoda va afisa fiecare caz in parte, pe cate o linie.

     b. Pornind de la aplicatia anterioara si realizand modificarile necesare, scrie o metoda care afiseaza caracterul /
     caracterele cu numar minim de aparitii, alaturi de frecventa de aparitie.
     */

    public static void main(String[] args) {
        String sentence = "Becoming a programmer is like gaining super powers!";
        maxLetterFrequency(sentence);
        System.out.println();
        minLetterFrequency(sentence);
    }

    // a.
    public static void maxLetterFrequency(String sentence) {
        int maxCounter = 0;
        char maxLetters ;
        for (int i = 0 ; i < sentence.length(); i++) {
            int counter = 0;
            for(int j = 0; j < sentence.length(); j++) {
                if (sentence.toLowerCase().charAt(i) == sentence.toLowerCase().charAt(j) && !Character.isWhitespace(sentence.charAt(i))) {
                    counter++;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
            }
        }
        for (int i = 0 ; i < sentence.length(); i++) {
            int counter = 0;
            for(int j = i; j < sentence.length(); j++) {
                if (sentence.toLowerCase().charAt(i) == sentence.toLowerCase().charAt(j) && !Character.isWhitespace(sentence.charAt(i))) {
                    counter++;
                }
            }
            if (counter == maxCounter) {
                maxLetters = sentence.toLowerCase().charAt(i);
                System.out.println("Character " + maxLetters + " appears " + maxCounter + " times.");
            }
        }

    }

    //b.
    public static void minLetterFrequency(String sentence) {
        int minCounter = Integer.MAX_VALUE;
        char maxLetters ;
        for (int i = 0 ; i < sentence.length(); i++) {
            int counter = 0;
            if(Character.isWhitespace(sentence.charAt(i))) {
                continue;
            }
            for(int j = 0; j < sentence.length(); j++) {
                if (sentence.toLowerCase().charAt(i) == sentence.toLowerCase().charAt(j)) {
                    counter++;
                }
            }
            if (counter < minCounter) {
                minCounter = counter;
            }
        }
        for (int i = 0 ; i < sentence.length(); i++) {
            int counter = 0;
            for(int j = 0; j < sentence.length(); j++) {
                if (sentence.toLowerCase().charAt(i) == sentence.toLowerCase().charAt(j) && !Character.isWhitespace(sentence.charAt(i))) {
                    counter++;
                }
            }
            if (counter == minCounter) {
                maxLetters = sentence.toLowerCase().charAt(i);
                System.out.println("Character " + maxLetters + " appears " + minCounter + " times.");
            }
        }

    }

}

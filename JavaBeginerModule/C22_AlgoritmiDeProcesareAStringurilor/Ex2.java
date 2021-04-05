package C22_AlgoritmiDeProcesareAStringurilor;

public class Ex2 {

    /*
    2. Se da o propozitie, alcatuita din cuvinte (i.e. insiruiri de litere si cifre) separate prin spatii si semne de punctuatie.
    Scrie un program care preia o astfel de propozitie de la utilizator si determina daca propozitia formeaza un palindrom sau nu,
    ignorandu-se orice caracter diferit de litere sau cifre. La final, programul va afisa un mesaj corespunzator.
     */

    public static void main(String[] args) {
        String sentence = "A man, a plan, a canal: Panama!";
        StringBuilder sb = new StringBuilder(sentence);
        String reverseSentence = String.valueOf(sb.reverse());

        String[] arrayClearedSentence = sentence.split("\\W");
        String[] arrayReversedSentence = reverseSentence.split("\\W");

        sentence = "";
        reverseSentence = "";

        for (int i = 0; i < arrayClearedSentence.length; i++) {
            sentence += arrayClearedSentence[i];
        }

        for (int i = 0; i < arrayReversedSentence.length; i++) {
            reverseSentence += arrayReversedSentence[i];
        }

        if (sentence.equalsIgnoreCase(reverseSentence)) {
            System.out.println("The number is palindrom!");
        } else {
            System.out.println("The number is not palindrom!");
        }
    }
}

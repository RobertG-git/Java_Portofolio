package C20_String_SiruriDeCaractere;

public class Ex2 {

    /*
    2. Se citeste un text de la tastatura (i.e. text), ce contine doar cuvinte si spatii libere (cu exceptia caracterului Enter / newline).
    Dupa citirea textului, se citesc pe rand doua cuvinte (i.e. ce nu pot contine spatii) cu semnificatia oldWord respectiv newWord.
    Sarcina ta este sa implementezi un algoritm de inlocuire partiala, ce inlocuieste toate aparitiile oldWord cu newWord in text, mai putin prima aparitie si ultima aparitie.
     */

    public static void main(String[] args) {

        String mySentence = "a creature is a small part of a big world";
        String oldWord = "a ";
        String newWord = "the ";

        replaceWord(mySentence, oldWord, newWord);

    }

    public static void replaceWord(String mySentence, String oldWord, String newWord) {

        if (wordCounter(mySentence, oldWord) > 2) {

            String stringFirstPart = mySentence.substring(0, mySentence.indexOf(oldWord) + 1);
            System.out.println("String first part: " + stringFirstPart);

            String stringMiddlePart = mySentence.substring((mySentence.indexOf(oldWord) + 1), (mySentence.lastIndexOf(oldWord) - 1));
            System.out.println("String middle part:" + stringMiddlePart);

            String stringFinalPart = mySentence.substring(mySentence.lastIndexOf(oldWord));
            System.out.println("String final part: " + stringFinalPart);

            stringMiddlePart = stringMiddlePart.replaceAll(oldWord, newWord);

            mySentence = stringFirstPart + stringMiddlePart + " " + stringFinalPart;
            System.out.println("Final sentence is: " + mySentence);
        } else {
            System.out.println(mySentence);
        }
    }

    public static int wordCounter(String string, String word) {
        int wordCounter = 0;
        int index = string.indexOf(word);
        while (index >= 0) {
            wordCounter++;
            index = string.indexOf(word, index + 1);
        }
        return wordCounter;
    }
}

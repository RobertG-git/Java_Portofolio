package C22_AlgoritmiDeProcesareAStringurilor;

public class Ex4 {
    /*
    4. Implementeaza o metoda care primeste ca parametri (1) o propozitie, alcatuita din cuvinte separate prin spatii si semne de punctuatie si (2) un cuvant, denumit cheie, alcatuit numai din literele alfabetului englez si care returneaza:

        numarul de cuvinte din propozitie care se termina cu oricare dintre literele cheii
        numarul de cuvinte din propozitie care contin pe o pozitie para una dintre literele cheii
        numarul de cuvinte care contin toate literele cheii
            vom tine cont si de duplicate, ca in exemplul:
                cuvantul marmelada contine toate caracterele din cheia emma
                cuvantul mansarda nu contine toate caracterele din cheia emma
     */

    public static void main(String[] args) {
        String key = "emma";
        String sentence = "marmelada marmelada";

        System.out.println("Numarul de cuvinte din propozitie care se termina cu oricare dintre literele cheii: ");
        System.out.println(nrWordsEndInKeyChar(sentence, key));
        System.out.println("Numarul de cuvinte din propozitie care contin pe o pozitie para una dintre literele cheii: ");
        System.out.println(nrWordsContainKeyDigitOnEvenPos(sentence, key));
        System.out.println("Numarul de cuvinte care contin toate literele cheii: ");
        System.out.println(nrWordsContainAllKeyDigits(sentence,key));
    }

    public static int nrWordsContainAllKeyDigits(String sentence, String key) {
        key = key.toLowerCase();
        StringBuilder sbSentence = new StringBuilder(sentence.toLowerCase());
        sbSentence.append(" ");

        // creating StringBuilder sbKey unique
        StringBuilder sbKey = new StringBuilder(key);

        int counter = 0;
        int wordCounter = 0;
        int startWord = 0;
        int endWord;
        for (int i = 0; i < sbSentence.length(); i++) {
            if (!Character.isLetter(sbSentence.charAt(i))) {
                endWord = i;

                for (int k = 0; k < sbKey.length(); k++) {

                    for (int j = startWord; j < endWord; j++) {
                        if (sbKey.charAt(k) == sbSentence.charAt(j)) {
                            counter++;
                            break;
                        }
                    }
                }

                if (counter == sbKey.length()) {
                    counter = 0;
                    wordCounter++;
                }
                startWord = endWord;
            }
        }
        return wordCounter;
    }


    public static int nrWordsContainKeyDigitOnEvenPos(String sentence, String key) {
        key = key.toLowerCase();
        StringBuilder sbSentence = new StringBuilder(sentence.toLowerCase());
        sbSentence.append(" ");

        // creating StringBuilder sbKey unique
        StringBuilder sbKey = new StringBuilder(key);
        for (int i = 0; i < sbKey.length(); i++) {
            for (int j = 0; j < sbKey.length(); j++) {
                if (!isCharUnique(sbKey, sbKey.charAt(j))) {
                    sbKey.delete(j, j + 1);
                }
            }
        }

        int counter = 0;
        int startWord = 0;
        int endWord;
        for (int i = 0; i < sbSentence.length(); i++) {
            if (!Character.isLetter(sbSentence.charAt(i))) {
                endWord = i;

                for (int j = startWord; j < endWord; j++) {
                    startWord = endWord;
                    if (j % 2 == 0) {
                        int previousCounter = counter;

                        for (int k = 0; k < sbKey.length(); k++) {
                            if (sbSentence.charAt(j) == sbKey.charAt(k)) {
                                counter++;
                                break;
                            }
                        }

                        if (counter != previousCounter) {
                            break;
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static int nrWordsEndInKeyChar(String sentence, String key) {
        key = key.toLowerCase();
        StringBuilder sbSentence = new StringBuilder(sentence.toLowerCase());
        sbSentence.append(" ");

        // creating stringbuilder sbKey unique
        StringBuilder sbKey = new StringBuilder(key);
        for (int i = 0; i < sbKey.length(); i++) {
            for (int j = 0; j < sbKey.length(); j++) {
                if (!isCharUnique(sbKey, sbKey.charAt(j))) {
                    sbKey.delete(j, j + 1);
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < sbSentence.length(); i++) {
            if (!Character.isLetter(sbSentence.charAt(i))) {
                for (int j = 0; j < sbKey.length(); j++) {
                    if (sbSentence.charAt(i - 1) == sbKey.charAt(j)) {
                        counter++;
                        break;
                    }
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

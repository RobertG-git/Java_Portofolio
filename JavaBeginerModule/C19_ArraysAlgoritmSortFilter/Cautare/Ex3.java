package C19_ArraysAlgoritmSortFilter.Cautare;

public class Ex3 {

    /*
    3. Pornind de la experienta acumulata la exercitiul anterior, implementeaza o metoda (i.e. isPalindromIgnoreCasePRO(String))
    care determina daca o propozitie este palindrom, ignorand diferentele de litere mari / mici si toate caracterele care nu sunt litere.
    Similar exercitiului precedent, metoda va returna true daca sirul de caractere este palindrom sau false in caz contrar.
     */

    public static void main(String[] args) {

        System.out.println(isPalindromStirng("Step on no pets."));

    }

    public static boolean isPalindromStirng(String sentence) {
        char[] array = sentence.toCharArray();
        String clearedSentence = "";
        String reverseSentence = "";

        for (int i = 0; i < array.length; i++) {
            if (!(array[i] == ',' || array[i] == '.' || array[i] == '?'
                    || array[i] == '!' ||  array[i] == '\'' || array[i] == ' ' )) {
                clearedSentence += array[i];
            }
        }

        char [] clearedArray = clearedSentence.toCharArray();
        for (int i = clearedArray.length - 1; i >= 0; i--) {
            reverseSentence += clearedArray[i];
        }

        return clearedSentence.equalsIgnoreCase(reverseSentence);
    }
}

package C19_ArraysAlgoritmSortFilter.Cautare;

public class Ex2 {

    /*
    2. Un numar palindrom este un numar care este egal cu simetricul sau (ex: 121, 10001, 22344322, 88, 7 etc.).
    Similar, un sir de caractere este palindrom daca este identic cu simetricul sau (ex: „abba“, „ana“, „noon“, „radar“, „madam“).
    Implementeaza o metoda (i.e. isPalindromIgnoreCase(String)) care determina daca un sir de caractere este sau nu palindrom, fara a se tine cont de tipul literelor (i.e. majuscule vs. minuscule).
    Testeaza metoda in main pentru cat mai multe cazuri de exceptie
     */

    public static void main(String[] args) {

        System.out.println(isPalindromIgnoreCase("ana"));

    }

    public static boolean isPalindromIgnoreCase(String stringToCheck) {
        String reverseString = "";

        char[] array = stringToCheck.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            reverseString += array[i];
        }

        System.out.println("reverseOfStringToCheck is: " + reverseString);
        System.out.println("stringToCheck is: " + stringToCheck);

        return stringToCheck.equalsIgnoreCase(reverseString);
    }

}



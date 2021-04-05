package C22_AlgoritmiDeProcesareAStringurilor;

public class Ex3 {
    /*
    3. Implementeaza o metoda int compareTwoStrings(String str1, String str2) care primeste ca parametri 2 siruri de caractere si compara cele 2 String-uri.
    Metoda va avea un comportament similar cu metoda int compareTo(String anotherString) adica trebuie sa returneze:

        o valoare negativa (ex: -1) daca str1 < str2
        0 daca str1 == str2
        o valoare pozitiva (ex: +1) daca str1 > str2
        In implementarea metodei nu poti folosi metodele de comparare ale clasei String.

    3.1. Implementeaza de aceasta data metoda int compareTwoStringsIgnoreCase(String str1, String str2).
    Specificatiile de functionare si constrangerile anterioare se mentin.
     */

    public static void main(String[] args) {
        String str1 = "aaaa";
        String str2 = "dd";

        System.out.println();
        System.out.println("Java 'compareTo answer' :" + str1.compareTo(str2));
        System.out.println("Method 'compareTwoStrings' answer: " + compareTwoStrings(str1, str2));
        System.out.println("Method 'compareTwoStringsIgnoreCase' answer: " + compareTwoStringsIgnoreCase(str1, str2));
    }

    public static int compareTwoStrings(String str1, String str2) {
        int aux = -2;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    aux = 0;
                }
                if (str1.charAt(i) < str2.charAt(i)) {
                    aux = -1;
                    break;
                }
                if (str1.charAt(i) > str2.charAt(i)) {
                    aux = 1;
                    break;
                }
            }
        } else if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    aux = 1;
                }
                if (str1.charAt(i) < str2.charAt(i)) {
                    aux = -1;
                    break;
                }
                if (str1.charAt(i) > str2.charAt(i)) {
                    aux = 1;
                    break;
                }
            }
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    aux = -1;
                }
                if (str1.charAt(i) < str2.charAt(i)) {
                    aux = -1;
                    break;
                }
                if (str1.charAt(i) > str2.charAt(i)) {
                    aux = 1;
                    break;
                }
            }
        }
        return aux;
    }

    public static int compareTwoStringsIgnoreCase(String str1, String str2) {
        int aux = -2;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (Character.toLowerCase(str1.charAt(i)) == Character.toLowerCase(str2.charAt(i))) {
                    aux = 0;
                }
                if (Character.toLowerCase(str1.charAt(i)) < Character.toLowerCase(str2.charAt(i))) {
                    aux = -1;
                    break;
                }
                if ((Character.toLowerCase(str1.charAt(i)) > Character.toLowerCase(str2.charAt(i)))) {
                    aux = 1;
                    break;
                }
            }
        } else if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                if (Character.toLowerCase(str1.charAt(i)) == Character.toLowerCase(str2.charAt(i))) {
                    aux = 1;
                }
                if (Character.toLowerCase(str1.charAt(i)) < Character.toLowerCase(str2.charAt(i))) {
                    aux = -1;
                    break;
                }
                if (Character.toLowerCase(str1.charAt(i)) > Character.toLowerCase(str2.charAt(i))) {
                    aux = 1;
                    break;
                }
            }
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (Character.toLowerCase(str1.charAt(i)) == Character.toLowerCase(str2.charAt(i))) {
                    aux = -1;
                }
                if (Character.toLowerCase(str1.charAt(i)) < Character.toLowerCase(str2.charAt(i))) {
                    aux = -1;
                    break;
                }
                if (Character.toLowerCase(str1.charAt(i)) > Character.toLowerCase(str2.charAt(i))) {
                    aux = 1;
                    break;
                }
            }
        }
        return aux;
    }
}

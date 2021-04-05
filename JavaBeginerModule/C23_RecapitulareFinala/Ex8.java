package C23_RecapitulareFinala;

public class Ex8 {
    /*
    1. Implementeaza o metoda (i.e. char firstUnique(String sequence)) care primeste ca parametru un sir de caractere
    si returneaza primul caracter unic (i.e. care nu se repeta) din sir.
    1.1. Implementeaza metoda char lastUnique(String sequence) care va returna ultimul caracter unic din sirul de
    caractere primit ca parametru.
     */

    public static void main(String[] args) {
        String sentence = "anabellen";
        System.out.println(lastUnique(sentence));
    }

    public static char lastUnique(String sentence) {
        char aux = '!';
        for (int i = 0; i < sentence.length(); i++) {
            int counter = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(i) == sentence.charAt(j)) {
                    counter++;
                }
            }
            if (counter == 1) {
                aux = sentence.charAt(i);
            }
        }
        return aux;
    }

    public static char firstUnique(String sentence) {
        char aux = '!';
        for (int i = 0; i < sentence.length(); i++) {
            int counter = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(i) == sentence.charAt(j)) {
                    counter++;
                }
            }
            if (counter == 1) {
                aux = sentence.charAt(i);
                break;
            }
        }
        return aux;
    }




}

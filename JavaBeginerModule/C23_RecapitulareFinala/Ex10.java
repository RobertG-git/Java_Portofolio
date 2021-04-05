package C23_RecapitulareFinala;

public class Ex10 {
    /*
    Scrie o metoda care primeste ca parametri 2 string-uri si verifica daca un sir reprezinta o rotatie a celuilalt.
    O rotatie se obtine prin mutarea in ordine a unui numar arbitrar de caractere de la sfarsitul sirului la inceputul sau.
     */

    public static void main(String[] args) {
        String word = "anabelle";
        String rotatedWord ="nabellea";

        System.out.println(isRotatedWord(word, rotatedWord));
    }

    public static String wordRotate(String word, int n) {
        String rotatedWord = "";
        for (int i = 0; i < n; i++) {
            rotatedWord = word.substring(word.length() - n) + word.substring(0,word.length() - n);
        }

        return rotatedWord;
    }

    public static boolean isRotatedWord(String word, String rotatedWord) {
        boolean aux = false;

        for(int i = 0; i < word.length(); i++) {
            if (wordRotate(word,i).equalsIgnoreCase(rotatedWord)){
                aux = true;
            }
        }

        return aux;
    }

}

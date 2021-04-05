package src.C3_Recap_String;

public class Ex2 {
    /*
    2. Anagrams solver
    Doua siruri de caractere (i.e. cuvinte sau chiar fraze) sunt anagrame daca putem obtine unul din celalalt,
    prin repozitionarea literelor. Semnele de punctuatie, spatiile libere si orice alte caractere care nu sunt litere se ignora.
    De asemenea, nu se face distinctia intre litere mari si mici. Cateva exemple de anagrame sunt:

    fairy tales! ↔ rail, safety
    William Shakespeare ↔ I am a weakish speller!
    parliament ↔ partial men
    The Eyes ↔ They see!
    etc.
    Implementeaza o metoda, anagramSolver(String anag1, String anag2) care determina daca doua siruri de caractere sunt sau nu anagrame.\
    Intuitiv, metoda va returna un rezultat de tip Boolean.
     */

    public static void main(String[] args) {
        System.out.println(anagramSolver("William Shakespeare", "I am a weakish speller!"));
    }

    public static boolean anagFunction(String anag1, String anag2) {
        boolean anagramSolver = true;
        for (int i = 0; i < anag1.length(); i++) {
            int counter1 = 0;
            int counter2 = 0;
            for (int j = 0; j < anag1.length(); j++) {
                if(anag1.toLowerCase().charAt(i) == anag1.toLowerCase().charAt(j) && (Character.isLetter(anag1.charAt(i)) || Character.isDigit(anag1.charAt(i)))) {
                    counter1++;
                }
            }

            for (int k = 0; k < anag2.length(); k++) {
                if (anag1.toLowerCase().charAt(i) == anag2.toLowerCase().charAt(k) && (Character.isLetter(anag1.charAt(i)) || Character.isDigit(anag1.charAt(i)))) {
                    counter2++;
                }
            }

            if (counter1 != counter2) {
                anagramSolver = false;
                break;
            }
        }
        return anagramSolver;
    }

    public static boolean anagramSolver(String anag1, String anag2) {
        return anagFunction(anag1,anag2) && anagFunction(anag2, anag1);
    }
}

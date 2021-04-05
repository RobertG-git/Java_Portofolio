package C23_RecapitulareFinala;

public class Ex9 {
    /*
    Scrie un program care citeste de la tastatura un sir de caractere fara spatii si un numar natural n si imparte
    string-ul citit in bucati de n caractere. String-ul divizat va fi stocat intr-un array de string-uri.
    La final programul afiseaza continutul array-ului la consola, fiecare element pe cate o linie, pentru verificare.
     */

    public static void main(String[] args) {
        int n = 5;
        String sentence =  "carcasa";
        displayArray(stringDivider(sentence,n));

    }

    public static String[] stringDivider (String sentence, int n) {
        String[] dividedString = new String[Math.abs(sentence.length() / n) + 1];
        int aux = 0;
        int copyN = n;

        for (int i = 0; i < dividedString.length; i++) {
            dividedString[i] = sentence.substring(aux, n);
            aux += copyN;
            n += copyN;

            if (n > sentence.length()) {
                n = sentence.length();
            }
        }
        return dividedString;
    }

    public static void displayArray(String[] string) {
        for (int i = 0; i < string.length; i++) {
            System.out.print(string[i] + " ");
        }
    }
}

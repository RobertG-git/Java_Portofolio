package C23_RecapitulareFinala;

public class Ex11 {
    /*
    Implementeaza un algoritm care primeste de la tastatura un sir de caractere fara spatii si un factor de duplicare n.
    Programul va crea un nou sir de caractere pornind de la sirul initial si eliminand toate acele caractere
    care apar in sir de cel putin n ori (i.e. eliminand toate caracterele duplicate de cel putin n ori).
     */

    public static void main(String[] args) {
        String word = "carcasa";
        StringBuilder sbWord = new StringBuilder(word);

        System.out.println(removeNduplicate(sbWord,3));
    }

    public static StringBuilder removeNduplicate(StringBuilder sbWord, int n) {
        int counter;
        String charsToDelete = "";
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < sbWord.length(); i++) {
            counter = 0;
            for (int j = 0; j < sbWord.length(); j++) {
                if (sbWord.charAt(i) == sbWord.charAt(j)) {
                    counter++;
                    if (counter >= n && !charsToDelete.contains(String.valueOf(sbWord.charAt(j)))) {
                        charsToDelete = charsToDelete + sbWord.charAt(j);
                    }
                }
            }
        };

        for (int i = 0; i < sbWord.length(); i++) {
            if (!charsToDelete.contains(String.valueOf(sbWord.charAt(i)))) {
                newString.append(sbWord.charAt(i));
            }
        }

        return newString;

    }
}

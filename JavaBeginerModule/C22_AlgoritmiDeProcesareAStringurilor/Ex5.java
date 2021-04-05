package C22_AlgoritmiDeProcesareAStringurilor;

public class Ex5 {
    /*
    5. Implementeaza o metoda boolean containsString(String sourceString, String searchString)
    care primeste ca parametri un sir de caractere in care se face cautarea si respectiv sirul de caractere cautat si
    returneaza true daca searchString se gaseste in sourceString.

    Metoda va avea un comportament similar cu metoda boolean contains(CharSequence s).

    In implementarea metodei nu poti folosi metodele de cautare aferente clasei String.
     */

    public static void main(String[] args) {
        String sourceString = "Ana are mere";
        String searchString = "are";

        System.out.println(containString(sourceString, searchString));


    }

    public static boolean containString(String sourceString, String searchString) {
        boolean aux = false;
        int counter = 0;

        for (int i = 0; i < sourceString.length(); i++) {

            if (Character.toString(sourceString.charAt(i)).equalsIgnoreCase(String.valueOf(searchString.charAt(0)))) {
                int m = 0;
                for (int k = i + 1; m < searchString.length() - 1; k++) {
                    if (Character.toString(sourceString.charAt(k)).equalsIgnoreCase(String.valueOf(searchString.charAt(m + 1)))) {
                        aux = true;
                        counter++;
                        System.out.println(counter);
                    }
                    m++;
                }
                if (counter == searchString.length() - 1) {
                    break;
                }
            }
        }

        System.out.println(counter);

        return aux && counter == searchString.length() - 1;
    }

}

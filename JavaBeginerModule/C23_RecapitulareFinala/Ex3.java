package C23_RecapitulareFinala;

public class Ex3 {
    /*
    Implementeaza o metoda generica de cautare a unui sir de caractere intr-un vector de siruri de caractere.
    Metoda trebuie sa ia in considerare toate cazurile posibile, inclusiv cazurile in care in array se pot afla valori nule, array-ul este nul sau cheia este nula.
     */

    public static void main(String[] args) {
        String key = null;
        String[] array = {null, "John", "is", null, null, "prepared", "for", null, "exam"};

        System.out.println(genericSearch(array,key));
    }

    public static int genericSearch(String[] array, String key) {
        int counter = 0;

        for (int i = 0; i < array.length; i++ ) {
            if (array[i] == key){
                counter++;
            }
        }
        return counter;
    }
}

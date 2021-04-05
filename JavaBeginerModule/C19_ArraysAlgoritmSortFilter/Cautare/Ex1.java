package C19_ArraysAlgoritmSortFilter.Cautare;

public class Ex1 {

    public static void main(String[] args) {
        /*
        1. Implementeaza o metoda (i.e. countOccurrencesIgnoreCase(String[] array, String key)) care determina numarul de elemente key din cadrul array si returneaza aceasta valoare.
        Metoda nu tine cont de tipul literelor (i.e. majuscule vs. minuscule).
         */

      String[] array1 = {"Java", "C", "Python", "JAVA", "perl", "C#", "java"};

      System.out.println(countOccurrencesIgnoreCase(array1, "JAVA"));
      System.out.println(countOccurrencesIgnoreCase(array1, "low"));

    }

    public static int countOccurrencesIgnoreCase(String[] array, String key) {
        int counter = 0;
        for (int i = 0; i < array.length; i++)  {
            if (array[i].equalsIgnoreCase(key)) {
                counter++;
            }
        }
        return counter;

    }
}

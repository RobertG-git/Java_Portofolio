package C19_ArraysAlgoritmSortFilter.Filtrare;

import java.util.Scanner;

public class Ex2 {
    /*
    2. Citindu-se aceleasi date ca in exercitiul anterior, implementeaza o metoda lettersMatchIgnoreCase(String[] array,
    String key) care sa returneze un array ce contine toate cuvintele care au cel putin o litera identica cu key.
    */

    public static void main(String[] args) {

        int n;
        String key;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();

        System.out.println("Please insert your 'n words string' : ");
        String[] arrayString = new String[n];
        for (int i = 0 ; i < n; i++) {
            arrayString[i] = sc.next();
        }

        System.out.println("Please insert your 'key' : ");
        key = sc.next();

        System.out.println("Your lettersMatchIgnoreCase string is: ");
        lettersMatchIgnoreCase(arrayString, key);

    }

    public static void lettersMatchIgnoreCase(String[] array, String key) {
        key = key.toLowerCase();
        char[] charKey = key.toCharArray();
        int minCharLength;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            char[] charArray = array[i].toLowerCase().toCharArray();
            minCharLength = Math.min(charArray.length, charKey.length);

            for (int j = 0; j < minCharLength; j++) {
                if (charArray[j] == charKey[j]) {
                    counter++;
                    if (counter <= 1) {
                        System.out.print(array[i] + " ");
                    }
                }
            }
        }
    }
}

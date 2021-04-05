package C11_1_MetodeInJavaReutilizareaCoduluiVoid;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        2. Implementeaza o metoda care primeste ca parametru un numar intreg si returneaza numarul de cifre al acelui numar.
        Testeaza metoda implementata si demonstreaza functionarea corecta a acesteia prin diverse apeluri (in main(…)). De exemplu:
         */

        int testNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number: ");
        testNumber = sc.nextInt();

        System.out.println("The number " + testNumber + " has " + numberLength(testNumber) + " digits.");
    }

    public static int numberLength (int testNumber) {
        int numberLength =0;
        while ( testNumber != 0) {
            int lastDigit = testNumber % 10;
            numberLength++;
            testNumber /= 10;
        }
        return numberLength;
    }



}

package C11_1_MetodeInJavaReutilizareaCoduluiVoid;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        /*
        4. (Ex. 3.x. - Palindrom) Scrie un program care afiseaza toate numerele palindrom pana la o valoare n citita de la tastatura.
        Scrie codul modularizat, folosind cel putin o metoda care sa determine daca un numar este palindrom si o alta metoda care
        afiseaza toate numerele palindrom pana la n.
        Testeaza codul in main(…), pentru diverse valori (n).
         */

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number: ");
        n = sc.nextInt();

        System.out.println("Number 'n' is palindrom? R: "+ isPalindrom(n));
        allPalindromsToN(n);

    }

    public static boolean isPalindrom(int n) {
        int copyN = n;
        int reverseNumber = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            n /= 10;
        }
        if (reverseNumber == copyN) {
            return true;
        } else {
            return false;
        }
    }

    public static void allPalindromsToN(int n) {
        for (int it = 0; it <= n ; it++) {
            if (isPalindrom(it)) {
                System.out.print(it + " ");
            }
        }


    }
}

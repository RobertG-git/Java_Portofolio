package C9_1_Break_Continue;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        /*
        3. Implementeaza un algoritm care citeste un numar intreg de la tastatura.
        Acesta afiseaza ulterior primele 3 cifre ale numarului, de la sfarsit spre inceput.
        Daca numarul are mai putin de 3 cifre, programul va afisa un mesaj de eroare (i.e.
        Numarul introdus trebuie sa contina cel putin 3 cifre).
         */

        int n , copyN;
        int lastDigit;
        int counter = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert your number: ");
        n = sc.nextInt();
        copyN = n;

        while (n != 0) {

            if (copyN < 100){
                System.out.println("The number shall be at least 3 digits.");
                break;
            }

            lastDigit = n % 10;
            counter++;
            n /= 10;

            System.out.print(lastDigit + " ");

            if (counter == 3) {
                break;
            }
        }
    }
}

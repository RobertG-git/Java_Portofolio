package C11_1_MetodeInJavaReutilizareaCoduluiVoid;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        /*
        1. Scrie un algoritm care citeste de la tastatura un numar n si afiseaza toate numerele prime pana la n (inclusiv), incepand cu 2.
        Modularizeaza implementarea algoritmului folosind doua metode:

            una care indica daca un numar este prim sau nu
                Hint: returneaza true daca numarul este prim si false altfel
            alta care afiseaza toate numerele prime pana la n (primit ca argument la apel)
                Hint: metoda va apela functia definita anterior
         */

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number: ");
        n = sc.nextInt();

        for (int it = 2 ; it <= n ; it++) {
            if (isOdd(it)) {
                System.out.println(it + " ");
            }
        }
    }

    public static boolean isOdd (int n) {
        if (n % 2 == 1) {
            return true;
        }else {
            return false;
        }
    }

}

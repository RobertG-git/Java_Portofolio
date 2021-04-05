package W01_StructuriDeControl;

import java.util.Scanner;

public class ExtraEx6 {

    public static void main(String[] args) {

        // 4.4. Pornind de la subpunctul anterior, scrie un algoritm care afiseaza descompunerea in factori primi ai unui numar n (citit de pe mediul de intrare).
        // Algoritmul trebuie sa produca rezultate conform exemplelor urmatoare:

        int n;
        int counter;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 2 ; i < n ; i++) {

            counter = 0;

            while (n % i == 0) {
                n = n / i;
                counter++;
            }

            System.out.println( i + "^" + counter +  " * " + n + " * ");

        }

    }
}

package C9_1_Break_Continue;

import java.util.Scanner;

public class Ex1 {

    /*
    1. Implementeaza un sumator de numere cu resurse limitate.
    Acest sumator va realiza suma numerelor introduse de utilizator, pana la introducerea unui numar negativ, dar nu mai mult de 10 numere.
    Cu alte cuvinte, sumatorul va afisa suma numerelor si se va termina in oricare dintre cele doua cazuri:

        a.Utilizatorul a introdus deja 10 numere.
        b.Utilizatorul introduce un numar negativ (i.e. inainte de introducerea a 10 numere).
    Precizari:
    In cazul in care programul se incheie prin introducerea unui numar negativ (i.e. cazul 2), acesta nu va fi insumat!
    Suma este alcatuita doar din valorile pozitive introduse de utilizator.
     */

    public static void main(String[] args) {

        int n , m;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int it = 0 ; it < n ; it++) {
            m = sc.nextInt();

            if  (m < 0) {
                break;
            }
            sum += m;
        }

        System.out.println("Suma numerelor este: " + sum);

    }
}

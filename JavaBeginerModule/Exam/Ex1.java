package Exam;

public class Ex1 {
    /*
    Sa se implementeze o metoda care primeste ca parametru un numar natural n si afiseaza toate numerele naturale (1) divizibile cu 4 si (2) care au suma cifrelor divizibila cu 10.
    Afisarea se realizeaza in ordine crescatoare, de la 0 pana la n (inclusiv). In implementare, poti folosi oricate metode auxiliare.
     */

    public static void main(String[] args) {

        int n = 300;

        for (int i = 0; i <= n; i++) {
            if ( (i % 4 == 0) && (sumDigits(i)) % 10 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static int sumDigits(int n) {
        int sum = 0;
        while ( n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
}

package W02_Algoritmi.MetodeJava;

public class Ex5 {

    /*
    5. Implementeaza o metoda care primeste 2 parametri: un numar (i.e. n) si o cifra (i.e. digit).
    Metoda va returna numarul de cifre digit continute de n.
     */

    public static void main(String[] args) {
        int n = 4823;
        int digit = 0;

        System.out.println(numberOfDigits(n, digit));

    }

    public static int numberOfDigits(int n, int digit) {
        int lastDigit;
        int counter = 0;

        while (n != 0) {
            lastDigit = n % 10;
            if (lastDigit == digit) {
                counter++;
            }
            n /= 10;
        }

        return counter;
    }
}

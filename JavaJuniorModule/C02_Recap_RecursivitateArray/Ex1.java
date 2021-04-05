package src.C2_Recap_RecursivitateArray;

public class Ex1 {
    /*
    1. Reverse number - recursive
    a. Implementeaza o metoda recursiva (i.e. reverseNumberR(int number)) care primeste ca parametru un numar intreg,
    pozitiv si returneaza inversul numarului.

    b. Implementeaza algoritmul anterior folosind de aceasta data o metoda iterativa (care implicit, este mult mai
    eficienta decat varianta recursiva). Rezultatele produse de cele doua metode trebuie sa fie identice.
     */

    public static void main(String[] args) {
        System.out.println(reverseNumberR1(1234));
        System.out.println(reverseNumberR2(1234));
    }

    // a.
    public static int reverseNumberR1(int n) {
        if (n < 10) {
            return n;
        }

        String lastDigit = String.valueOf(n % 10);
        return Integer.parseInt(lastDigit + reverseNumberR1(n / 10));
    }

    // b.
    public static int reverseNumberR2(int n) {
        int reverse = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return reverse;
    }

}

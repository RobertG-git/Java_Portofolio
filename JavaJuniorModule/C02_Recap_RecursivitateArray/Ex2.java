package src.C2_Recap_RecursivitateArray;

public class Ex2 {

    /*
    2. Ridicarea la putere
    a. Implementeaza o metoda recursiva myMathPowR(int x, int y) care realizeaza operatia de ridicare la putere a unui
    numar natural x la o putere y (numar natural).

    b. Implementeaza algoritmul anterior folosind de aceasta data o metoda iterativa. Rezultatele produse de cele doua
    metode trebuie sa fie identice.

     */

    public static void main(String[] args) {
        System.out.println(myMathPowR(2, 5));
        System.out.println(myMathPowI(2, 5));
    }

    // a.
    public static int myMathPowR(int x, int y) {

        if (y == 0) {
            return 1;
        }

        return x * myMathPowR(x, y - 1);

    }

    // b.
    public static int myMathPowI(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

}

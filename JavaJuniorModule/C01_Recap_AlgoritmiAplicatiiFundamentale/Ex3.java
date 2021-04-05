package src.C1_Recap_AlgoritmiAplicatiiFundamentale;

public class Ex3 {
    /*
    a. (JSD I - Exercitii mixte) Scrie o metoda care primeste ca parametru un numar natural n si
    returneaza cel mai mare multiplu de 5, mai mic sau egal cu n. Testeaza metoda in main cu diverse cazuri de exceptie:

    b. Scrie o metoda care primeste ca parametru un numar natural n si returneaza cel mai mic multiplu de 5, mai mare sau egal cu n.
    Testeaza metoda in main cu diverse cazuri de exceptie:
     */

    public static void main(String[] args) {

        getMultipleOf5Upper(11);
        getMultipleOf5Lower(11);
    }

    public static void getMultipleOf5Lower(int n) {
        while (n % 5 != 0) {
            n--;
        }

        System.out.println(n);
    }

    public static void getMultipleOf5Upper(int n) {
        while (n % 5 != 0) {
            n++;
        }
        System.out.println(n);
    }
}

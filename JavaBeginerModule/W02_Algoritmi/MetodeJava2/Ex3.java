package W02_Algoritmi.MetodeJava2;

public class Ex3 {

    /*
    3. Numar abundent. Numar deficitar
    Sa ne amintim mai intai ce era un numar perfect. In consecinta, se definesc 2 noi tipuri de numere:

        numar abundent: este orice numar care este mai mic decat suma divizorilor proprii si divizorul 1
        numar deficitar: este orice numar care este mai mare decat suma divizorilor proprii si divizorul 1.
        Astfel, in functie de relatia dintre suma divizorilor proprii plus divizorul 1 si numarul insusi, orice numar apartine uneia dintre cele 3 categorii: numar perfect, numar abundent si respectiv numar deficitar.

    3.1. Scrie un algoritm care afiseaza tipul unui numar n dat de la input.
    3.2. Scrie un program care afiseaza in consola toate numerele deficitare mai mici sau egale cu un numar n dat.
    3.3. Scrie un program care afiseaza in consola toate numerele abundente mai mici sau egale cu un numar n dat.

     */

    public static void main(String[] args) {
        int n = 19;
        numberType(n);
        allDeficitNrToN(n);
        System.out.println();
        allAbundantNrToN(n);
    }

    public static void numberType(int n) {
        if (numberTypeSum(n)< n) {
            System.out.println("Number " + n + " is deficient!");
        } else if (numberTypeSum(n) > n) {
            System.out.println("Number " + n + " is abundant!");
        } else {
            System.out.println("Number " + n + " is perfect!");
        }
    }

    public static int numberTypeSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void allDeficitNrToN(int n) {
        for (int i = 0; i < n; i++) {
            if (numberTypeSum(i) < i) {
                System.out.print(i + " ");
            }
        }

    }

    public static void allAbundantNrToN(int n) {
        for (int i = 0; i < n; i++) {
            if (numberTypeSum(i) > i) {
                System.out.print(i + " ");
            }
        }

    }
}

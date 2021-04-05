package W02_Algoritmi.MetodeJava;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        2. Implementeaza un program care afiseaza sirul sumelor numerelor prime, astfel: 2, 5 (2 + 3), 10(2 + 3 + 5), 17(2 + 3 + 5 + 7) etc.
        Se citeste de la tastatura o valoare upperLimit, reprezentand valoarea maxima a sumelor afisate
         */
        int upperLimit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the 'upperLimit'");

        upperLimit = sc.nextInt();
        rowOfSumPrimeNumbers(upperLimit);

        System.out.println("\n" + isPrime(4));
    }

    public static void rowOfSumPrimeNumbers(int upperLimit) {
        int sumPrimeNumbers = 0;
        for (int it = 2; sumPrimeNumbers < upperLimit;  it++) {
            if ( isPrime(it)) {
                sumPrimeNumbers += it;
                System.out.print("" + sumPrimeNumbers + " ");

            }
        }
    }

    public static boolean isPrime(int n){
        for (int it = 2; it < n;  it++) {
            if (n % it == 0) {
                return false;
            }
        }
        return true;
    }

}

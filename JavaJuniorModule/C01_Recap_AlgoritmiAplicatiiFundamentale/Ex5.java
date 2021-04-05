package src.C1_Recap_AlgoritmiAplicatiiFundamentale;

public class Ex5 {
    /*
    5. Sirul sumelor numerelor prime

    Implementeaza un program care afiseaza sirul sumelor JSD I - numerelor prime, astfel: 2, 5 (2 + 3), 10(2 + 3 + 5), 17(2 + 3 + 5 + 7) etc.
    Se citeste de la tastatura o valoare upperLimit, reprezentand valoarea maxima a sumelor afisate.

     */

    public static void main(String[] args) {
        sumOddNumbers(20);
    }

    public static void sumOddNumbers(int upperLimit) {
        int sum = 0;
        for (int i = 2 ; i < upperLimit; i++) {
            if (isPrime(i)) {
                sum += i;
                System.out.print(sum + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean aux = true;
        for (int i = 2; i < n; i++ ) {
            if( n % i == 0) {
                aux = false;
                break;
            }
        }
        return aux;
    }
}

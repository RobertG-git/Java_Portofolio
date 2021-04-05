package W02_Algoritmi.MetodeJava;

public class Ex6 {

    /*
    6. Implementeaza o metoda care calculeaza cel mai mare factor prim al unui numar number dat.
    In cazul in care numarul este prim (deci nu are divizori proprii), metoda va returna valoarea -1, semnaland ca nu exista un astfel de factor.
     */

    public static void main(String[] args) {
        int number = 21;
        largestPrimeFactor(343965);

    }

    public static void largestPrimeFactor(int number) {
        int largestPrimeNumber = 0;
        if (!isPrime(number)) {
            for (int i = 1; i < number; i++) {
                if ((number % i == 0) && (isPrime(i))) {
                    largestPrimeNumber = i;
                }
            }
            System.out.println(largestPrimeNumber);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean isPrime(int n) {
        int counter = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter == 0;
    }


}

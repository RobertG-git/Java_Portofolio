package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex3_3 {

    /*
        3.3. Modifica aplicatia anterioara astfel incat sa se afiseze numerele descrescatoare?
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'lowerLimit' number: ");
        int lowerLimit = sc.nextInt();
        System.out.println("Please insert your 'upperLimit' number: ");
        int upperLimit = sc.nextInt();

        for (int it = lowerLimit; it < upperLimit; it++) {
            if (numberIsAscending(it)) {
                System.out.print(it + " ");
            }
        }

    }

    public static boolean numberIsAscending(int n){
        n = palindrom(n);
        boolean isAscending = true;
        while (n != 0) {
            int lastDigit = n % 10;
            n /= 10;
            int anteLastDigit = n % 10;

            if (lastDigit >= anteLastDigit){
                isAscending = true;
            } else {
                isAscending = false;
                break;
            }
        }

        return isAscending;
    }

    public static int palindrom (int n) {
        int palindrom = 0;
        while (n != 0 ) {
            int lastDigit = n % 10;
            palindrom = palindrom * 10 +lastDigit;
            n /= 10;
        }

        return palindrom;
    }
}

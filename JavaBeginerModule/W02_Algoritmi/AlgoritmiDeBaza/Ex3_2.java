package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex3_2 {

    /*
        3.2. Foloseste metoda implementata anterior pentru a afisa toate numerele crescatoare cuprinse in intervalul
        [lowerLimit, uppeLimit], dat prin valorile lowerLimit respectiv upperLimit citite de la tastatura.
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
}

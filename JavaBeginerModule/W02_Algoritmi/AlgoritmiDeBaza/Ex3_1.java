package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex3_1 {

    /*
    3.1. O metoda care sa determine daca un numar (primit ca parametru) este un numar crescator
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        int n = sc.nextInt();
        System.out.println("Is number ascending ? R: " + numberIsAscending(n));
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

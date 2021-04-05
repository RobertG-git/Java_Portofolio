package C12_1_SupraincarcareaMetodelorTransParam;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        /*
        0.1.Factorialul unui numar (i.e. n! - citit „n factorial“) este egal cu produsul: n! = 1 * 2 * 3 * … * (n - 2) * (n - 1) * n.
        Implementeaza o metoda iterativa care calculeaza factorialul unui numar n, primit ca parametru.
        Metoda trebuie sa functioneze ca in exemplele:
            factorialI(0) -> (1) // Exceptie de la regula factorialului
            factorialI(5) -> (120)
         */

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();
        factorial(n);
    }

    public static void factorial(int n) {
        long factorial = 1;
        System.out.println("factoial(0)" + " --> " + factorial);
        for (int it = 1 ; it <= n ; it++) {
            factorial *= it;
            System.out.println("factoial(" + it + ")" + " --> " + factorial);
        }
    }


}

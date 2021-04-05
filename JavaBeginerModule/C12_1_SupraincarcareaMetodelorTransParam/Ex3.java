package C12_1_SupraincarcareaMetodelorTransParam;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        /*
        2.1. Defineste o metoda iterativa (i.e. multiplyWithSumI(int, int)) care realizeaza inmultirea a doua numere (i.e. a si b) folosind doar operatorul de adunare.
        De exemplu, pentru a calcula a * b se poate realiza o metoda care sa adune a + a + … + a de b ori sau b + b + … + b de a ori.
         */

        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert 'a' and 'b' numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        multiplyWithSum(a, b);
    }

    public static void multiplyWithSum(int a, int b){
        int multiplyWithSum = 0;
        for (int it = 0 ; it < b ; it++) {
            multiplyWithSum += a;
        }
        System.out.println("a * b is: " + multiplyWithSum);
    }
}

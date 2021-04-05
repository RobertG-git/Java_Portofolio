package C11_1_MetodeInJavaReutilizareaCoduluiVoid;

import java.util.Scanner;

public class ClassEx6 {

        //check if number is even and sum digit is even
    public static void main (String[] args) {

        int upperLimit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number: ");
        upperLimit = sc.nextInt();

        for (int it = 0 ; it <= upperLimit ; it++) {
            if (isEven(it) == true && sumDigits(it) == true) {
                System.out.print(it + " ");
            }
        }
    }

        //check if number is even
    public static boolean isEven (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

        //check if sum digits is even
    public static boolean sumDigits (int number){
        int digitsSum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            digitsSum += lastDigit;
            number /= 10;
        }
        return isEven(digitsSum);
    }
}

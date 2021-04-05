package src.C7_EnhancedFor_Enum.ClassEx1;

public class Ex1 {

    /*
    Write a program to check whether a given number is an ugly number.
    Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
     */

    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }

    public static boolean isUgly(int num) {
        boolean aux = true;

        if(num == 1){
            aux = true;
        }
        if(num == 0) {
            return false;
        }
        while (num != 1) {
            if(num % 2 == 0) {
                num = num / 2;
            } else if (num % 3 == 0) {
                num = num / 3;
            } else if (num % 5 == 0) {
                num = num / 5;
            } else {
                aux = false;
                return aux;
            }
        }

        return aux;
    }
}

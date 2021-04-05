package src.C11_CompunereAgregare_Polimorfism.Ex2;

public class PolimorfismStatic {
    public static void main(String[] args) {
        printNumber("50");
        printNumber(25);
        printNumber(25.5);
    }

    public static void printNumber(String aString) {
        System.out.println(aString);
    }

    public static void printNumber(int aInt) {
        System.out.println(aInt);
    }

    public static void printNumber(double aDouble) {
        System.out.println(aDouble);
    }

}

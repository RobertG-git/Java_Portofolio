package src.W01_ProblemeDeAlgoritmica;

public class Ex8 {
    /*
    A self-dividing number is a number that is divisible by every digit it contains.
    For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
    Also, a self-dividing number is not allowed to contain the digit zero.
    Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
     */

    public static void selfDividingNumbers(int left, int right) {
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isSelfDividing(int number) {
        int copyNumber = number;
        boolean isSelfDividing = true;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            if (lastDigit == 0 || copyNumber % lastDigit != 0) {
                isSelfDividing = false;
                break;
            }
        }
        return isSelfDividing;
    }

    public static void main(String[] args) {
        selfDividingNumbers(1, 22);
        System.out.println("\n" + isSelfDividing(21));
    }
}

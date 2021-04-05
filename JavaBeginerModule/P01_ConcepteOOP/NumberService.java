package P1_ConcepteOOP;

public class NumberService {

    protected static boolean perfectNumber(int n) {
        int sum = 0;
        for (int it = 1; it < n; it++) {
            if (n % it == 0) {
                sum += it;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }

    }

    protected static boolean oddNumber(int n) {
        if ( n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    protected static boolean sumDigitDiv3(int n) {
        int sumDigit = 0;
        int lastDigit;
        while (n != 0) {
            lastDigit = n % 10;
            sumDigit += lastDigit;
            n = n / 10;
        }
        if (sumDigit % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

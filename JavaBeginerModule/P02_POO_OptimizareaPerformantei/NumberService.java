package P2_POO_OptimizareaPerformantei;

public class NumberService {

    public static int reducingANumberBySummation(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            sum = sum + lastDigit;
        }

        while (sum > 10) {
            sum = reducingANumberBySummation(sum);
        }
        return sum;
    }

    public static boolean isPrimeAlgorithm(int n) {
        System.out.print("Calculated with isPrimeAlgorithm: ");
        for (int it = 2; it < n;  it++) {
            if (n % it == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectAlgorithm(int n) {
        System.out.print("Calculated with isPerfectAlgorithm: ");
        int perfectSum = 0;
        for (int it = 1; it <= n/2; it++) {
            if (n % it == 0) {
                perfectSum += it;
            }
        }
        return perfectSum == n;
    }

}

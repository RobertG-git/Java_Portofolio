package W02_Algoritmi.AlgoritmiDeBaza;

public class Ex2_2 {

    public static void main(String[] args) {

        /*
        2.2. Foloseste metoda implementata anterior pentru a afisa toate numerele magice cuprinse in intervalul
        [lowerLimit, uppeLimit], dat prin valorile lowerLimit respectiv upperLimit citite de la tastatura.*/

        int n;
        int lowerLimit = 9000;
        int upperLimit = 9050;

        for (int it =lowerLimit; it < upperLimit; it++) {
            if (isMagic(it)) {
                System.out.print(it + " ");
            }
        }

    }

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

    public static boolean isMagic(int n) {
        int reducingANumberBySummation = reducingANumberBySummation(n);

        if (reducingANumberBySummation == 3 || reducingANumberBySummation == 7 || reducingANumberBySummation == 9) {
            return true;
        } else {
            return false;
        }

    }
}
package C23_RecapitulareFinala.Ex6;

import java.util.Arrays;

public class Cmmmc {
    /*
    2. Scrie o metoda (i.e. int cmmmc(int[] values)) care calculeaza si returneaza cel mai mic multiplu comun al numerelor primite ca parametru.
     */

    public static void main(String[] args) {
        int[] values = {4, 60};
        System.out.println(cmmmcArray(values));
    }

    public static int cmmmcArray(int[] values) {
        int cmmmc = 0;
        for (int i = 0; i < values.length - 1; i++) {
            cmmmc += cmmmcValue(values[i], values[i + 1]);
        }
        return cmmmc;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Pair[] findDivisors(int number) {
        Pair[] divisors = new Pair[100];
        int numberOfElements = 0;
        int copyNumber = number;

        for (int i = 2; i < copyNumber; i++) {
            if (isPrime(i) && number % i == 0) {
                int counter = 0;
                while (number % i == 0 && number > 0) {
                    number /= i;
                    counter += 1;
                }

                Pair aux = new Pair(i, counter);
                divisors[numberOfElements] = aux;

                numberOfElements++;

            }
        }
        return Arrays.copyOf(divisors, numberOfElements);
    }

    public static int cmmmcValue(int firstNumber, int secondNumber) {
        Pair[] firstNoDivisors = findDivisors(firstNumber);
        Pair[] secondNoDivisors = findDivisors(secondNumber);


        Pair[] cmmcDivisors;
        cmmcDivisors = Arrays.copyOf(firstNoDivisors, firstNoDivisors.length);

        int cmmcValue = 1;

        // setting min exp for common divisors

        for (int i = 0; i < firstNoDivisors.length; i++) {
            for (int j = 0; j < secondNoDivisors.length; j++) {

                if (firstNoDivisors[i].getDivisor() == secondNoDivisors[j].getDivisor()) {
                    int minPow = Math.min(firstNoDivisors[i].getPow(), secondNoDivisors[j].getPow());

                    cmmcDivisors[i].setPow(minPow);
                }
            }
        }
        int numberOfElementsCmmc = firstNoDivisors.length;

        // adding to 'cmmc array' specific divisors with exp

        for (int i = 0; i < secondNoDivisors.length; i++) {
            boolean currentDivFound = false;

            for (int j = 0; j < firstNoDivisors.length; j++) {
                if (secondNoDivisors[i].getDivisor() == firstNoDivisors[j].getDivisor()) {
                    currentDivFound = true;
                    break;
                }
            }
            if (!currentDivFound) {
                if (numberOfElementsCmmc == cmmcDivisors.length) {
                    cmmcDivisors = Arrays.copyOf(cmmcDivisors, cmmcDivisors.length * 2);
                }

                Pair aux = new Pair(secondNoDivisors[i].getDivisor(), secondNoDivisors[i].getPow());
                cmmcDivisors[numberOfElementsCmmc] = aux;

                numberOfElementsCmmc++;
            }
        }

        cmmcDivisors = Arrays.copyOf(cmmcDivisors, numberOfElementsCmmc);

        // calculate 'cmmc'

        for (int i = 0; i <= firstNoDivisors.length; i++) {
            cmmcValue *= Math.pow(cmmcDivisors[i].getDivisor(), cmmcDivisors[i].getPow());
        }
        return cmmcValue;
    }

    public static void displayArrayObj(Pair[] pair) {
        for (int i = 0; i < pair.length; i++) {
            System.out.print(pair[i].getDivisor() + "^" + pair[i].getPow() + " ");
        }
    }
}

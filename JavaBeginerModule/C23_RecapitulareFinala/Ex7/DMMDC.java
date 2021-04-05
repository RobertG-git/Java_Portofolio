package C23_RecapitulareFinala.Ex7;

import java.util.Arrays;

public class DMMDC {
    /*
    1. Scrie o metoda (i.e. int cmmdc(int a, int b)) care calculeaza si returneaza cel mai mare divizor comun al numerelor a si b.
    2. Scrie o metoda (i.e. int cmmmc(int[] values)) care calculeaza si returneaza cel mai mare divizor comun al numerelor primite ca parametru.
    3. In afara de algoritmul clasic de calculare a C.M.M.D.C., care urmeaza abordarea matematica prezentata anterior,
    mai exista o metoda inedita de obtinere a CMMDC a 2 numere, anume Algoritmul lui Euclid.
    Parcurge abordarea acestui algoritm simplu pe wikipedia si implementeaza apoi o metoda (i.e. int cmmdcEuclid(int a, int b))
    care calculeaza si returneaza cel mai mare divizor comun al numerelor a si b folosind algoritmul lui Euclid.
     */

    public static void main(String[] args) {
        int[] values = {12, 18, 6, 36, 60};
        System.out.println(dmmdcArray(values));

        System.out.println(cmmdcEuclid(12, 18));
    }

    public static int cmmdcEuclid(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else if (a < b) {
                b = b - a;
            } else {
                return a;
            }
        }

        return a;
    }

    public static int dmmdcArray(int[] values) {
        int dmmdc = dmmdcValue(values[0], values[1]);

        for (int i = 3; i < values.length; i++) {
            dmmdc = dmmdcValue(dmmdc, values[i]);
        }
        return dmmdc;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static PairDmmdc[] findDivisors(int number) {
        PairDmmdc[] divisors = new PairDmmdc[100];
        int numberOfElements = 0;
        int copyNumber = number;

        for (int i = 2; i < copyNumber; i++) {
            if (isPrime(i) && number % i == 0) {
                int counter = 0;
                while (number % i == 0 && number > 0) {
                    number /= i;
                    counter += 1;
                }

                PairDmmdc aux = new PairDmmdc(i, counter);
                divisors[numberOfElements] = aux;

                numberOfElements++;

            }
        }
        return Arrays.copyOf(divisors, numberOfElements);
    }

    public static int dmmdcValue(int firstNumber, int secondNumber) {

        PairDmmdc[] firstNumberDivisors = findDivisors(firstNumber);
        PairDmmdc[] secondNumberDivisors = findDivisors(secondNumber);

        PairDmmdc[] dmmdc = new PairDmmdc[100];
        int numberOfElements = 0;

        for (int i = 0; i < firstNumberDivisors.length; i++) {
            int minPow = Integer.MAX_VALUE;
            for (int j = 0; j < secondNumberDivisors.length; j++) {
                if (firstNumberDivisors[i].getDivisor() == secondNumberDivisors[j].getDivisor()) {
                    minPow = Math.min(firstNumberDivisors[i].getPow(), secondNumberDivisors[j].getPow());
                    PairDmmdc aux = new PairDmmdc(firstNumberDivisors[i].getDivisor(), minPow);

                    dmmdc[numberOfElements] = aux;
                    numberOfElements++;

                }

                if (numberOfElements == dmmdc.length) {
                    dmmdc = Arrays.copyOf(dmmdc, dmmdc.length * 2);
                }
            }
        }

        dmmdc = Arrays.copyOf(dmmdc, numberOfElements);

        int dmmdcValue = 1;
        for (int i = 0; i < dmmdc.length; i++) {
            dmmdcValue *= Math.pow(dmmdc[i].getDivisor(), dmmdc[i].getPow());
        }
        return dmmdcValue;
    }

    public static void displayArrayObj(PairDmmdc[] pair) {
        for (int i = 0; i < pair.length; i++) {
            System.out.print(pair[i].getDivisor() + "^" + pair[i].getPow() + " ");
        }
    }
}

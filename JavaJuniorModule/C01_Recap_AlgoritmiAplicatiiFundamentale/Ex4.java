package src.C1_Recap_AlgoritmiAplicatiiFundamentale;

public class Ex4 {
    /*
    Spunem ca doua numere sunt numere amicale daca suma divizorilor proprii (plus divizorul 1) ai primului numar este
    egala cu al doilea numar si invers (i.e. suma divizorilor proprii plus divizorul 1 al celui de-al doilea numar este egala cu primul numar).
    De exemplu, perechea (220, 284) respecta aceasta proprietate deoarece:

    220 are suma divizorilor 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 → 284 (cel de-al doilea numar)
    284 are suma divizorilor 1 + 2 + 4 + 71 + 142 → 220 (primul numar)

    Implementeaza urmatoarele metode pentru detectia respectiv generarea de numere amicale:

    Implementeaza o metoda care primeste ca parametri doua numere si testeaza daca acestea formeaza sau nu o pereche de numere amicale.
    Utilizeaza metoda implementata anterior pentru a determina toate perechile de numere amicale cuprinse in intervalul
    [lowerLimit, upperLimit], dat prin valorile lowerLimit respectiv upperLimit citite de la tastatura.

     */

    public static void main(String[] args) {

        pairFriendlyNumberV2(1 ,10000);
    }
    // var 1.
    public static void pairFriendlyNumbersV1(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i < upperLimit; i++) {
            for (int j = lowerLimit; j < i; j++) {
                if(areNumbersFriendly(i,j)) {
                    System.out.println(i + " " + j );
                }
            }
        }
    }

    // var 2.
    public static void pairFriendlyNumberV2(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit ; i < upperLimit; i++) {
            int rez = getFriend(i);

            if (i < rez) {
                System.out.println(i + " " + rez);
            }
        }

    }

    public static boolean areNumbersFriendly(int firstNumber, int secondNumber) {
        int sumDivFirstNumber =  sumDiv(firstNumber);
        int sumDivSecondNumber = sumDiv(secondNumber);
        return ((sumDivFirstNumber == secondNumber) && (sumDivSecondNumber == firstNumber));
    }

    public static int sumDiv(int n) {
        int sum = 0;
        for (int i = 1 ; i < n ; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static int getFriend (int n) {
        int possibleFriendOfX = sumDiv(n);
        int possibleFriendOfPossibleFiendOfX = sumDiv(possibleFriendOfX);

        if ( n == possibleFriendOfPossibleFiendOfX) {
            return possibleFriendOfX;
        }

        return n;
    }


}

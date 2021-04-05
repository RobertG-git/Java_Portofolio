package src.C1_Recap_AlgoritmiAplicatiiFundamentale;

public class Ex6 {
    /*
    Spunem ca 3 numere formeaza un triplet Pitagoreic daca acestea respecta relatia a2 + b2 == c2.
    Dandu-se upperLimit, gaseste toate tripletele Pitagoreice care au toate numerele mai mici sau egale cu upperLimit.
    Atentie, fiecare triplet va fi afisat o singura data, iar numerele tripletului vor fi afisate in ordine crescatoare.
    Ordinea tripletelor nu este relevanta. De asemenea, numerele Pitagoreice sunt numere naturale, nenule.
     */

    public static void main(String[] args) {
        PitagoreicTripletsV1(30);
        System.out.println();
        PitagoreicTripletsV2(30);
    }

    // var1

    public static void PitagoreicTripletsV1(int upperLimit) {
        for (int i = 1; i <= upperLimit; i++) {
            for (int j = i; j <= upperLimit; j++) {
                for (int k = j; k <= upperLimit; k++) {
                    if (i * i + j * j == k * k ) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    // var2

    public static void PitagoreicTripletsV2(int upperLimit) {
        for (int i = 1; i < upperLimit; i++) {
            for (int j = i; j < upperLimit; j++) {
                int k2 = i * i + j * j;
                int k = (int) Math.sqrt(k2);
                if (k * k == k2 && k <= upperLimit) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}

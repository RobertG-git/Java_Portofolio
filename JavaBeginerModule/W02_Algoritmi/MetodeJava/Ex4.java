package W02_Algoritmi.MetodeJava;

public class Ex4 {

    /*
    4. Spunem ca 3 numere formeaza un triplet Pitagoreic daca acestea respecta relatia a2 + b2 == c2.
    Dandu-se upperLimit, gaseste toate tripletele Pitagoreice care au toate numerele mai mici sau egale cu upperLimit.
     */

    public static void main(String[] args) {
        int upperLimit = 30;

        for (int i = 1; i <= upperLimit; i++) {
            for (int j = i; j <= upperLimit; j++) {
                for (int k = i + 1; k <= upperLimit; k++) {
                    if (((i * i) + (j * j)) == (k * k)) {
                        System.out.print(i + " " + j + " " + k);
                        System.out.println();
                    }
                }
            }
        }
    }
}

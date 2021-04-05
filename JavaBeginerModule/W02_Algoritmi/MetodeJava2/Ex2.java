package W02_Algoritmi.MetodeJava2;

public class Ex2 {
    /*
    2. Numar zig-zag
    2.1. Scrie o metoda care determina daca un numar este zig-zag si returneaza o valoare boolean in consecinta:
        true - daca numarul este zig-zag
        false - altfel

    2.2. Scrie o metoda care calculeaza si returneaza valoarea maxima a „zig-zag“-ului,
    definita ca fiind diferenta maxima intre 2 cifre consecutive ale numarului.
     */

    public static void main(String[] args) {

        System.out.println(isZigZag(2805914));
        System.out.println(maxZigZag(2805914));

    }

    public static boolean isZigZag(int n) {

        int[] copyN = new int[String.valueOf(n).length()];
        for (int i = 0; i < copyN.length; i++) {
            copyN[i] = n % 10;
            n /= 10;
        }
        boolean aux = true;

        for (int i = 0; i < copyN.length - 2; i++) {
            if (copyN[0] < copyN[1]) {
                if (copyN[i] > copyN[i + 1] && copyN[i + 1] < copyN[i + 2]) {
                    aux = false;
                    break;
                }
            } else if (copyN[0] > copyN[1]) {
                if (copyN[i] < copyN[i + 1] && copyN[i + 1] > copyN[i + 2]) {
                    aux = false;
                    break;
                }

            }
            i++;
        }

        for (int i = 0; i < copyN.length - 1; i++) {
            if (copyN[i] == copyN[i + 1]) {
                aux = false;
                break;
            }
        }

        return aux;
    }

    public static int maxZigZag(int n) {
        int secondCopyN = n;
        int[] copyN = new int[String.valueOf(n).length()];
        for (int i = 0; i < copyN.length; i++) {
            copyN[i] = n % 10;
            n /= 10;
        }
        int maxZigZag  = Integer.MIN_VALUE;
        if (isZigZag(secondCopyN)) {
            for (int i = 0; i < copyN.length - 1; i++) {
                int dif = Math.abs(copyN[i] - copyN[i + 1]);
                if (dif > maxZigZag) {
                    maxZigZag = dif;
                }
            }
            return maxZigZag;
        } else
            return -404;
    }
}

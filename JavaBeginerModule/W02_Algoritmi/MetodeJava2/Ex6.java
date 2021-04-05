package W02_Algoritmi.MetodeJava2;

public class Ex6 {

    /*
    6. Numar fericit
        Un numar fericit (Happy number), este acel numar care, prin insumarea repetata a patratelor cifrelor sale,
        se obtine in final cifra 1. Un exemplu in acest sens este numarul 7:

        7 → 7^2 → 49 → 4^2 + 9^2 → 97 → 9^2 + 7^2 → 130 → 1^2 + 3^2 + 0^2 → 10 → 1^2 + 0^2 → 1

        7.1. Implementeaza o metoda care determina daca un numar este sau nu fericit si returneaza o valoare boolean in consecinta.
        7.2. Foloseste metoda implementata anterior pentru a genera sirul numerelor fericite pana la n inclusiv, unde n se citeste de la tastatura.
     */

    public static void main(String[] args) {
        System.out.println(isHappyNumber(7));
        happyNumberRow(30);
    }

    public static boolean isHappyNumber(int n) {
        int counter = 0;

        boolean aux = false;

        while (counter < 9999) {
            int sum = 0;
            while (n != 0) {
                for (int i = 0; i < n; i++) {
                    int lastDigit = n % 10;
                    sum += lastDigit * lastDigit;
                    n /= 10;
                }
            }
            n = sum;
            counter++;
            if (sum == 1) {
                aux = true;
                break;
            }
        }
        return aux;
    }

    public static void happyNumberRow(int n) {
        for (int i = 0; i < n; i++) {
            if(isHappyNumber(i)) {
                System.out.print (i + " ");
            }
        }
    }
}

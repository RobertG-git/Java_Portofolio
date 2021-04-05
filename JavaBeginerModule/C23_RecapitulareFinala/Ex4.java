package C23_RecapitulareFinala;

public class Ex4 {
    /*
    Scrie o metoda (i.e. int cmmmc(int a, int b)) care calculeaza si returneaza cel mai mic multiplu comun al numerelor a si b.
     */

    public static void main(String[] args) {

        int n = 8;
        int previousValue = 2;
        int counter = 1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
                i--;
                counter++;
                System.out.print(counter);
            }
        }

    }

}

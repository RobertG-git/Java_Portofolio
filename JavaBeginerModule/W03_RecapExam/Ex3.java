package W03_RecapExam;

public class Ex3 {
    /*
    3. [0.5p] Defineste o metoda care primeste drept parametru un numar si returneaza:

        0 daca numarul respectiv este numar perfect:
        Un numar perfect are suma tuturor divizorilor proprii plus divizorul 1 egala cu numarul insusi
        Exemple: 6 == 1 + 2 + 3, 28 == 1 + 2 + 4 + 7 + 14
        -1 daca numarul respectiv este numar deficient:
        Un numar deficient are suma tuturor divizorilor proprii plus divizorul 1 mai mica decat numarul insusi.
        Exemple: 4 > 1 + 2, 21 > 1 + 3 + 7
        +1 daca numarul respectiv este numar abundent:
        Un numar abundent are suma tuturor divizorilor proprii plus divizorul 1 mai mare decat numarul insusi
        Exemple: 12 < 1 + 2 + 3 + 4 + 6, 18 < 1 + 2 + 3 + 6 + 9

        In cadrul rezolvarii fiecarui subpunct din exercitiul urmator, este
     */

    public static void main(String[] args) {
        int n = 12;

        if (isPerfectDefAb(n) == n) {
            System.out.println("Number is perfect");
        } else if(isPerfectDefAb(n) < n) {
            System.out.println("Number is deficient");
        } else if(isPerfectDefAb(n) > n) {
            System.out.println("Number is abundent");
        }
    }

    public static int isPerfectDefAb (int n) {
        int sum = 1;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

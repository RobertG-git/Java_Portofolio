package W02_Algoritmi.MetodeJava;

public class Ex7 {

    /*
    7. Se defineste suma sirului patratelor perfecte astfel: sum(n) == 12 + 22 + 32 + … + n2.
     Dandu-se de la tastatura un numar natural n mare, sa se afiseze ultimele 9 cifre ale sumei daca valoarea este mai mare de 9 cifre sau tot numarul altfel.
     */

    public static void main(String[] args) {

        int n = 1123432878    ;
        long sqrtSum = 0L;

        for (int i = 0; i <= n; i++) {
            sqrtSum += (i * i);
        }
        sqrtSum = sqrtSum % 1_000_000_000L;
        System.out.println(sqrtSum);
    }
}

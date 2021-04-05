package W03_RecapExam;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Ex2 {
    /*
    2. [Bonus 0.5p] Scrie o metoda care determina daca un numar este de forma par-impar si returneaza o valoare (i.e. true sau false in consecinta).
    Un numar este par-impar daca paritatea cifrelor sale alterneaza.
    Cateva exemple in acest sens sunt:
        14385 → true: deoarece paritatea cifrelor sale alterneaza astfel: 1 (impar) – 4 (par) – 3 (impar) – 8 (par) – 5 (impar)
        963510 → false: deoarece cifrele …35… au aceeasi paritate
        410103 → true, alternanta este: par - impar - par - impar - … - impar
     */

    public static void main(String[] args) {

        int n = 14385;
        int copyN = n;
        int anteLastDigit;
        boolean isOddEven = false;
        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;

            if (n > 0) {
                anteLastDigit = n % 10;
            } else {
                break;
            }
            System.out.println(lastDigit % 2 + " " + anteLastDigit % 2);
            if ((lastDigit % 2) != (anteLastDigit % 2)) {
                isOddEven = true;
            } else {
                isOddEven = false;
                break;
            }

        }
        System.out.println("The number " + copyN + " isEvenOdd R: " + isOddEven +"." );
    }
}

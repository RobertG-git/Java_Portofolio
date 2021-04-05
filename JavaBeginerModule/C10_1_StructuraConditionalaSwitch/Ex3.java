package C10_1_StructuraConditionalaSwitch;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        /*
        3. Implementeaza un algoritm care citeste de la tastatura un numar n
        si afiseaza toate numerele naturale mai mici sau egale cu n precedate alternativ de unul dintre simbolurile +, *, ~, -, ca in exemplul urmator:
        # INPUT: n == 21
        +0 *1 ~2 -3 +4 *5 ~6 -7 +8 *9 ~10 -11 +12 *13 ~14 -15 +16 *17 ~18 -19 +20 *21
         */

        int n;
        int it=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number: ");
        n = sc.nextInt();

        while (it < n) {
            switch (n % 4) {
                case 1:
                    System.out.print("+" + it);
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                case 2:
                    System.out.print("*" + it);
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                case 3:
                    System.out.print("~" + it);
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                case 0:
                    System.out.print("-" + it);
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
             }
        }
    }
}

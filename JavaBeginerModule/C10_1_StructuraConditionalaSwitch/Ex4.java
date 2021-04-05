package C10_1_StructuraConditionalaSwitch;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        /*
        4. Se citeste de la tastatura un numar natural n.
        Sa se afiseze toate numerele naturale, in ordine crescatoare, pana la n, care au ultima cifra diferita de 1, 0 si 8.
         */

        int n;
        int it = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();

        while ( it  < n ){
            switch (it % 10) {
                case 0:
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                    continue;
                case 1:
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                    continue;
                case 2:
                    System.out.print(it + " ");
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                case 3:
                    System.out.print(it + " ");
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                case 4:
                    System.out.print(it + " ");
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                case 5:
                    System.out.print(it + " ");
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                case 6:
                    System.out.print(it + " ");
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                case 7:
                    System.out.print(it + " ");
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                case 8:
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }
                    continue;
                case 9:
                    System.out.print(it + " ");
                    it++;
                    if (it == (n + 1)) {
                        break;
                    }

            }

        }

    }

}

package C9_2_InstructiuneaIterativaDoWhile;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        int nrMagic;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bun venit! Te invitam sa ghicesti numarul, aflat in intervalul [0, 10]. ");

        do {
            System.out.println("Incearcati norocul: ");
            nrMagic = sc.nextInt();

            if ((nrMagic < 0) || (nrMagic > 10)) {
                System.out.println("Atentie! Numarul magic se afla in intervalul [0,10]");
            continue;
            }

            if ((nrMagic < 5) && (nrMagic > 0)) {
                System.out.println("Esti aproape! Dar numarul magic este mai mare.");
            }

            if ((nrMagic > 5) && (nrMagic <= 10)) {
                System.out.println("Esti aproape! Dar numarul magic este mai mic.");
            }

        } while (nrMagic != 5);

        System.out.println("Ai ghicit, bravo!");
    }
}

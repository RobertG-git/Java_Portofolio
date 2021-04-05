package C9_2_InstructiuneaIterativaDoWhile;

import java.util.Scanner;

public class ClassEx3 {

    public static void main(String[] args) {

        int it = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number: ");
        int n = sc.nextInt();

        do {
            System.out.println(it);
            it += 2;
        } while (it <= n);

    }
}

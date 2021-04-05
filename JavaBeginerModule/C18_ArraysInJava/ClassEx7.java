package C18_ArraysInJava;

import java.util.Scanner;

public class ClassEx7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert array dimension: ");
        int n = sc.nextInt();

        int [] pp = new int[n];
        for (int it = 0; it < pp.length; it++) {
            pp[it] = it * it;
            System.out.print(pp[it] + " ");
        }
    }
}

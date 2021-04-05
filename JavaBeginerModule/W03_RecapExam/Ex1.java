package W03_RecapExam;

import java.util.Scanner;

public class Ex1 {

    /*
    1. [0.5p] Implementeaza o metoda care primeste ca parametru un array de numere intregi si returneaza un array, de aceeasi dimensiune, care contine ultima cifra a fiecarui numar din primul array, in aceeasi ordine.
     */

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n': ");
        n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Please insert the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] % 10;
            System.out.print(newArray[i] + ", ");
        }
    }
}

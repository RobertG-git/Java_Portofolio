package W01_StructuriDeControl;

import java.util.Scanner;

public class ExtraEx5 {

    public static void main(String[] args) {

        //4.3. Implementeaza un program care afiseaza toti divizorii proprii (adica toti divizorii fara 1 si numarul insusi) ai unui numar natural n citit de la tastatura. Cateva exemple sunt:

        int n;
        int nrOfDivisors = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your 'n' number: ");
        n = sc.nextInt();

        for (int i = 2 ; i < n ; i++) {
            if (n % i == 0) {
                nrOfDivisors++;
                System.out.print(i + " ");
            }
        }

        if(nrOfDivisors == 0) {
            System.out.println("The number is prime.");
        }

        sc.close();

    }
}

package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/* 2. Scrie un program care afiseaza urmatoarele siruri de numere, dupa citirea unei valori n de la tastatura. 
		 * 	  De aceasta data, foloseste instructiunea iterativa for in implementare:
		 */

		// a. Sirul numerelor naturale pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert your digit: ");
		n = sc.nextInt();
		int m = n - n % 2;
		sc.close();
		
		System.out.print("1. ");
		
		for (int it = 0 ; it <= n ; it++) {
			System.out.print(it + " ");
		}
		
		
		// b. Sirul numerelor impare pana la n (inclusiv), incepand cu 1, in ordine crescatoare.
		
		System.out.println();
		System.out.print("2. ");
		
		for (int it2 = 1 ; it2 < n - n % 2 ; it2 += 2) {
			System.out.print(it2 + " ");
		}
		
		// c. Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare.
		
		
		int it3 = 0;
		
		System.out.println();
		System.out.print("3. ");
		
		for ( ; m >= it3 ; m -= 2 ) {
			System.out.print(m + " ");
		}
		
		// d. Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
		
		System.out.println();
		System.out.print("4. ");
		
		for (int it4 = 0 ; it4 <= n ; it4++ ) {
			if (it4 % 5 == 0) {
				System.out.print(it4 + " ");
			}
		}
		
		
	}

}

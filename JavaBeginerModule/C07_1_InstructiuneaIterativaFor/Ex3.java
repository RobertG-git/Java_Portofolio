package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		/*
		 * Scrie un program care citeste de la tastatura un numar natural n, ce reprezinta numarul de elemente, urmat de n numere intregi. 
		 * Programul va afisa, la final, numarul de numere pozitive si respectiv numarul de numere negative introduse.
		 */
		
		int n, m;
		int pozitiveNumbers = 0;
		
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		
		for (int it = 0 ; it < n ; it++ ) {
			
			m = sc.nextInt();
			if (m > 0 ) {
				pozitiveNumbers++;
			}
		
		}
		
		System.out.println("Pozitive numbers: " + pozitiveNumbers);
		System.out.println("Negative numbers: " + (n - pozitiveNumbers));

		sc.close();
	}

}

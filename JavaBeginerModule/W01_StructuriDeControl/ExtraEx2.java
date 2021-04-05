package W01_StructuriDeControl;

import java.util.Scanner;

public class ExtraEx2 {

	public static void main(String[] args) {
		
		/*
		 * Scrie un program care citeste de la tastatura un numar natural n si afiseaza numarul complementar, astfel incat suma lor sa fie cel mai mic „numar rotund-perfect“.
		 * Un „numar rotund-perfect“ este un numar care are prima cifra 1, urmata doar de 0-uri. 
		 * Sa consideram cateva exemple pentru a intelege mai bine:
		 * 
		 */
		
		int n;
		int a = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert your number: ");
		n = sc.nextInt();
		sc.close();

		for ( a = 1 ; a < n ; a *= 10 ) {

		}
		
		System.out.println("Complementarul numarului introdus este: " + (a-n));
	
		
	}

}

package W01_StructuriDeControl;

import java.util.Scanner;

public class ExtraEx1 {

	public static void main(String[] args) {
		
		/*
		 * Puterile bazei.
		 * Scrie un algoritm care citeste de la tastatura 2 numere naturale: o baza (i.e. b) si un exponent maxim (i.e. e). Programul va afisa toate puterile bazei, de la b0 la be (i.e. b0, b1, b2, …, be). Exemplu
		 */

		int b;	
		int e;
		int it = 0;
		int power = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert the base 'b': ");
		b = sc.nextInt();
		System.out.println("Please insert the exponent 'e': ");
		e = sc.nextInt();
		sc.close();
		
		System.out.print("1 ");
		for (it = 0 ; it < e ; it++) {
			
			power *= b;
			System.out.print(power + " ");
			
		}
		
	}

}

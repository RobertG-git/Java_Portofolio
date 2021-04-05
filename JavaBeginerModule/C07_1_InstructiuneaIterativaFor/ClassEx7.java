package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class ClassEx7 {

	public static void main(String[] args) {
		
		int odd = 0;
		int notOdd = 0;
		int m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti numarul de elemente: ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++ ) {
			System.out.println("Introduceti nr: " + (i + 1) + " / " + n + " : ");
			m = sc.nextInt();
			
			if (m % 2 == 1) {
				odd++ ;
			} else {
				notOdd++ ;
			}
		
		}
		
		System.out.println("Nr. de numere pare este: " + notOdd);
		System.out.println("Nr. de numere impare este: " + odd);
		
		sc.close();
	}

}

package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class ClassEx5 {

	public static void main(String[] args) {
		
		// Afisarea tuturor divizorilor proprii ai unui numar number, dat:
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for (int it = 2 ; it < number ; it++) {
			if (number % it == 0) {
			System.out.println(it);
			}
			
		}
		
		sc.close();

	}

}

package C8_1_ControlulFluxului;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		int n;
		int auxN, auxM;
		int minCounter = Integer.MAX_VALUE;
		int maxCounter= Integer.MIN_VALUE;
		int counter = 0;
		int minDigit = 0;
		int maxDigit = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert the number of digits: ");
		n = sc.nextInt();

		for (int i = 0 ; i < n ; i++ ) {
			
			System.out.println("Please intert the digit number " + (i+1) + " : ");
			auxN = sc.nextInt();
			auxM = auxN;
			
			while (auxN != 0) {
				counter++;
				auxN /= 10;
			}
			
			// 2.3.1
			if (counter < minCounter) {
				minCounter = counter;
				minDigit = auxM;
			}
			
			// 2.3.2
			if (counter > maxCounter) {
				maxCounter = counter;
				maxDigit = auxM;
			}
			
			counter = 0;
				
		}
		
		// 2.3.1
		System.out.println("Numarul cu cele mai putine cifre este: " + minDigit );
	
		// 2.3.2
		System.out.println("Numarul cu cele mai multe cifre este: " + maxDigit );
		
		sc.close();
	}

}

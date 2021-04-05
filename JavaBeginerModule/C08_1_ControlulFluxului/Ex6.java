package C8_1_ControlulFluxului;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		int n;
		int lastDigit;
		int countDigitDiv7 = 0;
		int auxN;
		int countSumDigitsN =0;
		int div5numbers = 0;
		int hasLastDigit3Or7Or9 = 0;
		int totalDigits = 0;
		int hasFirstDigit2 = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for  (int i = 0 ; i < n ;  i++) {
			
			//2.2.1
			auxN = sc.nextInt();
			if (auxN % 7 == 0) {
				countDigitDiv7++;
			}
			
			// 2.2.4
			if (auxN == 0) {
				totalDigits++;
			}
			
			// 2.2.2
			while (auxN != 0 ) {
				
				lastDigit = auxN % 10;
				countSumDigitsN += lastDigit;
				auxN = auxN / 10;
				
				// 2.2.5
				if ((auxN == 0) && (lastDigit == 2 ? true : false)) {
					hasFirstDigit2++;
				}
				
				// 2.2.4
				totalDigits++;
				
				// 2.2.3
				if (lastDigit == 3 || lastDigit == 7 || lastDigit == 9) {
					hasLastDigit3Or7Or9++ ;
				}
				
			}
			
			if (countSumDigitsN % 5 == 0) {
				div5numbers++;
			}
			
			countSumDigitsN = 0;
			
		}
		
		// 2.2.1
		System.out.println("Numere divizibile cu 7: " + countDigitDiv7);
		
		// 2.2.2
		System.out.println("Numarul de numere care au suma cifrelor divizibila cu 5: " + div5numbers);
	
		// 2.2.3
		System.out.println("Numere care au ultima cifra 3, 7 sau 9: " + hasLastDigit3Or7Or9);

		// 2.2.4
		System.out.println("Numarul total de cifre ale numerelor: " + totalDigits);

		// 2.2.5
		System.out.println("Numere care au prima cifra 2: " + hasFirstDigit2);

		sc.close();
	}

}

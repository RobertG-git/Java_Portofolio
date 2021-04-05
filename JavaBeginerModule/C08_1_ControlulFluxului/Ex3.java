package C8_1_ControlulFluxului;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int n;
		int lastDigit;
		int oddCounter = 0;
		int evenCounter = 0;
		int sum = 0;
		boolean containDigit9 = false;
		boolean containDigit1 = false;
		boolean containDigit0 = false;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int auxN = n;
		
		while (n != 0 ) {
			
			lastDigit = n % 10 ;
			n /= 10;
			sum += lastDigit;
			
			if (lastDigit == 9) {
				containDigit9 = true;
			}
			
			if (lastDigit == 1) {
				containDigit1 = true;
			}
			if (lastDigit == 0) {
				containDigit0 = true;
			}
			
			if (lastDigit % 2 == 0) {
				evenCounter++ ;
			} else {
				oddCounter++ ;
			}
			

		}
	
		boolean hasOnlyEven = oddCounter == 0 ? true : false ;
		System.out.println("Contine numai cifre pare? R: " + hasOnlyEven);
	
		boolean hasMoreEven = evenCounter > oddCounter ? true : false;
		System.out.println("Contine mai multe cifre pare decat cifre impare? R: " + hasMoreEven);
	
		boolean sumDiv5 = sum % 5 == 0 ? true : false;
		System.out.println("Suma cifrelor sale este divizibila cu 5? R: " + sumDiv5);
	
		boolean isNumberOfDigitDiv3 = (oddCounter + evenCounter) % 3 == 0 ? true : false;
		System.out.println("Numarul de cifre este multiplu de 3? R: " + isNumberOfDigitDiv3);
	
		System.out.println("Numarul contine cifra 9? R: " + containDigit9);
		
		boolean contain3or7or9 = (auxN % 10 == 3) || (auxN % 10 == 7) || (auxN % 10 == 9);
		System.out.println("Numarul se termina in oricare dintre cifrele 3, 7 sau 9? R: " + contain3or7or9 );
	
		boolean numerIsOneDigit = auxN / 10 == 0 ? true : false;
		System.out.println("Numarul este o cifra (i.e. este alcatuit dintr-o singura cifra)? R: " + numerIsOneDigit );
	
		System.out.println("Numarul contine cifra 1 si cifra 0? " + (containDigit1 && containDigit0 ? true : false));
	
		sc.close();
	}

}

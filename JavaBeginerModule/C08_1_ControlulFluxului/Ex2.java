package C8_1_ControlulFluxului;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int n;
		int lastDigit = 0;
		int sum = 0;
		
		System.out.println("Please insert the 'n' number: ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while (n != 0) {
			
			lastDigit = n % 10;
			sum = sum + lastDigit;
			n /= 10 ;
			
		}
		
		System.out.println("Suma cifrelor este: " + sum);
		
		sc.close();
	}

}

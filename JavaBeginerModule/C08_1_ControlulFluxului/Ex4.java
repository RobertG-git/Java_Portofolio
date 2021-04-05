package C8_1_ControlulFluxului;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int n;
		int lastDigit;
		int symmetricN = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		while (n != 0) {
			lastDigit = n % 10;
			n = n / 10;
			symmetricN = symmetricN * 10 + lastDigit; 
			
		}
		
		System.out.println("Simetricul este: " +  symmetricN);

		sc.close();
	}

}

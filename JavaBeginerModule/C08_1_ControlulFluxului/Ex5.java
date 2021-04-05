package C8_1_ControlulFluxului;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		int n;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double sum = 0;
		int auxN;
		int m;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		auxN = n;
		
		for (int it = 0 ; it < n ; it++) {
			
			m = sc.nextInt();
			
			if (m < min) {
				min = m;
			}
			
			if (m > max) {
				max = m;
			}
			
			sum += m;
			
		}
		
		double medieAritmetica = sum / auxN;

		System.out.println("Numarul minim: " + min);
		System.out.println("Numarul maxim: " + max);
		System.out.println("Media aritmetica: " + medieAritmetica );
		
		sc.close();
	}

}

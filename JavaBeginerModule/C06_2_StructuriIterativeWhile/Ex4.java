package C6_2_StructuriIterativeWhile;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int aux = 0;
		String message;
		int upperLimit;
		int dec;
		
		Scanner sc = new Scanner(System.in);
		message = sc.nextLine();
		upperLimit = sc.nextInt();
		dec = sc.nextInt();
		
		System.out.println("Start counting...");
		
		while (aux <= upperLimit ) {
			System.out.println(message+ "   " + upperLimit);
			upperLimit = upperLimit - dec;
		}
		
		System.out.println("End counting...");
		
		sc.close();
	}

}

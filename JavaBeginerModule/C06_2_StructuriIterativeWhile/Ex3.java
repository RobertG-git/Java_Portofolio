package C6_2_StructuriIterativeWhile;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Introduceti un numar natural pozitiv:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while (n > 0) {
			System.out.println("Dublul sau este: " + (n*2));
			System.out.println("Introduceti un numar natural pozitiv:");
			n = sc.nextInt();
		}
		
		System.out.println("La revedere!");
		
		sc.close();

	}

}

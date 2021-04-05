package C4_2_CitireaDeLaTastatura;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int sum3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdu valoarea nr.a: ");
		int a = sc.nextInt();
		
		System.out.println("Introdu valoarea nr.b: ");
		int b = sc.nextInt();
		
		System.out.println("Introdu valoarea nr.c: ");
		int c = sc.nextInt();
		
		sum3 = a + b + c;
		System.out.println("Suma numerelor a, b, c este: " + sum3 +".");
		
		sc.close();
		
	}

}

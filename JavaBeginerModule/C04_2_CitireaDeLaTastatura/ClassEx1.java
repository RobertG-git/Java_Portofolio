package C4_2_CitireaDeLaTastatura;

import java.util.Scanner;

public class ClassEx1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdu numele (si apasa Enter):");
		String prenume = sc.next();

		System.out.println("Numele este: ");
		System.out.println(prenume);

		sc.close();
	}

}

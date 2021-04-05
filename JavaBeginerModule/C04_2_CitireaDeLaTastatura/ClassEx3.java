package C4_2_CitireaDeLaTastatura;

import java.util.Scanner;

public class ClassEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdu o valoare de tip intreg (si apasa Enter):");
		int aPrevValueRead = sc.nextInt();
		System.out.println("Introdu un sir de caractere fara spatiu (si apasa Enter):");
		String anotherPrevValueRead = sc.next();
		
		sc.nextLine();
		
		System.out.println("Introdu un sir de caractere cu sau fara spatiu (si apasa Enter):");
		String theStringWithSpacesToRead = sc.nextLine();
		
		//verificare
		
		System.out.println("Variabila \"aPrevValueRead\" are valoarea: " + aPrevValueRead);
		System.out.println("Variabila \"anotherPrevValueRead\" are valoarea: " + anotherPrevValueRead);
		System.out.println("Variabila \"theStringWithSpacesToRead\" are valoarea: " + theStringWithSpacesToRead);
		
		sc.close();

	}

}

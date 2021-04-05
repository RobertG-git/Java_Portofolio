package C4_2_CitireaDeLaTastatura;

import java.util.Scanner;

public class ClassEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdu prenumele tau (si apasa Enter:)");
		String prenume = sc.next();
		
		System.out.println("Introdu numele tau (si apasa Enter):");
		String nume = sc.next();
		
		System.out.println("Introdu varsta (si apasa Enter):");
		int varsta = sc.nextInt();
		
		System.out.println("Introdu inaltimea (si apasa Enter):");
		double inaltime = sc.nextDouble();
		
		System.out.println("Datele introduse despre " + prenume +" "+ nume
			+" sunt:\n\t- Varsta: "+varsta
			+"\n\t- Inaltime: " + inaltime);
		
		sc.close();

	}

}

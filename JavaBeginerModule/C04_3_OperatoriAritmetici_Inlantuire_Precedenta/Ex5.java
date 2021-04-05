package C4_3_OperatoriAritmetici_Inlantuire_Precedenta;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// Paralelipiped dreptunghic:

		double V;
		double Ab;
		double Al;
		double At;
		
		// Introducere de la tastatura datele: V, l, h.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please insert value of \"L\":");
		double L = sc.nextDouble();
		
		System.out.println("Please insert value of \"l\":");
		double l = sc.nextDouble();
		
		System.out.println("Please insert value of \"h\":");
		double h = sc.nextDouble();
		
		sc.close();
		
		// Volumul paralelipipedului, Aria bazei, Aria laterala, Aria totala
		
		V = L * l * h;
		System.out.println("Volumul paralelipipedului este: " + V);
		
		Ab = L * l;
		System.out.println("Aria bazei este: " + Ab);
		
		Al = 2 * (L * h + l * h);
		System.out.println("Aria laterala este: " + Al);
		
		At = Al + 2 * Ab;
		System.out.println("Aria totala este: " +At);
		
	}

}

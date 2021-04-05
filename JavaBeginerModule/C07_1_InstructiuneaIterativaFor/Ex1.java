package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/* 	1. Implementeaza un algoritm care citeste de la tastatura un numar natural n si un mesaj, care poate contine spatii. 
		 *  Programul va afisa mesajul de n ori, fiecare afisare pe cate o linie noua si insotita de numarul curent, ca in exemplul urmator:
		 */
	
		int n;
		String mesaj;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please insert your number: ");
		n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please insert your message: ");
		mesaj = sc.nextLine();
		
		for (int it = 0 ; it < n ; it++) {
			System.out.println((it+1) + ". " + mesaj);
		}
	
		sc.close();
	}

}

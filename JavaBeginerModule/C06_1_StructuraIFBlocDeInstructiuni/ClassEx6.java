package C6_1_StructuraIFBlocDeInstructiuni;

import java.util.Scanner;

public class ClassEx6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int bonDeOrdine = sc.nextInt();
		
		if (bonDeOrdine < 10) {
			System.out.println("Asteptati la ghiseul 1, va rugam.");
		} else if (bonDeOrdine < 20) {
			System.out.println("Asteptati la ghiseul 2, va rugam.");
		} else if (bonDeOrdine < 30) {
			System.out.println("Asteptati la ghiseul 3, va rugam.");
		} else if (bonDeOrdine < 40) {
			System.out.println("Asteptati la ghiseul 4, va rugam.");
		} else {
			System.out.println("Eroare: numar de bon invalid. Ati introdus: " + bonDeOrdine);
			System.out.println("Va rugam reintroduceti valoarea bonului.");
		}
		
		sc.close();
	}

}

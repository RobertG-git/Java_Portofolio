package C6_2_StructuriIterativeWhile;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		int aux = 0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		
		// 1. Sirul numerelor naturale pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
		
		System.out.print("1. ");
		while (aux <= n) {
			System.out.print(aux + " ");
			aux++;
		}
		
		System.out.println();
		
		// 2. Sirul numerelor impare pana la n (inclusiv), incepand cu 1, in ordine crescatoare.
		
		System.out.print("2. ");
		aux = 1;
		while (aux <= n) {
			System.out.print(aux + " ");
			aux += 2;
		}
		
		System.out.println();
		
		// 3. Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare.
		
		System.out.print("3. ");
		aux = 0;
		int x;
		while (aux <= n) {
			x = (n % 2 == 0) ? n : (n-1);
			System.out.print(x + " ");
			n -= 2;		
		}
		
		System.out.println();
		
		// 4. Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
		
		System.out.print("4. ");
		aux = 0;
		while ((aux <= m) && (aux % 5 == 0)) {
			System.out.print(aux + " ");
			aux += 5;
		}
		
		sc.close();
	}

}

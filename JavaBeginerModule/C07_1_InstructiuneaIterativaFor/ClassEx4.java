package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class ClassEx4 {

	public static void main(String[] args) {
		
		// afisarea tuturor numerelor pare sa se realizeze in ordine descrescatoare (i.e. de la n la 0).
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int it = n - n % 2 ; it >= 0 ; it -= 2) {
			System.out.println(it);
		}
		
		sc.close();
	}

}
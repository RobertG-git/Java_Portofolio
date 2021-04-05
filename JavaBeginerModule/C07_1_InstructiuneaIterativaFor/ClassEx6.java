package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class ClassEx6 {

	public static void main(String[] args) {
	
		// program care realizeaza suma tuturor numerelor naturale introduse pana la citirea unui numar negativ. Rezolvarea, folosind o structura for, este:

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		
		for (int n = sc.nextInt() ; n > 0 ; n = sc.nextInt() ) {
			sum += n;	
		}
		
		System.out.println("Suma este:" + sum);
		
		sc.close();
		
	
	}

}

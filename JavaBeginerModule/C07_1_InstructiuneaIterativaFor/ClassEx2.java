package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class ClassEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int aux = 2;
		
		while (aux < number) {
			if (number % aux == 0) {
				System.out.println(aux);
			}
			aux++;
		}
		
		sc.close();
	}

}

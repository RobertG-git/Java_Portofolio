package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class ClassEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int it = 0 ; it <= n ; it += 2) {
			System.out.println(it);
		}
		
		sc.close();
	}

}

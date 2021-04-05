package C7_1_InstructiuneaIterativaFor;

import java.util.Scanner;

public class ClassEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int it = 0;
		
		while (it <= n) {
			System.out.println(it);
			
			it += 2;
		}
		
		sc.close();
	}

}

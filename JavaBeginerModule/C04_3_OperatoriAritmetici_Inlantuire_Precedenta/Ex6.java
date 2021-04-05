package C4_3_OperatoriAritmetici_Inlantuire_Precedenta;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// Insert number of balls.
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please insert the number of \"v\" balls:" );
		int v = sc.nextInt();
		
		System.out.println("Please insert the number of \"r\" balls:" );
		int r = sc.nextInt();
		
		System.out.println("Please insert the number of \"n\" balls:" );
		int n = sc.nextInt();
		
		sc.close();
		// Calculate the probability to extract green one.
		
		double pv;
		pv = v*100/((double) v+r+n);
		System.out.println("Probability to extract gren ball is: " + pv + "%");
		
	}

}

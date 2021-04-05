package C6_1_StructuraIFBlocDeInstructiuni;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int insertedNumber;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please intert your number: ");
		insertedNumber = sc.nextInt();
		
		int parityCheck = insertedNumber % 2;
		
		if (parityCheck == 0 ) {
			System.out.println("The number " + insertedNumber + " is even." );
		} else {
			System.out.println("The number " + insertedNumber + " is odd");
		}
		
		sc.close();
	
	}

}

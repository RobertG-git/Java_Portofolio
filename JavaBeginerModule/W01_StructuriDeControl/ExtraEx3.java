package W01_StructuriDeControl;

import java.util.Scanner;

public class ExtraEx3 {

	public static void main(String[] args) {
		
		// Check if number is palindrom.

		int n;
		int copyN;
		int lastDigit;
		int newNumber = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert the number that need to be checked: ");

		n = sc.nextInt();
		copyN = n;

		while (n != 0) {
			lastDigit = n % 10;
			newNumber = 10* newNumber + lastDigit;
			n /= 10;
		}

		if (copyN == newNumber) {
			System.out.println("Number " + copyN +  " is palindrom!");
		} else {
			System.out.println("Number " + copyN +  " is not palindrom!");
		}


	}

}

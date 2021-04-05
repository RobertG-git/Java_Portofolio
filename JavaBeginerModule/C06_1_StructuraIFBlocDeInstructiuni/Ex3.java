package C6_1_StructuraIFBlocDeInstructiuni;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int pinClient;
		int pinCorrect = 1234;
		double sum;
		double soldClient = 30000.1;
		int newSoldRequested;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert the pin number: ");
		pinClient = sc.nextInt();
		
		if (pinClient == pinCorrect) {
			System.out.println("Pin correct");
			System.out.println("Please insert the sum you want to extract? ");
			sum = sc.nextDouble();
			if (sum <= soldClient) {
				System.out.println("Processing the transaction!");
				System.out.println("Do you want to know the new sold balance '0 for No' and '1 for Yes'?");
				newSoldRequested = sc.nextInt();
				if (newSoldRequested == 1) {
					System.out.println("New account balance is: " + (soldClient - sum));
					System.out.println("Thank you for using DevBank!");
				} else {
					System.out.println("Thank you for using DevBank!");
				}
			} else {
				System.out.println("Not enough founds available.");
			}
		} else {
			System.out.println("Wrong Pin");
		}
	
		sc.close();
	}

}

package C6_1_StructuraIFBlocDeInstructiuni;

import java.util.Scanner;

public class Ex4 {

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
			
			if ((sum <= soldClient) && (sum != 0)  && (sum%10 == 0)) {
				System.out.println("Processing the transaction!");
				System.out.println("Do you want to know the new sold balance '0 for No' and '1 for Yes'?");
				newSoldRequested = sc.nextInt();
				
				//requirement 3
				
				if (newSoldRequested == 1) {
					System.out.println("New account balance is: " + (soldClient - sum));
					System.out.println("Thank you for using DevBank!");
				} else if (newSoldRequested != 1) {
					System.out.println("Please instert '0 for No' and '1 for Yes'." );
				} else {
					System.out.println("Thank you for using DevBank!");
				}
				
				// requirement 2 & 3
				
			} else if (sum == 0) {
				System.out.println("Please insert a sum biger than 0.");
			} else if (sum%10 != 0) {
				System.out.println("Please insert a sum which is mutiple of 10.");
			} else {
				System.out.println("Not enough founds available.");
			}
			
			// requirement 1 & 4 (PIN which is less than 3 digits)
			
		} else if ( pinClient > 9999) {
			System.out.println("PIN number inserted is bigger that 4 digit. Please intert 4 digit PIN.");
		} else if (pinClient < 1000) {
			System.out.println("PIN number inserted may be wrong or less that 4 digit. Please insert 4 digit PIN.");
		} else {
			System.out.println("PIN inserted is wrong.");
		}
	
		sc.close();
	}

}
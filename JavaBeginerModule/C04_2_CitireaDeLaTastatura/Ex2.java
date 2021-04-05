package C4_2_CitireaDeLaTastatura;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		//Vehicle data input.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please submit vechicle manufacture year:");
		int manufactureYear = sc.nextInt();
		
		System.out.println("Please submit vechicle manufacture month (number):");
		String manufactureMonth = sc.next();
		
		System.out.println("Please submit vechile manufacture day: ");
		int manufactureDay = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Please submit vechile registration number: ");
		String registrationNumber = sc.nextLine();
		
		System.out.println("Please submit the current number of km: ");
		double currentKmNumber = sc.nextDouble();
		
		System.out.println("Please submit the number of km at vehicle purchase: ");
		double purchaseKmNumber = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Please submit the current driver name: ");
		String currentDriverName = sc.nextLine();
		
		System.out.println("Please submit if driver licence is suspended (true or false): ");
		boolean licenseStatus = sc.nextBoolean();
		
		// Vehicle data print.
		System.out.println("Vechicle input data:");
		System.out.println("\t - Year of manufacture is: " + manufactureYear);
		System.out.println("\t - Month of manufacture is: " + manufactureMonth);
		System.out.println("\t - Day of manufacture is: " + manufactureDay);
		System.out.println("\t - Registration number is: " + registrationNumber);
		System.out.println("\t - Vehicle current number of km is: " + currentKmNumber);
		System.out.println("\t - The number of the km at vechicle purchase is: " + purchaseKmNumber);
		System.out.println("\t - Current driver name is: " + currentDriverName);
		System.out.println("\t - Driver licence status is: " + licenseStatus);
		System.out.println();
		
		// Vehicle data calculated.
		System.out.println("Vechicle calculated data:");
		double numberKmTraveled = currentKmNumber - purchaseKmNumber;
		System.out.println("\t - Number of traveled kilomesters is: " + numberKmTraveled);
		
		int vehicleAproximateAge = 2020 - manufactureYear;
		System.out.println("\t - Aproximate age of vechile is: " + vehicleAproximateAge + "years" );
		System.out.println();
		
		System.out.println("Thank you for your data!");
		
		sc.close();
	}

}

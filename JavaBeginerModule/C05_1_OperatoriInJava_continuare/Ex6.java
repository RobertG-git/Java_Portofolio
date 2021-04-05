package C5_1_OperatoriInJava_continuare;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		int bornYear, bornMonth, bornDay, curentYear, currentMonth, currentDay;
		double ageInDays;
		int ageInYears;
		
		Scanner sc = new Scanner(System.in);
		
		// inserting the born data and current data
		
		System.out.println("Please insert the year of born 'YYYY': ");
		bornYear = sc.nextInt();
		System.out.println("Please insert the born Month 'MM': ");
		bornMonth = sc.nextInt();
		System.out.println("Please insert the born Day 'DD': ");
		bornDay = sc.nextInt();
		System.out.println("Please insert the current year 'YYYY': ");
		curentYear = sc.nextInt();
		System.out.println("Please insert the current month 'MM': ");
		currentMonth = sc.nextInt();
		System.out.println("Please insert the current day 'DD': ");
		currentDay = sc.nextInt();
		
		sc.close();
		
		System.out.println("Born data is (YYYY.MM.DD): " + bornYear +"."+ bornMonth + "." + bornDay);
		System.out.println("Current data is (YYYY.MM.DD): " + curentYear +"."+ currentMonth + "." + currentDay);
	
		ageInDays = ((curentYear * 365.25) + currentMonth *30 + currentDay) - ((bornYear * 365.25) + bornMonth *30 + bornDay);
		System.out.println("Lived days: " + ageInDays);
		
		ageInYears = curentYear - bornYear;
		System.out.println("Person age: " + ageInYears);
	}

}

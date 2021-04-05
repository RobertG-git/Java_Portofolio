package C5_1_OperatoriInJava_continuare;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		int hour, minute, second;
		int secondsElapsed;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please insert the 'hour' (hh): ");
		hour = sc.nextInt();
		System.out.println("Please insert the 'minute' (mm): ");
		minute = sc.nextInt();
		System.out.println("Please insert the 'second' (ss): ");
		second = sc.nextInt();
		
		sc.close();
		
		System.out.println("The time data inserted is (hh.mm.ss): " + hour +"."+ minute + "." + second);
		
		secondsElapsed = ((hour * 3600) + minute *60 + second);
		
		System.out.println("Numarul de secunde de la miezul noptii pana la ora " + hour + ":" + minute + ":" + second + " este de " + secondsElapsed + " secunde.");

	}

}

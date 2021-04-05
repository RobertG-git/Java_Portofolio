package C6_2_StructuriIterativeWhile;

import java.util.Scanner;

public class ClassEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Before the 'while' statement.");
		
		System.out.println("Enter 'YES' to print the message OR anithing else to quit.");
		String command = sc.nextLine();
		
		while (command.equals("YES")) {
			System.out.println("This message is printing now!");
			System.out.println("Enter 'YES' to print the message OR anything else to quit.");
			command = sc.nextLine();
		}
		
		System.out.println("Afther the 'while' statement!");
		sc.close();
	}

}

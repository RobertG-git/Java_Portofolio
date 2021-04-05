package C6_2_StructuriIterativeWhile;

public class ClassEx2 {

	public static void main(String[] args) {
		
		int printTimes = 5;
		int currentPrintNumber = 0;
		
		System.out.println("Before the 'while' statement");
		
		while (currentPrintNumber <printTimes) {
			System.out.println("This message is printing now!");
			currentPrintNumber++;
		}
		
		System.out.println("Afther the 'while' statement");

	}

}

package C6_2_StructuriIterativeWhile;

public class ClassEx5 {

	public static void main(String[] args) {
		
		int upperLimit = 20;
		int iterator = 0;
		
		// odd
		
		while (iterator <= upperLimit) {
			
			if (iterator % 2 == 1) {
				System.out.println( iterator + " ");
			}
			
			iterator++;
		
		}

		System.out.println();
		
		iterator = 0;
		
		// divisible by 5
		
		while (iterator <= upperLimit) {
			if (iterator % 5 == 0) {
				System.out.println(iterator + " ");
			}
			
			iterator++;
		}
		System.out.println();
	}

}

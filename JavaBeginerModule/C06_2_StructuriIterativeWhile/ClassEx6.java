package C6_2_StructuriIterativeWhile;

public class ClassEx6 {

	public static void main(String[] args) {
		
		int upperLimit = 20;
		int iterator = 0;
		 
		System.out.println("Before - The condition is: "
				           + iterator + " <= " + upperLimit);
		
		while (iterator <= upperLimit) {
			System.out.println("Inside - The condition is: "
					       + iterator + " <= " +upperLimit);
			iterator++;
		}
		
		System.out.println("After - The condition is: "
						   + iterator + " <= " + upperLimit);

	}

}

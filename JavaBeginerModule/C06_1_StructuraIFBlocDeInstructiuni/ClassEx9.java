package C6_1_StructuraIFBlocDeInstructiuni;


public class ClassEx9 {

	public static void main(String[] args) {
		
		int integerVariable = 23;
		
		System.out.println(integerVariable);
		//System.out.println("localIntegerVariable is: " + localIntegerVariable);

	
		if (true) {
			int localIntegerVariable = integerVariable * 2;
			
			System.out.println(integerVariable);
			System.out.println("localIntegerVariable is: " + localIntegerVariable);
				
		}
		
		//System.out.println("localIntegerVariable is: " + localIntegerVariable);
		System.out.println(integerVariable);
	}

}

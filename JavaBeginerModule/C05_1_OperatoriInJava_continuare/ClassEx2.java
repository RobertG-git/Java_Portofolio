package C5_1_OperatoriInJava_continuare;

public class ClassEx2 {

	public static void main(String[] args) {
		
		int returnedValue, results=5, update = 2;
		
		returnedValue = results += update;
		
		System.out.println("The returned value of the \"+=\" operator is: " + returnedValue);
		System.out.println("The value of 'results' variable " +
		"(to which the \"+=\" operator was applied) is: " + results);
		
	}

}

package C5_1_OperatoriInJava_continuare;

public class Ex3 {

	public static void main(String[] args) {
		
		int temperature = 23; // celsius
		
		temperature = temperature++ - ++temperature + 
		              +(-(--temperature)) - (--temperature + temperature++);

		             
		int sum = 23 - 25 - (24) - (23 + 23);
		
		System.out.println(sum);
		System.out.println(temperature);
	}

}

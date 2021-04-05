package C5_1_OperatoriInJava_continuare;

public class ClassEx7 {

	public static void main(String[] args) {
		
		// e.g.1
		double value1 = 10.25d;
		double value2 = 15.001d;
		
		double minValue = value1 < value2 ? value1 : value2;
		System.out.println("The min is: " + minValue);
		System.out.println("Este prima valoare mai mare? Raspuns: "+ (value1 > value2 ? "adevarat" : "fals"));
		System.out.println();
		
		//e.g.2
		boolean hasCar = true, hasLicence = false;
		
		System.out.println("Afiseaza adevarat/fals in limba romana, pentru orice expresie logica:");
		System.out.println("\tAre masina? Raspuns: " +(hasCar ? "adevarat" : "fals"));
		System.out.println("\tAre licenta? Raspuns: " +(hasLicence ?"adevarat" : "fals"));
	
		
	}

}

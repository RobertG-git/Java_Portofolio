package C5_1_OperatoriInJava_continuare;

public class ClassEx8 {

	public static void main(String[] args) {
		
		int value1 = 100, value2 = 15, value3 = -80, value4 = 50;
		
		// min dintre cele 4 valori
		
		int minAux1 = value1 < value2 ? value1 : value2;
		int minAux2 = value3 < value4 ? value3 : value4;

		int minValue = minAux1 < minAux2 ? minAux1 : minAux2;
		
		System.out.println("Valoarea minima este: " + minValue);
	}

}

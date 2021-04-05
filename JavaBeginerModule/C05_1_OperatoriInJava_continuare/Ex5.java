package C5_1_OperatoriInJava_continuare;

public class Ex5 {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 2;
		int c = 4;
		System.out.println("The numbers are: "+ a +", "+ b +", "+ c+".");
		
		boolean aux1 = a > b ;
		boolean aux2 = a > c ;
		boolean isAbigger = (aux1  && aux2 );
		System.out.println("1. Este a cel mai mare numar? Raspuns: " + isAbigger);
		
		
		aux1 = b < a ? true : false;
		aux2 = b < c ? true : false;
		boolean isBsmaller = (aux1  && aux2 );
		System.out.println("2. Este b cel mai mic numar? Raspuns: " + isBsmaller);
		
		boolean isAplusBiggerThanC = a + b < c ? true : false;
		System.out.println("3. Este suma numerelor a si b mai mica decat c? Raspuns: " + isAplusBiggerThanC);
			
		boolean isCbiggerThanMedieAritmAplusB = c > (a + b)/2  ? true : false;
		System.out.println("4. Este c mai mare decat media aritmetica dintre a si b? Raspuns: " + isCbiggerThanMedieAritmAplusB);
	
		boolean productABC = a * b * c > 100  ? true : false;
		System.out.println("5. Depaseste produsul numerelor valoarea 100? Raspuns: " + productABC);
	
		int sum = (a+c)%2;
		boolean isACdivisible = (sum == 0)  ? true : false;
		System.out.println("6. Este suma numerelor a si c divizibila cu 2? Raspuns: " + isACdivisible);
	
		int multiplu = a%b;
		boolean isAmultipluB = (multiplu == 0)  ? true : false;
		System.out.println("7. Este a multiplu al numarului b? Raspuns: " + isAmultipluB);
	
		int restAimpartitC = a%c;
		boolean isAbBiggerRestC = (b > restAimpartitC)  ? true : false;
		System.out.println("8. Este b mai mare decat restul impartirii lui a la c? Raspuns: " + isAbBiggerRestC);
		
		// 1 = false --> / by Zero
		int divededCalc = a!=c ? (b % (a-c)) : 1;
		boolean isBdividingAtAminusC = (divededCalc == 0)  ? true : false;
		System.out.println("9. Se imparte exact b la diferenta numerelor a si c? Raspuns: " + isBdividingAtAminusC);
	
		int equalCheck = (a == b && a == c) ? 1 : 0;
		boolean areNumbersEqual = (equalCheck == 1)  ? true : false;
		System.out.println("10. Sunt cele 3 numere egale? Raspuns: " + areNumbersEqual);
	
		int twoNumbersEqualCheck = (a == b || a == c || b == c) ? 1 : 0;
		boolean areTwoNumbersEqual = (twoNumbersEqualCheck == 1)  ? true : false;
		System.out.println("11. Sunt cel putin doua dintre numere egale (oricare doua)? Raspuns: " + areTwoNumbersEqual);
	
	}

}

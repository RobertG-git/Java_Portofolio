package C5_1_OperatoriInJava_continuare;

public class Ex2 {

	public static void main(String[] args) {
		int pre = 5;
		int post = 5;
		
		System.out.println("Aceasta este valoarea preincrementare: " + ++pre);
		System.out.println("Aceasta este valoarea postincrementare: " + post++);
		System.out.println("Aceasta este valoarea dupa 'utilizare': " + pre);
		System.out.println("Aceasta este valoarea dupa 'utilizare': " + post);
		
		System.out.println();
		
		pre = 5;
		post = 5;
		System.out.println("Aceasta este valoarea predecrementare: " + --pre);
		System.out.println("Aceasta este valoarea postdecrementare: " + post--);
		System.out.println("Aceasta este valoarea dupa 'utilizare': " + pre);
		System.out.println("Aceasta este valoarea dupa 'utilizare': " + post);
	}

}

package C3_1_VariabileLiteraliIdentificatori;

public class Ex6 {

	public static void main(String[] args) {
		int mere = 23;
		int portocale = 45;
		int gutui = 7; 
		int TotalFructe;
		int TotalFructeDupaMasa;
		
		//Total fructe inainte de masa
		TotalFructe = mere + portocale + gutui;
		System.out.println("Andrei are initial un total de fructe de:");
		System.out.println(TotalFructe);
		
		//Total mere + portocale dupa masa
		TotalFructe = (mere - 5) + (portocale -2);
		System.out.println("Dupa masa, Andrei are un total de mere + portocale de:");
		System.out.println(TotalFructe);
		System.out.println();
		
		//Total fructe dupa masa
		TotalFructe = mere + portocale + gutui;
		TotalFructeDupaMasa = TotalFructe - 5 - 3 - 2;
		System.out.println("Dupa masa, Andrei are un total de mere + portocale de:");
		System.out.println(TotalFructeDupaMasa);
		
	}

}

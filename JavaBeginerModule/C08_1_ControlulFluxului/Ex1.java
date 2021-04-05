package C8_1_ControlulFluxului;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//  Se citeste de la tastatura un numar natural, x. 
		//  Sa se afiseze in ordine inversa cifrele numarului, alaturi de un mesaj semnificativ:
		
		int n;
		int m;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert the 'n' number");
		n = sc.nextInt();
		
		System.out.print("Cifrele numarului sunt: ");
		
		while ( n != 0) {
			m = n % 10;
			System.out.print( m + ", ");
			n /= 10;
		}
	
		sc.close();
	}

}

package C4_3_OperatoriAritmetici_Inlantuire_Precedenta;

public class Ex3 {

	public static void main(String[] args) {
		
		/* 	Generator de paranteze:
		 *
		 *	1. 
		 *  -   Trebuie definita prioritatea: Numar mare → precedenta mare
		 *  
		 *  		+		11
		 *  		-		11
		 *			*		12
		 *			/		12
		 *			%		12
		 *			( )		15
		 *  
		 *  
		 *  -    Extragem toti operatorii din sir: + * - /
		 *  
		 *  - a. Daca primul operator are prioritate mai mica decat al 2 lea adaugam ()
		 *  - 	 Se realizeaza operatia matematica
		 *  
		 *  - b. Daca primul operator are prioritate mai mica decat al 2 lea adaugam ()
		 *  -	 Se realizeaza operatia matematica
		 *  
		 *  - c. Daca primul operator are prioritate mai mica decat al 2 lea adaugam ()
		 *  -    Se realizeaza operatia matematica
		 *  
		 *   ... 
		 *   
		 * 	- d. Cat timp avem ce compara.
		 *	
		 *
		 * 2.
		 * 
		 * 		double leftToRightOrderComputation = (100d + 5d) * 10d - 2.23d * 18d / 4d + 2d;
		 * 		operatori extrasi: + * - * / +
		 *		+ * --> ()
		 *		* - --> no ()
		 *		- * --> ()
		 *		* / --> no ()
		 * 		/ + --> no ()
		 *
		 * 3. 
		 * 
		 *	e.g a+b*c-d/2
		 *	
		 *		a.  (a+b)*c-d/2
		 *			def a+b =e --> e*c-d/2
		 *	
		 *		b.  e*c-d/2
		 *			Def e*c= f --> f-d/2
		 *	
		 *		c. (f-d)/2
		 *			Def f-d =g --> g/2
		 *
		 *
		 *	4. Argumentare in exemplele de mai sus.
		 *
		 */
				
				
		
		
	}

}

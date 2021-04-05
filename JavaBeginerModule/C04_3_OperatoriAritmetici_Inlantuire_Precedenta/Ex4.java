package C4_3_OperatoriAritmetici_Inlantuire_Precedenta;

public class Ex4 {

	public static void main(String[] args) {
		
		int mathEquation, operand1, operand2, operand3;
		 
		// Este valid? - NU
		// De ce? Raspunsul tau: operand 3 nu a fost initializat.
		//operand1 = operand2 = operand3;
		 
		// Este valid? - NU
		// De ce? Raspunsul tau: mathEquation nu a fost initializat.
		//System.out.println(mathEquation);
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: mathEquation a fost initializat.
		System.out.println(mathEquation = 4);
		 
		// Este valid? - NU
		// De ce? Raspunsul tau: operand1 & operand2 nu au fost initializate.
		//mathEquation = operand1 + operand2;
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: Toate variabilele sunt initializate correct.
		operand1 = 2; operand2 = 5; operand3 = 14;
		 
		// Este valid? - NU
		// De ce? Raspunsul tau: Nu se poate returna o valoare unui calcul matematic. Se poate asocia unei variabile.
		//mathEquation = operand1 + operand2 = operand3;
		 
		// Este valid? - NU
		// De ce? Raspunsul tau: Nu exista o variabila careia sa ii fie asociat calculul.
		//operand2 + operand3 + operand1;
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: Nr. de paranteze inchise si deschise este egal.
		mathEquation = ((((operand1))) + (operand2) + (operand3));
		 
		// Este valid? - NU
		// De ce? Raspunsul tau: Partea din stanga nu este o variabila.
		//mathEquation / 2 = operand1 + operand2;
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: Nr. de paranteze inchise si deschise este egal.
		mathEquation = ((operand1)) + (operand2) + (operand3);
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: Nr. de paranteze inchise si deschise este egal.
		System.out.println(((mathEquation = (operand1 + operand2)/2)));
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: Nr. de paranteze inchise si deschise este egal.
		System.out.println(mathEquation = ((mathEquation)));
	}

}

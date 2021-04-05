package C6_1_StructuraIFBlocDeInstructiuni;

public class ClassEx8 {

	public static void main(String[] args) {
	
		  int minQuizScore = 4;
		  int maxQuizScore = 6;
		  int quizScore = 3;
		  
		  if (quizScore >= minQuizScore) {
			  System.out.println("Ai primit punctajul, felicitari!");
			  if(quizScore ==  maxQuizScore) {
				  System.out.println("Ai primit chiar punctaj maxim! Bravo!");
			  }
		  } else {
			  System.out.println("Din pacate, nu ai rezolvat correct suficiente exercitii.");
			  if (quizScore < 2) {
				  System.out.println("Nu renunta, dar invata din greseli!");
			  }
		  }

	}

}

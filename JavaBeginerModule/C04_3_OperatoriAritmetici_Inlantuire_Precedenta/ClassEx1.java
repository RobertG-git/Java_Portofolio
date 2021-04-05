package C4_3_OperatoriAritmetici_Inlantuire_Precedenta;

public class ClassEx1 {

	public static void main(String[] args) {
		
		int theUltimateAnswer = 42;
		int firstCopyOfTheAnswer, secondCopyOfTheAnswer, thirtCopyOfTheAnswer;

		thirtCopyOfTheAnswer = secondCopyOfTheAnswer = firstCopyOfTheAnswer = theUltimateAnswer;
	
		System.out.println("The theUltimateAnswer is:" +  theUltimateAnswer);
		System.out.println("The firstCopyOfTheAnswerr is:" +  firstCopyOfTheAnswer);
		System.out.println("The secondCopyOfTheAnswerr is:" +  secondCopyOfTheAnswer);
		System.out.println("The thirtCopyOfTheAnswer is:" +  thirtCopyOfTheAnswer);
	
	}

}

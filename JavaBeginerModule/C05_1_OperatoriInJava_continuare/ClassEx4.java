package C5_1_OperatoriInJava_continuare;

public class ClassEx4 {

	public static void main(String[] args) {
		 int var = 5, sameVar = var;
		 
		 System.out.println("The returned values of the incrementing operators are:"
				 + "\n\t - initial value: " + var
				 + "\n\t - ++ value return: " + (++var)
				 + "\n\t - value++ return: " + (sameVar++));

		 var = sameVar = 5;
		 int equation = ++var + var++ + var + sameVar++ + ++sameVar;
		 
		 System.out.println("Equation result is indeed(31): " + equation);
		 
		 int thisIsVeryUgly = +(+(-(-(-1))));
		 System.out.println(thisIsVeryUgly);
	}

}

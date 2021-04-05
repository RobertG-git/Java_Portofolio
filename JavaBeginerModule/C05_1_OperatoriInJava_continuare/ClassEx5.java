package C5_1_OperatoriInJava_continuare;

public class ClassEx5 {

	public static void main(String[] args) {
		
		int operand1 = 10, operand2 = operand1, operand3 = 20;
		
		// ==
		
		boolean isEqual12 = (operand1 == operand2);
		boolean isEqual13 = (operand1 == operand3);
		
		System.out.println(operand1 + " == " + operand2 + "-->" +isEqual12);
		System.out.println(operand1 + " == " + operand3 + "-->" +isEqual13);
		System.out.println();
		
		// !=
		
		boolean isNotEqual12 = (operand1 != operand2);
		boolean isNotEqual13 = (operand1 != operand3);
		
		System.out.println(operand1 + " != " + operand2 + "-->" +isNotEqual12);
		System.out.println(operand1 + " != " + operand3 + "-->" +isNotEqual13);
		System.out.println();
		
		// <
		
		boolean isLessEqual12 = (operand1 < operand2);
		boolean isLessEqual13 = (operand1 < operand3);
		
		System.out.println(operand1 + " < " + operand2 + "-->" +isLessEqual12);
		System.out.println(operand1 + " < " + operand3 + "-->" +isLessEqual13);
		System.out.println();
		
		//<=
		
		boolean isLessOrEqualEqual12 = (operand1 <= operand2);
		boolean isLessOrEqualEqual13 = (operand1 <= operand3);
		
		System.out.println(operand1 + " <= " + operand2 + "-->" +isLessOrEqualEqual12);
		System.out.println(operand1 + " <= " + operand3 + "-->" +isLessOrEqualEqual13);
		System.out.println();
		
		//>
		
		boolean isGreaterEqual12 = (operand1 > operand2);
		boolean isGreaterEqual13 = (operand1 > operand3);
		
		System.out.println(operand1 + " > " + operand2 + "-->" +isGreaterEqual12);
		System.out.println(operand1 + " > " + operand3 + "-->" +isGreaterEqual13);
		System.out.println();
	}

}

package C5_1_OperatoriInJava_continuare;

public class Ex1 {

	public static void main(String[] args) {
		
		int operand1 = 24, operand2 = 35, operand3 = 15, operand4 = 55;
		int result;
		
		result = operand1 + operand2;
		result /= operand4;
		result += operand3;
		result *= (operand1 * 2);
		result = operand3 - result;
		result += (-3) * 3 *operand4;
		
		System.out.println(result);

	}

}

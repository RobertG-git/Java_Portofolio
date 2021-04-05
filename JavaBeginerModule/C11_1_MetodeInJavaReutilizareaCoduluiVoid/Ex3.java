package C11_1_MetodeInJavaReutilizareaCoduluiVoid;

public class Ex3 {

    public static void main(String[] args) {
        /*
        3. Se da o metoda simpla, care realizeaza si apoi returneaza produsul a doua numere:
        ...
         */
        double testNumber = multiply4(1, 1, -22222, 1);
        System.out.println("Product of numbers is : " + testNumber);
    }

    public static double multiply2(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double multiply3(double operand1, double operand2, double operand3) {
        double multiply2 = multiply2(operand1, operand2);
        double multiply3 = multiply2(multiply2,operand3);
        return multiply3;
    }

    public static double multiply4(double operand1, double operand2, double operand3, double operand4){
        double multiply2 = multiply2(operand1, operand2);
        double multiply3 = multiply2(multiply2,operand3);
        double multiply4 = multiply2(multiply3,operand4);
        return multiply4;
    }
}

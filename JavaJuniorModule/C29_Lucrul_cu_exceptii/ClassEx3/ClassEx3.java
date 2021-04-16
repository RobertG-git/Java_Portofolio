package src.C29_Lucrul_cu_exceptii.ClassEx3;

public class ClassEx3 {

    public static void main(String[] args) {
        System.out.println(division(10,0));
    }
    private static int division(int divident, int divisor) throws ArithmeticException{
        if (divisor == 0) {
            throw new ArithmeticException("'divisor' cannot be 0!");
        }

        return divident/divisor;
    }
}

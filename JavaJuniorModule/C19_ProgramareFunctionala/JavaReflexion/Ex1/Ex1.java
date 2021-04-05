package src.C19_ProgramareFunctionala.JavaReflexion.Ex1;

public class Ex1 {
    /*
    1. Pornind de la interfata functionala IOperator prezentata mai jos, creati operatiile de adunare, scadere,
    inmultire, impartire si module, intre cei doi parametri a si b.
     */
    public interface IOperator {
        int operation(int a, int b);
    }

    public static void main(String[] args) {

        IOperator sum = Integer::sum;
        IOperator dif = (a, b) -> a - b;
        IOperator multiplication = (a, b) -> a * b;
        IOperator divide = (a, b) -> a / b;
        IOperator modulo = (a, b) -> a % b;

        System.out.println(sum.operation(10,2));
        System.out.println(dif.operation(10,2));
        System.out.println(multiplication.operation(10,2));
        System.out.println(divide.operation(10,2));
        System.out.println(modulo.operation(10,2));

    }
}

package src.C19_ProgramareFunctionala.JavaReflexion.Ex2;

public class Ex2 {
    /*
    2. Pe baza interfete functionale IVerifyProperty, creati:

        O expresie lambda care verifica daca un numar e par
        O expresie lambda care verifica daca un numar e negativ
        O expresie lambda care verifica daca un numar e 0
     */

    interface IVerifyProperty {
        boolean hasProperty(int a);
    }


    public static void main(String[] args) {

        IVerifyProperty isEven = a -> a % 2 == 0;
        System.out.println("Is '10' even? R: " + isEven.hasProperty(10));
        System.out.println("Is '11' even? R: " +isEven.hasProperty(11));

        IVerifyProperty isNegative = a -> a < 0;
        System.out.println("Is '-1' negativ? R: " + isNegative.hasProperty(-1));
        System.out.println("Is '11' negativ? R: " + isNegative.hasProperty(11));

        IVerifyProperty isZero = a -> a == 0;
        System.out.println("Is number '0' zero: " + isZero.hasProperty(0));
        System.out.println("Is number '11' zero: " + isZero.hasProperty(11));
    }
}

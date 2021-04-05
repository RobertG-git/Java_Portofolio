package C11_1_MetodeInJavaReutilizareaCoduluiVoid;

public class ClassEx1 {

    public static void main(String[] args) {

        mathFunction(2.0, 1.0);
        mathFunction(1.5, 2.1);

    }

    public static void mathFunction (double x , double y) {
        double functionResult = 2 * x + y;
        System.out.println("The math function result for the following parameters:"
                + "\n\tx = " + x + ", y = " + y + ", is: " + functionResult);
    }
}

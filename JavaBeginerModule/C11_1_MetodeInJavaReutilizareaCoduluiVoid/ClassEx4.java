package C11_1_MetodeInJavaReutilizareaCoduluiVoid;

public class ClassEx4 {

    public static void main(String[] args) {
        double functionResult = mathFunction(2.0, 1.0);
        System.out.println(functionResult);
        functionResult = mathFunction(functionResult, 2.1);
        System.out.println(functionResult);
    }

    public static double mathFunction (double x, double y) {
        return 2 * x + y;
    }
}
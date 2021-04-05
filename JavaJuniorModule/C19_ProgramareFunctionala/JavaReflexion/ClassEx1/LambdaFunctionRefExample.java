package src.C19_ProgramareFunctionala.JavaReflexion.ClassEx1;

public class LambdaFunctionRefExample {

    interface IMethodCall {
        void myMethodCall(int x);

        default int defaultFunction() {
            return -1;
        }
    }

    public static void functionToReference(int x) {
        System.out.println(2 * x);
    }

    public static void main(String[] args) {

        // first example
        IMethodCall printlnPointer1 = x -> functionToReference(x);

        // secondExample
        IMethodCall printlnPointer2 = LambdaFunctionRefExample::functionToReference;

        // acest apel prints 10;
        printlnPointer1.myMethodCall(5);
        printlnPointer2.myMethodCall(5);

    }
}

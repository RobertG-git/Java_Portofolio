package src.C29_Lucrul_cu_exceptii.ClassEx4;

public class TestOperationCorrectness {
    private static Exception createException() {
        return new ArithmeticException("The operation is not correct");
    }

    private static Exception testOperation(boolean isCorrect) {
        if (!isCorrect) {
            return createException();
        }
        return null;
    }

    public static void main(String[] args) {
        Exception exception = testOperation(false);
        exception.printStackTrace();
    }
}

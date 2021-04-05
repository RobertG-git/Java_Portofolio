package src.C19_ProgramareFunctionala.JavaReflexion.ClassEx2;

public class AnonymousExample {
    public static void functionalReference(int i) {
        System.out.println(2 * i);
    }

    public static void main(String[] args) {
        IAlsoFunctional anonymousInstance = new IAlsoFunctional() {
            // membru care poate stoca o stare
            int count = 0;
            @Override
            public int processingValue(int x) {
                System.out.println("Acesta este apelul cu numarul: "
                        + count++ + "\n " + 2*x);
                return 0;
            }
        };

        anonymousInstance.processingValue(5);
    }
}

package src.C19_ProgramareFunctionala.JavaReflexion.ClassEx1;

import java.util.Arrays;

public class PlayWithLambda {
    public static void main(String[] args) {
        // crearea expresiei lambda, ce implementeaza interfata
        // functionala IFunctional
        IFunctional functionalObject = x -> x * 2;

        // apelul expresiei lambda
        // (i.e. ce reprezinta implementarea interfetei)
        System.out.println(functionalObject.processingValue(5));

        String[] arrayString = {"ana", "are", "mere"};

        Object[] arrayLength = Arrays.stream(arrayString)
                .filter(name -> name.length() == 3)
                .toArray();

        System.out.println(Arrays.toString(arrayLength));

        // CONTRAEXEMPLU de utilizare

        IFunctional isEven = x -> {
            if (x % 2 == 0) {
                return 0;
            } else {
                return -1;
            }
        };

        System.out.println(isEven.processingValue(10));
    }
}

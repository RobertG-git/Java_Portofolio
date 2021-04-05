package src.P3_AplicatiiCuStiveSiCozi.ExpressionEvaluator;

import java.util.*;

public class ExpressionEvaluation {
    /*
    Deoarece am trecut expresia in forma postfixata, algoritmul de evaluare in acest caz este mult simplificat.
    Acesta va fi detaliat in continuare, alaturi de un exemplu concret de evaluare a unei expresii.

    Algoritmul foloseste o stiva pentru efectuarea operatiilor in ordinea corecta.
    Pasii efectivi (Postfix evaluation algorithm - Detailed steps), descrisi in detaliu, sunt:

    1 cat timp exista o entitate de citit:
        1.1 citeste entitatea (i.e. operand sau operator)
        1.2. daca entitatea este un operand (i.e. un numar), atunci:
            1.2.1 adauga entitatea in stiva
        1.3 daca entitatea este un operator (fie el O), atunci:
            1.3.1 extrage un operand din stiva (fie el op1)
            1.3.2 extrage un operand din stiva (fie el op2)
            1.3.3 daca nu exista cei 2 operanzi (i.e. op1 si op2), atunci:
                1.3.3.1 returneaza eroare (i.e. expresia postfixata este gresita)
            1.3.4 rezultat = op2 O op1
            1.3.5 adauga rezultat in stiva

    2 rezultat = extrage un operator din stiva

    3 daca stiva nu este goala, atunci:
      3.1. returneaza eroare (i.e. expresia postfixata este gresita)

    4 afiseaza / returneaza rezultat
     */

    public static void main(String[] args) {
        postFixEval();
    }

    public static void postFixEval() {

        Deque<Integer> stackOfOperands = new LinkedList<>();

        try (Scanner sc = new Scanner(System.in)) {
            String o;

            // 1.1
            while (!(o = sc.nextLine()).isEmpty()) {
                // 1.2
                if (Character.isDigit(o.charAt(0))) {
                    stackOfOperands.push(Integer.valueOf(o));
                } else {
                    // 1.3
                    int op1;
                    int op2;
                    if (stackOfOperands.size() >= 2) {
                        op1 = stackOfOperands.pop();
                        op2 = stackOfOperands.pop();
                    } else {
                        System.out.println("postfix expression is wrong");
                        return;
                    }

                    switch (o) {
                        case "+" -> stackOfOperands.push(op2 + op1);
                        case "-" -> stackOfOperands.push(op2 - op1);
                        case "*" -> stackOfOperands.push(op2 * op1);
                        case "/" -> stackOfOperands.push(op2 / op1);
                        case "^" -> stackOfOperands.push((int) Math.pow(op2, op1));
                        default -> {
                            System.out.println("unknown operator");
                            return;
                        }
                    }
                }
            }
        }

        System.out.println();

        int result = stackOfOperands.pop();
        System.out.println(result);

        if (!stackOfOperands.isEmpty()) {
            System.out.println("postfix expression is wrong");
        }
    }
}

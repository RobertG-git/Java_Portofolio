package src.P3_AplicatiiCuStiveSiCozi.ExpressionEvaluator;

import java.util.*;

public class ExpressionConversion {
    /*
    In exercitiul urmator vom implementa un evaluator de expresii matematice, care poate efectua orice calcule,
    oricat de complexe, tinand cont de ordinea corecta de evaluare a operatiilor.

        Tip de operatori
        Tipul de operatori acceptati in calcule, precum si semnificatia lor este prezentata in urmatorul tabel:

        Operator	Descriere	Asociativitate	Precedenta
        (in Java)
            +	Adunare	stanga-dreapta	11
            -	Scadere	stanga-dreapta	11
            *	Inmultire	stanga-dreapta	12
            /	Impartire	stanga-dreapta	12
            ^	Ridicare la putere	dreapta-stanga	13*

        Algoritmul de evaluare va contine 2 etape:
            Conversia expresiei in forma postfixata.
            Evaluarea expresiei, in forma postfixata.
     */

    public static void main(String[] args) {
        postFixedForm();
    }

    public static void postFixedForm() {
        Queue<String> postFixedForm = new ArrayDeque<>(); // FIFO
        Deque<String> operatorStack = new LinkedList<>(); // stiva operatori LIFO

        try (Scanner sc = new Scanner(System.in)) {
            String o1;

            // 1.1
            while (!(o1 = sc.nextLine()).isEmpty()) {

                // 1.2
                if (Character.isDigit(o1.charAt(0))) {
                    postFixedForm.offer(o1);
                }
                // 1.3
                if (o1.equals("+") || o1.equals("-") || o1.equals("*") || o1.equals("/") || o1.equals("^")) {
                    while ((!operatorStack.isEmpty())
                            && (!operatorStack.peek().equals("("))
                            && ((precedence(o1) < precedence(operatorStack.peek()))
                            || (precedence(o1) == precedence(operatorStack.peek()))
                            && (associativity(operatorStack.peek()).equals("left")))) {

                        postFixedForm.offer(operatorStack.pop());
                    }
                    operatorStack.push(o1);
                }
                // 1.4
                if (o1.equals("(")) {
                    operatorStack.push(o1);
                }
                // 1.5
                if (o1.equals(")")) {

                    while (!operatorStack.isEmpty() && !operatorStack.peek().equals("(")) {
                        postFixedForm.offer(operatorStack.pop());
                    }
                    if (operatorStack.isEmpty() || !operatorStack.peek().equals("(")) {
                        System.out.println("the expression had the wrong parentheses");
                        return;
                    }
                    operatorStack.pop();
                }
            }
        }

        // 2.
        while (!operatorStack.isEmpty()) {
            if (!operatorStack.peek().equals("(")) {
                postFixedForm.offer(operatorStack.pop());
            } else {
                System.out.println("the expression had the wrong parentheses");
                return;
            }

        }
        System.out.println(postFixedForm.toString());
        System.out.println(operatorStack.toString());
    }

    public static int precedence(String operator) {
        return switch (operator) {
            case "+", "-" -> 11;
            case "*", "/" -> 12;
            case "^" -> 13;

            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    public static String associativity(String operator) {
        return switch (operator) {
            case "+", "-", "/", "*" -> "left";
            case "^" -> "right";

            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}

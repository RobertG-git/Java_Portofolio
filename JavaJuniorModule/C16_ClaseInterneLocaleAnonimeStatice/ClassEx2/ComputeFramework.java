package src.C16_ClaseInterneLocaleAnonimeStatice.ClassEx2;

import java.util.Scanner;

public class ComputeFramework {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ComputationDB cDB = new ComputationDB();

        cDB.addOperation(cDB.generateOperation('+', 10, 5));

        ComputationDB.IBinaryOperation diffOp = cDB.generateOperation('-',10,5);
        cDB.addOperation(diffOp);

        System.out.println("Want to add a multiplication op? Y/N");
        if(sc.next().equalsIgnoreCase("Y")) {

            // Note: a different implementation of a binary operation
            class multiOp implements ComputationDB.IBinaryOperation {
                private final String result;

                public multiOp(int op1, int op2) {
                    this.result = "MUL(" + op1 + ", " + op2 + ") = " + (op1 * op2);
                }

                @Override
                public void execute() {
                    System.out.println(result);
                }
            }

            cDB.addOperation(new multiOp(5, 10));

        }

        System.out.println("Want to add a division op? Y/N");
        if(sc.next().equalsIgnoreCase("Y")) {
            System.out.println("Give the operands separated by whitespace:");
            int operand1 = sc.nextInt();
            int operand2 = sc.nextInt();
            cDB.addOperation(new ComputationDB.IBinaryOperation() {
                @Override
                public void execute() {
                    System.out.println("DIV(" + operand1 + ", " + operand2 + ") = " +
                            (operand1 / operand2));
                }
            });
        }

        cDB.executeAll();

    }

}

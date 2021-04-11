package src.C28_Exceptii_ModuriDeProgramare;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ClassEx3 {

    private static final Scanner scanner = new Scanner(System.in);

    private static int getIntegerOperand() {
        while (true) {
            try{
                System.out.println("Introdu o valoare intreaga: ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Nu ai introdus o valoare intreaga. Te rog sa reincerci.");
            } catch (NoSuchElementException e) {
                System.out.println("Input was closed and cannot be reopened! Abort...");
                return 0;
            }
        }
    }

    public static int division(int dividend, int divisor) {
        try{
            return dividend/divisor;
        } catch (ArithmeticException e) {
            System.out.println("Divizorul este 0");
            return 0;
        }

    }

    public static void main(String[] args) {
        int divident = getIntegerOperand();
        int divisor = getIntegerOperand();
        int result = division(divident, divisor);
        System.out.println("Rezultatul este: " + result);
    }




}

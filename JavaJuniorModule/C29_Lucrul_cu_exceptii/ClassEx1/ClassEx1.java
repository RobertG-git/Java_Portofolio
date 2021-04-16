package src.C29_Lucrul_cu_exceptii.ClassEx1;

import java.util.InputMismatchException;

public class ClassEx1 {
    public static void main(String[] args) {
        NullPointerException np = new NullPointerException();
        NullPointerException np2 = new NullPointerException("Here is my null exception");

        InputMismatchException im = new InputMismatchException();
        InputMismatchException im2 = new InputMismatchException("Here is my new imput exception");

    }
}

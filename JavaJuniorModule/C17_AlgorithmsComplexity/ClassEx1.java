package src.C17_AlgorithmsComplexity;

import java.util.Scanner;

public class ClassEx1 {
    public static class InnerClassPlayground {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("Enter if-block? Y/N");
            if (sc.next().equalsIgnoreCase("Y")) {
                class Name {
                    String firstName;
                    String lastName;

                    public Name(String firstName, String lastName) {
                        super();
                        this.firstName = firstName;
                        this.lastName = lastName;
                    }

                    @Override
                    public String toString() {
                        return this.firstName + " " + this.lastName;
                    }
                }
                System.out.println("Enter inner if-block? Y/N");
                if (sc.next().equalsIgnoreCase("Y")) {
                    System.out.println(new Name("James", "Bond")); // Here
                }
            }
        }
    }
}

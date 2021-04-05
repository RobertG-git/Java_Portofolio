package C9_1_Break_Continue;

public class ClassEx2 {

    public static void main(String[] args) {

        int it = 10;

        while (true) {
            if (it > 15) {
                if (it % 2 == 1) {
                    System.out.println("Next, 'break' will be executed. ");
                    break;
                }
            }

            System.out.println("The current value of 'it' is: " + it);
            it++;

        }

        System.out.println("Reached the end of the loop.");

    }
}



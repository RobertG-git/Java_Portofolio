package C9_1_Break_Continue;

public class ClassEx3 {

    public static void main(String[] args) {

        int n = 100;

        while ( n >= 0) {
            if ( n % 5 != 0) {
                n--;
                continue;
            }

            System.out.print(n + " ");
            n--;
        }

        System.out.println();
    }


}

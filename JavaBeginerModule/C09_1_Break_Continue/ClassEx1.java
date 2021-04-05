package C9_1_Break_Continue;

public class ClassEx1 {

    public static void main(String[] args) {

        int left = 10;
        int right = 30;

        int counter = 0;

        for ( int i = left ; i <= right ; i++ ) {
            System.out.println(i + " ");
            counter++;

            if (counter == 5) {
                break;
            }
        }

        System.out.println();
        System.out.println("Au fost afisate " + counter + " numere naturale.");


    }
}

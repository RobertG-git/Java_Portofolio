package C20_String_SiruriDeCaractere;

public class ClassEx2 {

    /*
    Obtinerea unui caracter: charAt() method.
     */

    public static void main(String[] args) {

        String errorType = "j a v a . l a n g . N u l l P o i n t e r E x c e p t i o n";

        for (int i = 0; i < errorType.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(errorType.charAt(i));
            }
        }
        System.out.println();
    }
}

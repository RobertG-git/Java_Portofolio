package C20_String_SiruriDeCaractere;

public class ClassEx1 {

    /*
    Crearea unui 'String' dintr-un char.
     */
    public static void main(String[] args) {
        char[] theArray = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
        String stringFromArray = new String(theArray);

        System.out.println(theArray);

    }
}

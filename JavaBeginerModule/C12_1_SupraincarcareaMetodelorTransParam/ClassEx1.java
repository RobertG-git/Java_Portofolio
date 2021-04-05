package C12_1_SupraincarcareaMetodelorTransParam;

public class ClassEx1 {

    public static void main(String[] args) {
        printWithType(23);
        printWithType("Nothing worth havind "+  "comes easy");
        printWithType(23*1.0);
        printWithType(4/4 == 1 *2 );
        printWithType('\u00AE');
    }

    public static void printWithType(String var) {
        System.out.println("String: " + var);
    }
    public static void printWithType(int var) {
        System.out.println("int: " + var);
    }
    public static void printWithType(double var) {
        System.out.println("double: " + var);
    }
    public static void printWithType(char var) {
        System.out.println("char: " + var);
    }
    public static void printWithType(boolean var) {
        System.out.println("boolean: " + var);
    }

}

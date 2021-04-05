package C11_1_MetodeInJavaReutilizareaCoduluiVoid;

public class ClassEx2 {

    public static void main(String[] args) {

        timesTwo(4);
        int initialValue = 1;
        timesTwo(initialValue);

    }

    public static void timesTwo(int initialValue){
        System.out.println("The initial value is: " + initialValue);
        initialValue *= 2;
        System.out.println("The new initial value is: " + initialValue);
    }

}

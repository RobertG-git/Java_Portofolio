package C11_1_MetodeInJavaReutilizareaCoduluiVoid;

public class ClassEx3 {

    public static void main(String[] args) {
        sayWelcome();
        int positionNumber = 1;
        printRanking("Bill" + " " + "Gates" , positionNumber, 1500*3);

    }

    public static void sayWelcome() {
        System.out.println("Welcome to Java Language!");
    }

    public static void printRanking (String name, int position , double score) {
        System.out.println(position + ". " + name + ": " + score);
    }
}

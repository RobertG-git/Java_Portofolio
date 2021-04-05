package C18_ArraysInJava;

public class ClassEx1 {

    // Accesarea elementelor

    public static void main(String[] args) {

        int[] smallArray = new int[3];
        smallArray[0] = 25;
        smallArray[1] = 10;
        smallArray[2] = 100;

        System.out.println("Values are: " + smallArray[0] + ", " + smallArray[1] + ", " + smallArray[2]);

        System.out.println("Length of smallArray: " + smallArray.length);
    }

}
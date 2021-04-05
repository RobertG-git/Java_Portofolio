package C18_ArraysInJava;

public class ClassEx9 {

    // SearchInArray

    public static boolean search(String[] array, String value) {
        for (int i=0; i<array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] names = {"Anna" , "John", "Alice", "Bob", "Daisy", "Serena"};

        System.out.println("Is name \"Lucy\" in the Array? R: " + search(names,"Lucy"));
        System.out.println("Is name \"Serena\" in the Array? R: " + search(names, "Serena"));
        System.out.println("Is name \"Bob\" in the array? - " + search(names, "Bob"));
        System.out.println("Is name \"Mark\" in the array? - " + search(names, "Mark"));
        System.out.println("Is name \"daisy\" in the array? - " + search(names, "daisy"));
    }
}

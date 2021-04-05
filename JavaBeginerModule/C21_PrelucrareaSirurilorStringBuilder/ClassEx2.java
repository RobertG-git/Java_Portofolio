package C21_PrelucrareaSirurilorStringBuilder;

public class ClassEx2 {
    /*
    Conversia la / din tipuri numerice
    - tip numeric -> 'String'
     */

    public static void main(String[] args) {

        boolean bValue = false;
        String strBValue = Boolean.toString(bValue);
        String sameBValue = String.valueOf(bValue);

        if (sameBValue == strBValue) {
            System.out.println("It works fine!");
        }
    }
}

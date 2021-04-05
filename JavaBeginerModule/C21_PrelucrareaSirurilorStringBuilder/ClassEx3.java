package C21_PrelucrareaSirurilorStringBuilder;

public class ClassEx3 {

    /*
    Compararea sirurilor de caractere
     */

    public static String getFirstString(String[] values) {
        if (values.length == 0) {
            return "";
        }

        String result = values[0];
        for (int i=1; i<values.length; i++) {
            if (result.compareTo(values[i]) > 0) {// i.e. result > values[i]
                result = values[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] nume= {"Andrei", "Andreea", "Andrea",
                "Marius", "Marcus", "Marcel", "Florin"};
        System.out.println(getFirstString(nume));
    }
}

package C21_PrelucrareaSirurilorStringBuilder;

public class ClassEx4 {

    /*
    Exemplu - StringBuilder
     */
    public static void main(String[] args) {
        String str = "the captain is Tom. his plane is flying over"
                + " Romania and will land tomorrow in Paris!";
        System.out.println(str);
        StringBuilder sBuilder = new StringBuilder(str);

        for (int it = 0; it < sBuilder.length(); it++) {
            // if the character at index it is (1) the first letter of a word
            //    AND (2) that character is a capital letter
            if ((it == 0 || it > 0 && !Character.isLetter(sBuilder.charAt(it - 1))) // (1)
                    && Character.isUpperCase(sBuilder.charAt(it))) { // (2)

                // replace each letter of the name with
                while (it < sBuilder.length() && Character.isLetter(sBuilder.charAt(it))) {
                    sBuilder.setCharAt(it, '_');
                    it++;
                }
            }
        }
        // Get the new string object from the builder
        String newStr = sBuilder.toString();
        System.out.println(newStr);
    }
}

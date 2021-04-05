package C20_String_SiruriDeCaractere;

public class ClassEx5 {

        // Cautarea subsirurilor si caracterelor

        public static int countLetters(String str, char letter) {
            int counter = 0;
            int index = str.indexOf(letter);
            while (index >= 0) {
                counter++;
                index = str.indexOf(letter , index + 1);
            }
            return counter;
        }

        public static void main(String[] args) {
            String quoteOfTheDay = "Either you run the day, or the day runs you.";

            System.out.println(quoteOfTheDay);
            System.out.println("Y appear: " + countLetters(quoteOfTheDay,'y') + " times.");
            System.out.println("A appear: " + countLetters(quoteOfTheDay,'a') + " times.");
            System.out.println("X appear: " + countLetters(quoteOfTheDay,'x') + " times");
            System.out.println("String contain word 'day'? R: " + quoteOfTheDay.contains("day"));

        }
}

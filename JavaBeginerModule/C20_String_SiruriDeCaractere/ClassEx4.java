package C20_String_SiruriDeCaractere;

public class ClassEx4 {

    // Manipularea sirurilor

    public static void main(String[] args) {

        // 1.Obtinerea unui subsir

        String entireString = "Today is a great day for science!";
        String substring1 = entireString.substring(9, 20);
        String substring2 = entireString.substring(9);

        System.out.println(entireString);
        System.out.println(substring1);
        System.out.println(substring2);

        // 2. Spargerea unui sir in 'tokeni'

        String quoteOfTheDay =  "Strive not to be a success, but rather to be of value. \n";
        String[] words = quoteOfTheDay.split("\\W+");
        String[] splitWithLimit = quoteOfTheDay.split("\\W+", 3);

        System.out.println("Original sentence: " + quoteOfTheDay);
        System.out.println("The sentence with words are: ");
        for (int i = 0; i <words.length; i++) {
            System.out.println("Word " + i + " is " + words[i]);
        }
        System.out.println();

        System.out.println("The first 3 words in the sentence are: ");
        for (int i = 0; i < splitWithLimit.length; i++) {
            System.out.println("Words " + i + " is " + splitWithLimit[i]);
        }

        //3. Conversia literelor

        String allSmallLetter = quoteOfTheDay.toLowerCase();
        System.out.print(allSmallLetter);
        String allGreatLetter = quoteOfTheDay.toUpperCase();
        System.out.println(allGreatLetter);
    }
}

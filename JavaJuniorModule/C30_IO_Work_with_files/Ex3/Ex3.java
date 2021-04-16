package src.C30_IO_Work_with_files.Ex3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
    /*
    3. Se citeste de la tastatura o lista de cuvinte (i.e. siruri de caractere fara spatii), separate prin newline (\n). Sa se genereze un fisier result.txt care sa contina:

        cel mai scurt cuvant
        cel mai lung cuvant
        primul cuvant in ordine alfabetica
        ultimul cuvant in ordine alfabetica
        numarul total de cuvinte
        Fiecare informatie mentionata anterior va fi scrisa pe o linie individuala, alaturi de un mesaj relevant.
     */
    public static void main(String[] args) throws IOException {
        fileProcessing();
    }
    
    public static void fileProcessing () throws IOException {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String shortestWord = word;
        String longestWord = word;
        String firstAlphabetical = word;
        String lastAlphabetical = word;
        int totalWords = 1;

        while (true){
            word = sc.nextLine();
            if (word.equals("quit")) {
                break;
            }
            if (word.length() < shortestWord.length()) shortestWord = word;
            if (word.length() > longestWord.length()) longestWord = word;
            if (word.compareTo(firstAlphabetical) < 0) firstAlphabetical = word;
            if (word.compareTo(lastAlphabetical) > 0) lastAlphabetical = word;
            totalWords++;
        }

        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("C:\\Users\\User_principal\\Desktop" +
                "\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\Ex3\\Result"))) {

            outputFile.write("'" + shortestWord + "' is the shortest word");
            outputFile.newLine();
            outputFile.write("'" + longestWord + "' is the longest word");
            outputFile.newLine();
            outputFile.write("'" + firstAlphabetical + "' is the first alphabetical word");
            outputFile.newLine();
            outputFile.write("'" + lastAlphabetical + "' is the last alphabetical word");
            outputFile.newLine();
            outputFile.write("'" + totalWords + "' is the total number of words");
        }
    }
    
}

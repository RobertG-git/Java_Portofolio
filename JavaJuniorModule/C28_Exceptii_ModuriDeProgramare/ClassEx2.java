package src.C28_Exceptii_ModuriDeProgramare;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class ClassEx2 {

    // try catch example of use case
    public static int countChars(List<String> list) {
        int amount = 0;
        for (String word : list) {
            try {
                amount += word.length();
            } catch (NullPointerException e) {
                amount += 0;
            }
        }

        return amount;
    }
}

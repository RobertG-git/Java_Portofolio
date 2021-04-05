package src.C5_ArrayListColectii;

import java.util.ArrayList;
import java.util.Arrays;

public class CLassEx1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>(Arrays.asList("John", "Lucy", "Anna", "Kelly", "Dean", "Lucy"));
        prettyPrintArrayList(names, ", ", "Names: ");

        int indexToRemove = 3;
        if(indexToRemove >= 0 && indexToRemove < names.size()) {
            String removedE1 = names.remove(indexToRemove);
            System.out.println("The element that was removed from index " + indexToRemove + " is: " + removedE1);

        }

        prettyPrintArrayList(names, ", ", "Names: ");
    }

    public static void prettyPrintArrayList(ArrayList<String> values, String delim, String message) {
        System.out.print(message);
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + delim);
        }
        System.out.println();
    }
}

package src.C20_JavaGenerics.ClassEx1;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericsExample1 {
    public static void noGenerics() { // as was before Java 5

        // notice the warning
        // no type check is done

        ArrayList fishNames = new ArrayList();
        fishNames.add("Dolphin");
        fishNames.add("Sharks");
        fishNames.add("Salmon");
        fishNames.add("Tuna");

        fishNames.add(3); // no compile error
        fishNames.add(new Scanner(System.in)); // no compile error

        for (Object el : fishNames) {
            System.out.println(el);
        }

        // I. trying to be more specific
        // Comment this section after observing the compile error.
        for (Object el : fishNames) {
            System.out.println((String) el + " is a type of fish!");
            // Force casting
            // trying to cast to strings will throw an exception
            // for incompatible objs
            // FIX: can catch the exception, but what is the point
            //      of having such code?
        }
    }

    public static void main(String[] args) {
        noGenerics();
    }

}

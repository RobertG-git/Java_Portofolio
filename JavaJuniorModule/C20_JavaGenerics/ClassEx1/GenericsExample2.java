package src.C20_JavaGenerics.ClassEx1;

import java.util.ArrayList;

public class GenericsExample2 {

    public static void usingGenerics() {
        ArrayList<String> fishNames = new ArrayList<>();

        fishNames.add("Dolphin");
        fishNames.add("Sharks");
        fishNames.add("Salmon");
        fishNames.add("Tuna");

        // These lines throw compile error! This is good because errors
        // are detected as early as possible!
//        fishNames.add(3);
//        fishNames.add(new Scanner(System.in));

        // Can use 'String' directly instead of generic 'Object'
        for (String el : fishNames) {
            System.out.println(el + " is a type of fish!"); // It works great!
        }

        // Conclusion: Java Generics help us reinforce types in order to prevent
        // type-errors (e.g. incompatible types, type mismatch..)
        // as early as possible (i.e. compile time)!
    }

    public static void main(String[] args) {
        usingGenerics();

        // Conclusion: generics are useful!
        // Next: defining our own generic types!
    }
}

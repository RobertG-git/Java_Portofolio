package C10_1_StructuraConditionalaSwitch;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        /*
        1. Folosind instructiunea switch, scrie un program care citeste de la tastatura un caracter si afiseaza un cuvant (la alegere) care incepe cu acel caracter.
        Tratati doar cazurile pentru caracterele d, e, v, si s si afisati un mesaj de eroare corespunzator pentru orice alte litere introduse.
         */
        String myChar;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your character (e.g. 'a'): ");
        myChar = sc.next();

        switch (myChar) {
            case "d":
                System.out.println("Daniel");
                break;
            case "e":
                System.out.println("Elena");
                break;
            case "v":
                System.out.println("Vlad");
                break;
            case "s":
                System.out.println("Serban");
                break;
            default:
                System.out.println("Character inserted is not in the list.");
                System.out.println("Please insert 'd', 'e', 'v' or 's' character.");

        }


    }
}

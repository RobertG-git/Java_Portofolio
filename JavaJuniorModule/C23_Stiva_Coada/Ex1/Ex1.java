package src.C23_Stiva_Coada.Ex1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ex1 {
    /*
    1. Se da un sir de paranteze sub forma de sir de caractere, care poate contine: (, ); [, ] si {, }.
    Verifica daca sirul de paranteze este valid, adica daca toate parantezele „deschise“ se inchid „corect“.
    Iata cateva exemple din ambele cazuri:

        Expresii valide	    Expresii invalide
        ()[]({})	        [[]
        (((([{}]))))[]	    [[]])
        ()[([{}])]	        [[(]])
        ()(([])){[[()]]}	[(])
     */

    public static boolean isValid(String s) {

        Deque<Character> stack = new LinkedList<>();

        for(Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push ('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "()[]({})";
        System.out.println(isValid(s));
    }
}

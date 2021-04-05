package src.C23_Stiva_Coada.ClassEx1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DocPile {
    private final Deque<String> pile;

    public DocPile(String containerType) {
        switch (containerType) {
            case "LinkedList" -> pile = new LinkedList<String>();
            case "ArrayDeque" -> pile = new ArrayDeque<String>();
            default -> {
                System.out.println("Error: Invalid type. Using the default: ArrayDeque");
                pile = new ArrayDeque<String>();
            }
        }
    }

    public DocPile(Deque<String> container) {
        this.pile = container;
    }

    public DocPile() {
        pile = new ArrayDeque<String>();
    }

    public String readDoc() {
        return pile.peek();
    }

    public void addDoc(String doc) {
        pile.push(doc);
    }

    public String removeDoc() {
        return pile.pop();
    }

    public boolean isEmpty() {
        return pile.isEmpty();
    }
}

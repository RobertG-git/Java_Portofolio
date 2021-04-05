package src.C23_Stiva_Coada.ClassEx2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PersonsQueue {
    private Queue<String> personsQ;

    public PersonsQueue(String containerType) {
        switch (containerType) {
            case "LinkedList" :
                personsQ = new LinkedList<String>();
                break;
            case "ArrayDeque" :
                personsQ = new ArrayDeque<String>();
                break;
            default:
                System.out.println();
                System.out.println("Error: Invalid type. Using the default: ArrayDeque");
                personsQ = new ArrayDeque<String>();
                break;
        }
    }

    public PersonsQueue(Queue<String> container) {
        this.personsQ = container;
    }

    public PersonsQueue() {
        personsQ = new ArrayDeque<String>();
    }

    public String whoIsNext() {
        return personsQ.peek();
    }

    public void addPerson(String person) {
        personsQ.offer(person);
    }

    public String servePerson() {
        return personsQ.poll();
    }

    public boolean areMorePersons() {
        return !personsQ.isEmpty();
    }
}

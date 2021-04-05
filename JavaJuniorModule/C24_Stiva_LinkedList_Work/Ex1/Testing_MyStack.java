package src.C24_Stiva_LinkedList_Work.Ex1;

public class Testing_MyStack {

    public static void main(String[] args) {
        MyStack<String> rgStack =  new MyStack<>();
        rgStack.push("apple");
        rgStack.push("mango");
        rgStack.push("lemon");

        System.out.println("Peek: " + rgStack.peek());
        System.out.println("Lifo: ");

        while (!rgStack.isEmpty()) {
            System.out.println(" - " + rgStack.pop());
        }
    }
}

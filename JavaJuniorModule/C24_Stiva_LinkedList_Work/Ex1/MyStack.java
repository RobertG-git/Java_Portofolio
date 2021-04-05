package src.C24_Stiva_LinkedList_Work.Ex1;

public class MyStack<E> {

    // field
    public MyLinkedList<E> container;

    // constructor
    public MyStack() {
        this.container = new MyLinkedList<>();
    }

    // method
    public E peek() {
        return this.container.get(this.container.size() - 1);
    }

    public void push(E element) {
        this.container.add(element);
    }

    public E pop() {
        return container.removeElementAtIndex(container.size() - 1);
    }

    public boolean isEmpty() {
        return container.size() == 0;
    }
}

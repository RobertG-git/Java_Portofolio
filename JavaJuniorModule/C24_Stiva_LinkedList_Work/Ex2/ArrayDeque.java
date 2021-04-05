package src.C24_Stiva_LinkedList_Work.Ex2;

import java.util.Arrays;

public class ArrayDeque {
    /*
    Implementare coada cu vector circular
     */

    // fields
    private final int[] buffer;
    private int indexRead = 0;
    private int indexWrite = 0;

    // constructor
    public ArrayDeque(int size) {
        this.buffer = new int[size];
    }

    // method
    public void enqueue(int x) throws Exception{
        if (this.indexRead == (this.indexWrite + 1) % this.buffer.length) {
            throw new Exception("Queue is full");
        }

        this.buffer[this.indexWrite % this.buffer.length] = x;
        this.indexWrite = (this.indexWrite + 1) % this.buffer.length;
    }

    public int dequeue() throws Exception{
        if (this.indexRead == this.indexWrite) {
            throw new Exception("Queue is empty");
        }

        int removedElement = this.buffer[indexRead];
        this.indexRead = (this.indexRead + 1) % this.buffer.length;
        return removedElement;
    }

    public int peak() {
        return buffer[indexRead];
    }

    public boolean isEmpty() {
        return this.indexRead == this.indexWrite;
    }

    @Override
    public String toString() {
        return "ArrayDeque{" +
                "buffer=" + Arrays.toString(buffer) +
                '}';
    }
}

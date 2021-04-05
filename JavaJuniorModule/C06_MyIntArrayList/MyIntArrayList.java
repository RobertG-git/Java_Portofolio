package src.C6_MyIntArrayList;

import java.util.Arrays;

/*
Implementeaza o clasa MyIntArrayList - o colectie ce poate stoca elemente de tip int. Colectia MyIntArrayList va trebui
sa opereze similar colectiei ArrayList<E>. In consecinta, o proprietate a clasei este ca va avea redimensionare automata.
 */
public class MyIntArrayList {
    private int[] elements;
    private int size;

    // Constructor

    public MyIntArrayList(int initialCapacity) {
        this.elements = new int[initialCapacity];
    }

    public MyIntArrayList() {
        this(10);
    }

    public MyIntArrayList(MyIntArrayList c) {
        this.size = c.size;
        this.elements = new int[size];
        if (size != 0) {
            for (int i = 0; i < this.size; i++) {
                this.elements[i] = c.elements[i];
            }
        }
    }

    // Methods
    public void add(int index, int element) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }

        if (this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }

        this.size++;
        int[] newElements = new int[this.size];

        for (int i = 0; i < index; i++) {
            newElements[i] = this.elements[i];
        }
        newElements[index] = element;


        for (int i = index + 1; i < this.size; i++) {
            newElements[i] = this.elements[i - 1];
        }

        this.elements = Arrays.copyOf(newElements, this.size);
    }

    public boolean add(int e) {
        if (this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        this.elements[this.size] = e;
        this.size++;

        return true;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int e) {
        boolean aux = false;
        for (int i = 0; i < this.size; i++) {
            if (elements[i] == e) {
                aux = true;
                break;
            }
        }

        return aux;
    }

    public int get(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }

    public int indexOf(int e) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int e) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int e) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == e) {

                this.size--;
                int[] newElements = new int[this.size];

                for (int j = 0; j < e; j++) {
                    newElements[j] = this.elements[j];
                }


                for (int j = e; j < this.size; j++) {
                    newElements[j] = this.elements[j + 1];
                }

                this.elements = Arrays.copyOf(newElements, this.size);
                return true;
            }
        }
        return false;
    }

    public int removeElementAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            // should throw IndexOutOfBoundsException
            System.out.println("Throwing IndexOutOfBoundsException when trying to" +
                    " remove element at position " + index);
            return -1;
        }

        int removedElement = this.elements[index];
        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;

        return removedElement;
    }

    public void clear() {
        this.size = 0;
    }

    public int set(int index, int e) {
        if (index < 0 || index >= this.size) {
            // should throw IndexOutOfBoundsException
            System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
                    " the element " + e + " at position " + index);
            return -1;
        }

        int replacedElement = this.elements[index];
        this.elements[index] = e;
        return replacedElement;
    }

    public boolean addAll(MyIntArrayList c) {
        if (c.size == 0) {
            throw new NullPointerException();
        }

        int counter = 0;
        for (int i = this.size; i < (this.size + c.size); i++) {
            if (counter < c.size) {
                if (this.size == this.elements.length) {
                    this.elements = Arrays.copyOf(this.elements, this.size * 2);
                }
                this.elements[i] = c.elements[counter];
                counter++;
                this.size++;
            }
        }
        this.elements = Arrays.copyOf(this.elements, this.size);
        return true;
    }

    public boolean addAll(int index, MyIntArrayList c) {
        if (c.size == 0) {
            throw new NullPointerException();
        }
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }

        int counter1 = 0;
        int counter2 = index;
        int[] newElements = new int[this.size + c.size];

        for (int i = 0; i < index; i++) {
            newElements[i] = this.elements[i];
        }

        for (int i = index; i < index + c.size; i++) {
            if (counter1 < c.size) {
                newElements[i] = c.elements[counter1];
                counter1++;
            }
        }

        for (int i = index + c.size; i < this.size + c.size; i++) {
            if (counter2 < this.size) {
                newElements[i] = this.elements[counter2];
                counter2++;
            }
        }
        this.size = this.size + c.size;
        this.elements = Arrays.copyOf(newElements, this.size);

        return true;

    }

    public int[] toArray() {
        return Arrays.copyOf(this.elements, this.size);
    }

    void ensureCapacity(int minCapacity) {
        this.elements = Arrays.copyOf(this.elements, minCapacity);
    }

    public void trimToSize() {
        this.elements = Arrays.copyOf(this.elements, this.size);
    }

    //Develop method
    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.elements[i] + " ");
        }
        System.out.println();
    }
}

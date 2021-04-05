package src.C24_Stiva_LinkedList_Work.Ex1;


public class MyLinkedList<E> {

    private DoubleLinkedListNode<E> head;
    private DoubleLinkedListNode<E> tail;
    private int size = 0;

    // Constructor
    public MyLinkedList() {
    }

    public MyLinkedList(MyLinkedList<E> c) {
        this.head = c.head;
        this.tail = c.tail;
        this.size = c.size;
    }

    // Method
    public void add(int index, E element) {
        DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(element);
        if (index == 0) {
            this.head.prev(node);
            node.next(this.head);
            this.head = node;
        } else if (index == size) {
            this.tail.next(node);
            node.prev(tail);
            this.tail = node;
        } else {
            int counter = 0;
            DoubleLinkedListNode<E> it = head;
            while (counter < index - 1) {
                it = it.next();
                counter++;
            }
            node.next(it.next());
            it.next().prev(node);

            node.prev(it);
            it.next(node);
        }
        this.size++;
    }

    public void add(E element) {
        DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(element);
        if (this.head == null && this.tail == null) {
            this.head = node;
            this.tail = node;
            this.tail.prev(this.head);
            this.head.next(this.tail);
        } else {
            this.tail.next(node);
            node.prev(this.tail);
            this.tail = node;
        }
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(E e) {
        if (tail.value().equals(e)) {
            return true;
        }

        DoubleLinkedListNode<E> it = this.head;
        int counter = 0;
        while (counter < this.size) {
            if (it.value().equals(e)) {
                return true;
            }
            it = it.next();
            counter++;
        }

        return false;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (this.size - 1 == index) {
            return this.tail.value();
        }

        DoubleLinkedListNode<E> it = this.head;
        int counter = 0;
        while (counter < this.size) {
            if (counter == index) {
                break;
            }
            it = it.next();
            counter++;
        }
        return it.value();
    }

    public int indexOf(E e) {

        // nu am verificat si ultimul index in O(1) pentru ca exista metoda specifica: 'lastIndexOf'

        DoubleLinkedListNode<E> it = this.head;
        int index = 0;
        while (index < this.size) {
            if (it.value() == e) {
                return index;
            }
            it = it.next();
            index++;
        }
        return -1;
    }

    public int lastIndexOf(E e) {

        // nu am verificat si primul index in O(1) pentru ca exista metoda specifica: 'indexOf'

        DoubleLinkedListNode<E> it = this.tail;
        int index = this.size - 1;
        while (index >= 0) {
            if (it.value() == e) {
                return index;
            }
            it = it.prev();
            index--;
        }
        return -1;
    }

    public boolean remove(E e) {

        if (head.value() == e) {
            head = head.next();
            head.prev(null);
            size--;
            return true;
        }

        DoubleLinkedListNode<E> it = this.head.next();
        int counter = 1;
        while (it != null) {

            // am pus aici check-ul pentru ca se cere 'remove' pentru primul element 'e';
            if (counter == this.size - 1 && this.tail.value() == e) {
                this.tail = this.tail.prev();
                this.tail.next(null);
                this.size--;
                return true;
            }

            if (it.value() == e) {
                DoubleLinkedListNode<E> prevNode = it.prev();
                DoubleLinkedListNode<E> nextNode = it.next();
                prevNode.next(nextNode);
                nextNode.prev(prevNode);
                this.size--;
                return true;
            }
            it = it.next();
            counter++;
        }
        return false;

    }

    public E removeElementAtIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            DoubleLinkedListNode<E> aux = this.head;
            this.head = head.next();
            this.size--;
            return aux.value();
        }

        if (this.size - 1 == index) {
            DoubleLinkedListNode<E> aux = this.tail;
            this.tail = tail.prev();
            this.size--;
            return aux.value();
        }

        DoubleLinkedListNode<E> it = this.head.next();
        int counter = 1;
        while (it != null) {

            if (counter == index) {
                DoubleLinkedListNode<E> prevNode = it.prev();
                DoubleLinkedListNode<E> nextNode = it.next();
                prevNode.next(nextNode);
                nextNode.prev(prevNode);
                this.size--;
                break;
            }
            it = it.next();
            counter++;
        }
        assert it != null;
        return it.value();
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public E set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (this.size - 1 == index) {
            E aux = this.tail.value();
            tail.value(e);
            return aux;
        }

        int counter = 0;
        DoubleLinkedListNode<E> it = head;
        while (it != null) {
            if (index == counter) {
                break;
            }
            it = it.next();
            counter++;
        }

        assert it != null;
        E aux = it.value();
        it.value(e);
        return aux;

    }

    public boolean addAll(MyLinkedList<E> c) {
        this.tail.next(c.head);
        c.head.prev(this.tail);
        this.size += c.size;
        return true;
    }

    public boolean addAll(int index, MyLinkedList<E> c) {
        if (index < 0 || index > this.size) throw new IndexOutOfBoundsException();

        if (index == this.size) {
            this.tail.next(c.head);
            c.head.prev(this.tail);

            this.tail = c.tail;

            this.size += c.size;
            return true;
        }

        if (index == 0) {
            c.tail.next(this.head);
            this.head.prev(c.tail);

            this.head = c.tail;

            this.size += c.size;
            return true;
        }

        int counter = 1;
        DoubleLinkedListNode<E> it = head.next();

        while (it.next() != null) {
            if (counter == index) {
                break;
            }
            it = it.next();
            counter++;
        }

        DoubleLinkedListNode<E> prevIt = it.prev();

        prevIt.next(c.head);
        c.tail.prev(prevIt);

        it.prev(c.tail);
        c.tail.next(it);
        this.size += c.size;

        return true;

    }

    public E[] toArray() {
        DoubleLinkedListNode<E> it = this.head;

        E[] arrayE = (E[]) new Object[this.size];
        int counter = 0;

        while (it != null && counter < this.size) {
            arrayE[counter] = it.value();
            it = it.next();
            counter++;
        }

        return arrayE;
    }

    public E[] toArrayFromTail() {
        DoubleLinkedListNode<E> it = this.tail;

        E[] arrayE = (E[]) new Object[this.size];
        int counter = 0;

        while (it != null && counter < this.size) {
            arrayE[counter] = it.value();
            it = it.prev();
            counter++;
        }

        return arrayE;
    }

}

package src.C24_Stiva_LinkedList_Work.Ex2;

public class Testing_ArrayDeque {

    public static void main(String[] args) throws Exception {
        ArrayDeque myQ = new ArrayDeque(3);

        myQ.enqueue(2);
        myQ.enqueue(3);
        System.out.println("Dequeue: " +myQ.dequeue());
        System.out.println("Dequeue: " +myQ.dequeue());
        myQ.enqueue(4);
        myQ.enqueue(5);
        System.out.println("Dequeue: " +myQ.dequeue());
        System.out.println("Peak: " + myQ.peak());
        System.out.println("isEmpty: " + myQ.isEmpty());

        System.out.println(myQ.toString());

    }
}

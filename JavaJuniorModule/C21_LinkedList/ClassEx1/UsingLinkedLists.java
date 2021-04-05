package src.C21_LinkedList.ClassEx1;

public class UsingLinkedLists {

    // helper method to create a list from an array of values
    private static Node<Double> makeList (double[] values) {
        Node<Double> head = new Node<>();
        Node<Double> it = head;
        for (double el : values) {
            Node<Double> newNode = new Node<>(el);
            it.next(newNode);
            it = it.next();
        }
        return head.next();
    }

    // iterate over all elements of a linked list
    public static void iterate(Node<Double> listHead) {
        Node<Double> it = listHead; // The iterator points to the first element in the list
        while (it != null) { // while we have not reached the end of the list
            double crtElement = it.value(); // accessing the element in the Node indicated by the iterator
            System.out.println(crtElement); // for demo purpose: printing the element
            it = it.next(); // updating the iterator to point to the next node
        }
    }

    // search for a certain key in a linked list
    public static boolean find(Node<Double> listHead, double searchKey) {

        // using a for loop for iteration
        for (Node<Double> it = listHead; it != null; it = it.next()) {
            if (Math.abs(it.value()) == searchKey) {
                return true;
            }
        }

        return false;
    }

    public static void insert(Node<Double> listHead, double newValue, int pos) {
        // Insertion steps:
        // (0) - move the iterator 'it' on the node *before* the insertion
        Node<Double> it = listHead;
        for (int i=0; i<pos-1; i++) {
            it = it.next();
        }

        // (1) - create a node containing the new inserted element
        Node<Double> newNode = new Node<>(newValue);

        // (2) - newNode indicates the 'after' node
        newNode.next(it.next());

        // (3) - previous node indicates the new created node
        it.next(newNode);
    }

    public static double remove(Node<Double> listHead, int pos) {
        // Insertion steps:
        // (0) - move the iterator 'it' on the node *before* the one removed
        Node<Double> it = listHead;
        for (int i=0; i<pos-1; i++) {
            it = it.next();
        }

        // store the value from the deleted node
        double removedEl = it.next().value();

        // (1) - update the reference of the previous node
        //       to indicate the node after the deleted one
        it.next(it.next().next());

        // return the deleted value
        return removedEl;
    }

    public static void main(String[] args) {
        double[] values = {24.15, 24.15, 3.33, 1.01, 19.30, 16.11};
        Node<Double> list = makeList(values);
        iterate(list);

        double searchKey = 19.30;
        System.out.println("Element " + searchKey + " exists? Answer: " + find(list,searchKey));

        insert(list, 87.26,2);
        iterate(list);

        remove(list,4);
        iterate(list);
    }
}

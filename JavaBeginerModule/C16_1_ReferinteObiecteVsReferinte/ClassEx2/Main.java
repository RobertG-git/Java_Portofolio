package C16_1_ReferinteObiecteVsReferinte.ClassEx2;

public class Main {

    //Case (1) - update the reference
    public static Pair updateReference(Pair p) {
        // create a new 'Pair' object and
        // assign to 'p' parameter the new object reference.
        p = new Pair(10, 10);
        return p;
    }

    //Case (2) - update the referred object
    public static void updateObject(Pair p) {
        // update the internal state of the object
        // found in memory at the 'p' address
        p.setFirst(100);
        p.setSecond(100);
    }

    public static void main(String[] args) {
        Pair pn = new Pair(1, 1);
        pn.print(); // DEBUG: display initial value

        // Case (1) - update the reference
        pn = updateReference(pn);
        pn.print(); // The "old" object is printed

        // Case (2) - update the referred object
        updateObject(pn);
        pn.print(); // The object was successfully updated
    }
}

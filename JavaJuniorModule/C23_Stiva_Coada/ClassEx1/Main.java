package src.C23_Stiva_Coada.ClassEx1;

public class Main {
    public static void main(String[] args) {
        DocPile docs = new DocPile();
        docs.addDoc("Implement the interface methods.");
        docs.addDoc("Remove 'public' declared fields");

        System.out.println(docs.readDoc());

        docs.addDoc("Always reuse code where is possible.");
        docs.addDoc("Don't forget 'StringBuilder' for editing Strings.");
        docs.addDoc("Use intuitive names for all entities.");

        docs.readDoc();

        docs.addDoc("Write Efficient code.");

        while (!docs.isEmpty()) {
            System.out.println(docs.removeDoc());
        }
    }
}

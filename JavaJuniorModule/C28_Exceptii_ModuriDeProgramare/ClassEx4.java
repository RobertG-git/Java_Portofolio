package src.C28_Exceptii_ModuriDeProgramare;

public class ClassEx4 {
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    public static int getInt() {
        try {
            System.out.println("test1");
            return -1;
        } finally {
            System.out.println("test2");
            return 0;
        }

    }
}

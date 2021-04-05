package C16_1_ReferinteObiecteVsReferinte.ClassEx3;

public class Main {

    public static void main(String[] args) {
        Pair pn = null;

        Pair backup;

        if (pn == null) {
            pn = new Pair(18,28);
            System.out.println("It's null");
            System.out.println(pn);
        } else {
            backup = pn;
            pn = new Pair(18,28);
            System.out.println("It's not null");
            System.out.println(backup);
            System.out.println(pn);
        }
    }
}

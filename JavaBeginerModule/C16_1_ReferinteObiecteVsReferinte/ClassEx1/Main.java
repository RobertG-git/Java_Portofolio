package C16_1_ReferinteObiecteVsReferinte.ClassEx1;

public class Main {
    public static void main(String[] args) {

        Pair p1 = new Pair(25, 18);
        Pair p2 = p1;
        p1.setFirst(3);
        p1.setSecond(3);
        p2.setFirst(1);
        p2.setSecond(1);

        System.out.print("I. - first variable value: ");
        p1.print();
        System.out.print("I. - first variable value: ");
        p2.print();

        int nr1 = 25;
        int nr2 = nr1;
        nr2 = 100;

        System.out.println("II. - first variable value: " + nr1);
        System.out.println("II. - first variable value: " + nr2);

    }
}

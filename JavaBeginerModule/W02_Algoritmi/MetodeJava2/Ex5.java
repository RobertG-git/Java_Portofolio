package W02_Algoritmi.MetodeJava2;

public class Ex5 {
    /*
    5. Numar automorfic

    6.1. Implementeaza o metoda care determina daca un numar este sau nu automorfic si returneaza o valoare boolean in consecinta.
    6.2. Foloseste metoda implementata anterior pentru a genera sirul numerelor automorfice pana la n inclusiv, unde n se citeste de la tastatura.
     */

    public static void main(String[] args) {
        String n = "5";
        System.out.println(isAutomorfic(n));

        automorficRow(377);

    }

    public static void automorficRow(int n) {
        for (int i = 0; i < n; i++) {
            if (isAutomorfic(String.valueOf(i))) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isAutomorfic(String n) {

        int squareN  = Integer.parseInt(n) * Integer.parseInt(n);

        StringBuilder squareNsB = new StringBuilder();
        squareNsB.append(String.valueOf(squareN).substring((String.valueOf(squareN).length() - n.length())));

        return squareNsB.toString().startsWith(String.valueOf(n));
    }
}

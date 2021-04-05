package Exam;

public class Ex3 {
    public static void main(String[] args) {

        int i = 20;
        int j = 23;
        int k = 6;
        int counter = 0;

        for (int d = i; d < j; d++) {
            if (beautifulNumber(i, k)) {
                counter++;
            }
        }
        System.out.println(counter);

    }

    public static boolean beautifulNumber(int i, int k) {
        StringBuilder sbN = new StringBuilder(String.valueOf(i));
        sbN = sbN.reverse();
        int reverseN = Integer.parseInt(sbN.toString());

        return ((i - reverseN) % k == 0);


    }
}

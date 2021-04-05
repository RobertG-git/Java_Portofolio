package src.W01_ProblemeDeAlgoritmica;

public class Ex1 {

    /*
    Recursive number digits from string.
     */

    public static String count(int n) {
        String copyN = String.valueOf(n);
        char currentChar = copyN.charAt(0);
        StringBuilder calculatedNumber = new StringBuilder();

        int counter = 0;
        for (int i = 0; i < copyN.length(); i++) {
            if (currentChar == copyN.charAt(i)) {
                counter++;
            } else {
                calculatedNumber.append(counter);
                calculatedNumber.append(currentChar);
                counter = 1;
                currentChar = copyN.charAt(i);
            }
        }
        calculatedNumber.append(counter);
        calculatedNumber.append(currentChar);

        return String.valueOf(calculatedNumber);
    }

    public static String countAndSay(int n) {
        String firstNumber = "1";

        for (int i = 0; i < n - 1; i++) {
            firstNumber = count(Integer.parseInt(firstNumber));
        }
        return firstNumber;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}

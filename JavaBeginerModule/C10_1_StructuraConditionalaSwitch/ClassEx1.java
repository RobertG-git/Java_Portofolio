package C10_1_StructuraConditionalaSwitch;

import java.util.Scanner;

public class ClassEx1 {

    public static void main(String[] args) {

        int theDigitToTestWithSwitch = 2;
        // theDigitToTestWithSwitch = 0;
        // theDigitToTestWithSwitch = 115

        Scanner sc = new Scanner(System.in);
        long readNumber = sc.nextLong();
        long sum = 1;

        do {
            readNumber += sum;
            sum *= 10;
        } while (sum <= readNumber);

        System.out.println(readNumber);
    }
}

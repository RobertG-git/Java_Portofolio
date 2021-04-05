package C9_2_InstructiuneaIterativaDoWhile;

public class ClassEx1 {

    public static void main(String[] args) {

        int time = 400; //seconds

        do {
            time++;
            System.out.println("Plus 1 second, total time is now: " + time);
        } while (time < 200);

    }
}

package src.C23_Stiva_Coada.Ex5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex5 {
    /*
    https://leetcode.com/problems/baseball-game/description/
     */

    public int calPoints(String[] ops) {
        Deque<Integer> q1 = new ArrayDeque<Integer>();
        int sum = 0;

        for (String op : ops) {
            if (op.equals("+")){
                int top = q1.removeLast();
                int newTop = top + (q1.getLast());
                q1.addLast(top);
                q1.addLast(newTop);

            } else if (op.equals("D")) {
                int top2 = q1.getLast();
                int newTop2 = top2 * 2;
                q1.addLast(newTop2);

            } else if (op.equals("C")) {
                q1.removeLast();

            } else {
                q1.addLast(Integer.valueOf(op));
            }
        }

        while (!q1.isEmpty()) {
            sum += q1.pollLast();
        }

        return sum;
    }
}

package src.C23_Stiva_Coada.Ex3;

import java.util.LinkedList;
import java.util.Queue;

class Ex3 {
    /*
    https://leetcode.com/problems/implement-stack-using-queues/
     */

    /** Initialize your data structure here. */
    private final Queue<Integer> q1 = new LinkedList<>();

    // Q: 1 2 3 & new Add is 6. Is moved in front the 6 to be our as Fifo first so will react as LIFO
    // 1 2 3 6 -> 2 3 6 1 ->  3 6 1 2 -> 6 1 2 3

    public void MyStack() {
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        int sz = q1.size();
        while (sz > 1) {
            q1.add(q1.remove());
            sz--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q1.remove();
    }

    /** Get the top element. */
    public int top() {
        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

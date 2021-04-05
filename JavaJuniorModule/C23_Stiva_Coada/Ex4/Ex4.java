package src.C23_Stiva_Coada.Ex4;

import java.util.Stack;

public class Ex4 {

    /*
        https://leetcode.com/problems/implement-queue-using-stacks/
     */

    /**
     * Initialize your data structure here.
     */

    Stack<Integer> q1 = new Stack<>();
    Stack<Integer> q2 = new Stack<>();

    public void MyQueue() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        q1.add(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (q2.empty()) {
            while (!q1.empty()) {
                q2.add(q1.pop());
            }
        }

        return q2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (q2.empty()) {
            while (!q1.empty()) {
                q2.add(q1.pop());
            }
        }
        return q2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return q2.empty() && q1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

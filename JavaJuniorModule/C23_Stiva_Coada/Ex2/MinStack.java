package src.C23_Stiva_Coada.Ex2;

import java.util.ArrayDeque;
import java.util.Deque;

/*
https://leetcode.com/problems/min-stack/
 */

public class MinStack {

    Deque<Integer> stack =  new ArrayDeque<>();
    Deque<Integer>  minStack = new ArrayDeque<>();

    public MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        if (val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int el = (int) stack.pop();
        if (minStack.peek() == el) {
            minStack.pop();
        }
    }

    public int top() {
        return (int) stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

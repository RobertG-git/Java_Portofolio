package src.C21_LinkedList;

import java.awt.*;

public class Ex2 {
    /*
    https://leetcode.com/problems/rotate-list/submissions/
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        tail.next = head;

        int newHeadIndex = length - k % length;

        for (int i = 0; i < newHeadIndex; i++) {
            tail = tail.next;
        }

        head = tail.next;
        tail.next = null;

        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5,null);
        ListNode node2 = new ListNode(4,node1);
        ListNode node3 = new ListNode(3,node2);
        ListNode node4 = new ListNode(2,node3);
        ListNode node5 = new ListNode(1,node4);

        System.out.println(rotateRight(node5,2));
    }
}

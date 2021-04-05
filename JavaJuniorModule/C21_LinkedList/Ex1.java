package src.C21_LinkedList;

public class Ex1 {
    /*
    https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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

    public ListNode rotateRight(ListNode head, int k) {
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
}

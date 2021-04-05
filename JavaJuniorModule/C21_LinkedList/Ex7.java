package src.C21_LinkedList;

public class Ex7 {
    /*
    https://leetcode.com/problems/remove-linked-list-elements/
     */

    public class ListNode {
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

    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode prev = dummy;

            while (prev.next != null) {
                if (prev.next.val == val) {
                    prev.next = prev.next.next;
                } else {
                    prev = prev.next;
                }
            }

            return dummy.next;

        }
    }
}

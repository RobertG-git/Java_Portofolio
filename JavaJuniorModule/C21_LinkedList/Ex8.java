package src.C21_LinkedList;

public class Ex8 {

    /*
    https://leetcode.com/problems/odd-even-linked-list/submissions/
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
        public ListNode oddEvenList(ListNode head) {

            ListNode oddList = new ListNode();
            ListNode evenList = new ListNode();

            ListNode oddHead = oddList;
            ListNode evenHead = evenList;

            int counter = 1;
            while (head != null) {

                if (counter % 2 == 1) {
                    oddList.next = head;
                    oddList = oddList.next;
                } else {
                    evenList.next = head;
                    evenList = evenList.next;
                }

                head = head.next;
                counter++;

            }

            evenList.next = null;
            oddList.next = evenHead.next;

            return oddHead.next;

        }
    }
}

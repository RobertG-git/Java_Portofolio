package src.C21_LinkedList;

public class Ex4 {
    /*
    https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/
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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummy = new ListNode(0, head);
            ListNode list = dummy;

            while (head != null) {
                // if it's a beginning of duplicates sublist
                // skip all duplicates
                if (head.next != null && head.val == head.next.val) {
                    // move till the end of duplicates sublist
                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }
                    // skip all duplicates
                    list.next = head.next;
                    // otherwise, move predecessor
                } else {
                    list = list.next;
                }

                // move forward
                head = head.next;
            }
            return dummy.next;
        }
    }
}

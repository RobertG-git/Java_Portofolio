package src.C21_LinkedList;

public class Ex3 {
    /*
    https://leetcode.com/problems/merge-two-sorted-lists/
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


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = new ListNode(0);
        ListNode l3 = head;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }

        l3.next = l1 == null ? l2 : l1;

        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5,null);
        ListNode node2 = new ListNode(4,node1);
        ListNode node3 = new ListNode(3,null);
        ListNode node4 = new ListNode(2,node3);
        ListNode node5 = new ListNode(1,node4);

        System.out.println(mergeTwoLists(node5,node2));
    }

}

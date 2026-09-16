/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        
        head = reverse(head);

        
        if (n == 1) {
            head = head.next;
        } else {

            ListNode current = head;

            
            for (int i = 1; i < n - 1; i++) {
                current = current.next;
            }

            
            current.next = current.next.next;
        }

       
        head = reverse(head);

        return head;
    }

    
    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }
}
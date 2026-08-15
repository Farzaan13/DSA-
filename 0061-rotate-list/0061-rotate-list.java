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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        int len =0;

        while(fast != null){
            fast = fast.next;
            len++;
        }
        fast = head;
        k %= len;
        if(k ==0) return head;

        for(int i = 1; i<= k+1; i++){
            fast = fast.next;
        }

        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newhead = slow.next;
        slow.next = null;

        ListNode temp = newhead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;

        return newhead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
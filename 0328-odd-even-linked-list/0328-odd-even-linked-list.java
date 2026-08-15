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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even  = new ListNode(-2);
        
        ListNode t1 = odd;
        ListNode t2 = even;
        ListNode t = head;

        while(t != null){
            t1.next = t;
            t1 = t1.next;
            t = t.next;
            if(t == null) break;
            
            t2.next = t;
            t2 = t2.next;
            t = t.next;
            if(t == null) break;
        }
        if(t2 != null) t2.next =null;
        t1.next = even.next;

        return odd.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
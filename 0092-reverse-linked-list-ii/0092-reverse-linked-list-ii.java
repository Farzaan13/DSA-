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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode fwd = head.next;

        ListNode prev = null;
        while(curr!= null){
            curr.next = prev;
            prev = curr;
            curr = fwd;
            if(fwd != null) fwd = fwd.next;
        }

        return prev;
    }
    public ListNode reverseBetween(ListNode head, int l, int r) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        dummy.next = head;

        for (int i = 1; i <= l - 1; i++) {
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = temp.next;

        for (int i = 1; i <= r - l + 1; i++) {
            temp = temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = temp.next;

        tail1.next = null;
        tail2.next = null;

        reverse(head2);

        tail1.next = tail2;
        head2.next = head3;
        return dummy.next;
        }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int l1 = 0;
        int l2 = 0;
        while(temp1 !=null){
            temp1 = temp1.next;
            l1++;
        }
        while(temp2 != null){
            temp2 = temp2.next;
            l2++;
        }
        temp1 = headA;
        temp2 = headB;
        if(l1>l2){
            for(int i = 1;i<=(l1-l2);i++){
                temp1 = temp1.next;
            }
        }
        else if(l2>l1){
            for(int i = 1 ; i<=(l2-l1);i++){
                temp2 = temp2.next;
            }

        }

        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
            
        }
        if(temp1 == temp2) return temp1;
        return null;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
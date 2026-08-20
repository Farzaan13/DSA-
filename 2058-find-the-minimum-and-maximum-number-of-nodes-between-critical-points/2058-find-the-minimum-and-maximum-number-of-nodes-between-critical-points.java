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
    
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode fwd = curr.next;

        int idx = 1;
        int firstIdx = -1;
        int lastIdx = -1;
        int minDist = Integer.MAX_VALUE;

        while (fwd != null) {
            
            if ((curr.val > prev.val && curr.val > fwd.val) || 
                (curr.val < prev.val && curr.val < fwd.val)) {
                
                if (firstIdx == -1) {
                    firstIdx = idx;
                } else {
                    
                    minDist = Math.min(minDist, idx - lastIdx);
                }
                lastIdx = idx;
            }

            
            idx++;
            prev = curr;
            curr = fwd;
            fwd = fwd.next;
        }

        
        if (lastIdx == -1 || firstIdx == lastIdx) {
            return new int[]{-1, -1};
        }

        int maxDist = lastIdx - firstIdx;
        return new int[]{minDist, maxDist};
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
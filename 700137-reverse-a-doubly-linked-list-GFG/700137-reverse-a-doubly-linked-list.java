/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        if(head.next == null) return head;
        Node temp = null;
        Node curr = head;
        
        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
        
        // 3 POINTER METHOD
        
        // Node pre = null;
        // Node curr = head;
        // Node fwd = null;

        // while(curr != null){
        //     fwd = curr.next;
        //     curr.next = pre;
        //     curr.prev = fwd;
        //     pre = curr;
        //     curr = fwd;
        // }
        // return pre;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
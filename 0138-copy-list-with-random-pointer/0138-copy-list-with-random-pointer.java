/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepCopyOf(Node head1) {
        Node head2 = new Node(-1);
        Node temp2 = head2;
        Node temp1 = head1;
        while (temp1 != null) {
            temp2.next = new Node(temp1.val);
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }

    public void alternativeConnection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            Node next1 = temp1.next;
            Node next2 = temp2.next;

            temp1.next = temp2;
            temp2.next = next1;

            temp1 = next1;
            temp2 = next2;
        }
    }

    public void pointerAssignment(Node head1) {
        Node curr = head1;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
    }

    public Node split(Node head1) {
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node temp1 = dummy1;
        Node temp2 = dummy2;
        Node temp = head1;

        while (temp != null) {
            temp1.next = temp;
            temp = temp.next;
            temp1 = temp1.next;

            temp2.next = temp;
            temp = temp.next;
            temp2 = temp2.next;
        }

        temp1.next = null;
        temp2.next = null;

        return dummy2.next;
    }

    public Node copyRandomList(Node head1) {
        if (head1 == null) return null;

        Node head2 = deepCopyOf(head1);
        alternativeConnection(head1, head2);
        pointerAssignment(head1);
        return split(head1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
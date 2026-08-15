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
    public ListNode merge(ListNode a, ListNode b){
        ListNode i = a;
        ListNode j = b;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        while(i!= null && j!= null){
            
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
                k = k.next;
            }
            else{
                k.next = j;
                j = j.next;
                k = k.next;
            }  
        }
        if(i==null) k.next = j;
        else k.next = i;

        return dummy.next;
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        ArrayList<ListNode> heads1 = new ArrayList<>();
        ArrayList<ListNode> heads2 = new ArrayList<>();

        for(int i = 0;i<lists.length;i++){
            heads1.add(lists[i]);
        }
        

        while(heads1.size()+heads2.size() > 1){
            while(heads1.size()>0){
                if(heads1.size() == 1){
                    heads2.add(heads1.get(0));
                    heads1.remove(0);
                } 
                else{
                    ListNode a = heads1.get(heads1.size()-1);
                    heads1.remove(heads1.size()-1);
                    ListNode b = heads1.get(heads1.size()-1);
                    heads1.remove(heads1.size()-1);
                    ListNode c = merge(a,b);
                    heads2.add(c);
                }
                
            }
            while(heads2.size()>0){
                if(heads2.size() == 1){
                    heads1.add(heads2.get(0));
                    heads2.remove(0);
                }
                else{
                    ListNode a = heads2.get(heads2.size()-1);
                    heads2.remove(heads2.size()-1);
                    ListNode b = heads2.get(heads2.size()-1);
                    heads2.remove(heads2.size()-1);
                    ListNode c = merge(a,b);
                    heads1.add(c);

                }
                
            }


        }
        if(heads1.size() == 0) return heads2.get(0);
        return heads1.get(0);



        // if(lists.length == 0) return null;
        

        // while(heads.size()>1){
        //     ListNode a = heads.get(heads.size()-1);
        //     heads.remove(heads.size()-1);
        //     ListNode b = heads.get(heads.size()-1);
        //     heads.remove(heads.size()-1);
        //     ListNode c = merge(a,b);
        //     heads.add(c);
        // }
        // return heads.get(0);
        
    }
    

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
} */

class Pair{
    int dist;
    Node node;
    
    Pair(Node node, int dist){
        this.node = node;
        this.dist = dist;
    }
    
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root,0));
        
        int minDist = Integer.MAX_VALUE; int maxDist = Integer.MIN_VALUE;
        
        while(q.size()>0){
            Pair front = q.remove();
            int dist = front.dist;
            Node node = front.node;
            
            minDist = Math.min(dist,minDist);
            maxDist = Math.max(dist,maxDist);
            
            if(!map.containsKey(dist)) map.put(dist,node.data);
            if(node.left != null) q.add(new Pair(node.left,dist-1));
            if(node.right != null) q.add(new Pair(node.right,dist+1));
            
        }
        for(int i = minDist; i<= maxDist; i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
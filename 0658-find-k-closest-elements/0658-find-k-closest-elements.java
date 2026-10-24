class Doublet implements Comparable<Doublet>{
    int diff;
    int ele;

    Doublet(int diff, int ele){
        this.diff = diff;
        this.ele = ele;
    }

    public int compareTo(Doublet p){
        if(this.diff == p.diff) return this.ele - p.ele;
        return this.diff - p.diff;
    }

}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Doublet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<arr.length;i++){
            int diff = Math.abs(x-arr[i]);

            pq.add(new Doublet(diff,arr[i]));

            if(pq.size()>k){
                pq.remove();
            }

        }
        List<Integer> ans = new ArrayList<>();

        while(pq.size()>0){
            int top = pq.remove().ele;
            ans.add(top);
        }
        Collections.sort(ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int minCost(int[] arr) {
        if(arr.length<=1) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        int totalcost = 0;
        while(pq.size()>1){
            int min1 = pq.remove();
            int min2 = pq.remove();
            int currcost = min1+min2;
            totalcost += currcost;

            pq.add(currcost);

        }
        return totalcost;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
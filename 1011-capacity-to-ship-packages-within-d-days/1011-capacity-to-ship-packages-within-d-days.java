class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0; int maxweight = 0;
        for(int ele : weights){
            sum += ele;
            maxweight = Math.max(ele,maxweight);
        }

        int low = maxweight;
        int high = sum;
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(days(mid,weights) <= days){
                high = mid-1;
                ans = mid;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int days(int capacity,int[] weights){
        int d = 0;
        int c = capacity;

        for(int ele : weights){
            if(c>=ele) c-=ele;
            else{
                d++;
                c= capacity -ele;
            }
        }
        d++;
        return d;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
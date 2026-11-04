class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxnum = Integer.MIN_VALUE;
        for(int ele : nums){
            maxnum = Math.max(ele,maxnum);
        }
        int low = 1; int high = maxnum; int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(sum(mid,nums)<=threshold){
                high = mid-1;
                ans = mid;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int sum(int t , int[] nums){
        int sum = 0;
        for(int ele : nums){
            int div = Math.ceilDiv(ele,t);
            sum += div;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxpile = Integer.MIN_VALUE;
        for(int ele : piles){
            maxpile = Math.max(maxpile,ele);
        }
        int low = 1;
        int high = maxpile;
        int ans = 0;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(hours(mid,piles)<=h){
                high = mid - 1;
                ans = mid;

            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public long hours(int speed, int[] piles) {
        long totalHours = 0;
        for (int ele : piles) {
            
            totalHours += (ele + speed - 1L) / speed;
        }
        return totalHours;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
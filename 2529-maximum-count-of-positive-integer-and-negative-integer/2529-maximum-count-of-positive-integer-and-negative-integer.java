class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid =0;

        while(low<= high){
            mid = (high+low)/2;
            if(arr[mid] >=0) high = mid-1;
            else low = mid+1;
        }
        int negcount = low;

        low = 0;
        high = n-1;

        while(low<= high){
            mid = (high+low)/2;
            if(arr[mid] <=0) low = mid+1;
            else high = mid -1;
        }
        int poscount = n-low;

        if(poscount>=negcount) return poscount;
        else return negcount;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
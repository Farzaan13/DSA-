class Solution {
    public int recursearch(int[] arr, int target, int strtdx, int enddx){
        if(strtdx>enddx) return -1;
        int mid = (strtdx+enddx)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target){
            return recursearch(arr,target,strtdx,mid-1);
        }
        else return recursearch(arr, target,mid+1,enddx);
        
        
    }
    public int search(int[] arr, int target) {
        int strtdx = 0;
        int enddx = arr.length-1;

        return recursearch(arr,target,strtdx,enddx);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
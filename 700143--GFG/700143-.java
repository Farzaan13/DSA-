class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        
    }
}class Solution {
     public void bubbleSort(int[] arr) {
         // code here
         int n = arr.length;
         for(int i = 0; i<n-1;i++){
             int isswap = 0;
             for(int j = 0; j<n-1-i;j++){
                 if(arr[j]>arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     isswap++;
                 }
             }
             if(isswap ==0) break;
         }
     }
 }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
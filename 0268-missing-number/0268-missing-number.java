class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        // int missing=-1;
        for(int i=0;i<n;i++){
            if(i!=arr[i])
            return  i;
     
        }
         return n;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
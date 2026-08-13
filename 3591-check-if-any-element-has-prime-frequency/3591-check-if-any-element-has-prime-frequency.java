class Solution { 
    public boolean prime(int n){
        if(n==1 || n==0) return false;
        for(int i=2;i<n-1;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
         int n =nums.length;
         int[] freq=new int[101];
         for(int i=0;i<n;i++){
            freq[nums[i]]++;
         }
          for(int i=0;i<freq.length;i++){
            if(prime(freq[i]))
            return true;
          }
           return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
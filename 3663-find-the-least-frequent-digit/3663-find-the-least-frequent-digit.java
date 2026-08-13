class Solution {
    public int getLeastFrequentDigit(int n) {
         int[] freq=new int[10];
         while(n!=0){
           int digit=n%10;
            freq[digit]++;
            n/=10;
         }
         int minfreq=Integer.MAX_VALUE;
          for(int i=0;i<10;i++){
         if(freq[i]>0 && freq[i] <minfreq )
            minfreq=freq[i];
            
         }
          for(int i=0;i<10;i++){
            if(freq[i]==minfreq){
                return i;
            }
          }
return -1;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
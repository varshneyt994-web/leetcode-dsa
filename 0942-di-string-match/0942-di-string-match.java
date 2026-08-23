class Solution {
    public int[] diStringMatch(String s) {
         int n=s.length();
         int[] arr=new int[n+1];
          int low=0;
          int high=n;
          for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                arr[i]=low++;
            }
             else{
                arr[i]=high--;
             }
          }
          
           arr[n]=low;
          
            return arr;
          
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
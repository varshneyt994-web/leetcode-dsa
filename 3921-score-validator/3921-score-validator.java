class Solution {
    public int[] scoreValidator(String[] arr) {
         int[] ans=new int[2];
          int sum=0;
          int count=0;
         for(int i=0;i<arr.length;i++){
           if(arr[i].equals("W")){
                count++;
             if(count==10)
                break;
             }
              else if(arr[i].equals("WD")){
                sum+=1;
              }
               else if(arr[i].equals("NB")){
                sum+=1;
               }
               else{
               sum+=Integer.parseInt(arr[i]);
             }
         }
             ans[0]=sum;
             ans[1]=count;

         
          return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
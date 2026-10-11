class Solution {
    public int sumOfSquares(int[] nums) {
         int n=nums.length;
         int[] arr=new int[n];
          int j=0;
          for(int i=1;i<=n;i++){
            if(n%i==0){
            arr[j]=nums[i-1]*nums[i-1];
               j++;
            }
          }
           int sum=0;
           for(int i=0;i<n;i++){
            sum+=arr[i];
           }
         return sum;
        
    }
}
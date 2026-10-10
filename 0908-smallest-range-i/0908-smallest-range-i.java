class Solution {
    public int smallestRangeI(int[] arr, int k) {
         int max=arr[0];
         int min=arr[0];
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
         }
         return Math.max(0,max-min-2*k);
        
    }
}
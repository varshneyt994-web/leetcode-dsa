class Solution {
    public int countTestedDevices(int[] arr) {
         int n=arr.length;
         int test=0;
         for(int i=0;i<n;i++){
            if(arr[i]>0){
                  test++;
                
            
            for(int j=i+1;j<n;j++){
               arr[j]-=1;
                }
            }
         }
             return test;
         }
        
    }

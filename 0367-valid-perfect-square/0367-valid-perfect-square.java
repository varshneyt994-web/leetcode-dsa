class Solution {
    public boolean isPerfectSquare(int num) {
         int lo=1,hi=num;
         while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long sequre = (long)mid*mid;
            if(sequre==num){
                return true;
            }
             else if(sequre<num){
                lo=mid+1;
             }
             else {
             hi=mid-1;
         }

         }
          return false;
        
    }
}
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
         int[] ans=new int[2];
         int n=nums1.length;
         int m=nums2.length;
       
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( i<n && j<m && nums1[i]==nums2[j]) {
               ans[0]++;
               break;
                }
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums1[j]==nums2[i]) {
                  ans[1]++;
                  break;
                }
            }
        }
        
        return ans;
    }
}
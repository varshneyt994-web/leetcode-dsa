class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n=nums.length;
        int m=queries.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        int[] ans=new int[m];
         for(int i=0;i<m;i++){
        int lo=0,hi=n-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(nums[mid]>queries[i]) hi=mid-1;
                else{
                    ans[i]=Math.max(ans[i],mid+1);
                    lo=mid+1;
                }
            }

        }
         return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
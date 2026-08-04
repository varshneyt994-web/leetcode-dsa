class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
         Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            while(nums[i]+1<nums[i+1]){
                nums[i]++;
                ans.add(nums[i]);
            
                
            }
            
        
        }
         return ans;       
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
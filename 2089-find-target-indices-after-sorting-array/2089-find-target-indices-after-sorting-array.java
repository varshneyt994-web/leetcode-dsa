class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         ArrayList<Integer> al=new ArrayList<>();
         Arrays.sort(nums);
         for(int i=0;i<nums.length;i++){
            if(nums[i]== target){
                al.add(i);
            }
         }
         
          return al;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
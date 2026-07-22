class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        int n = nums.length;
        boolean flag = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] + nums[j] == target) {

                    arr[0] = i;
                    arr[1] = j;
                    flag = true;
                    break;
                }
            }

            if (flag == true) {
                break;
            }
        }

        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
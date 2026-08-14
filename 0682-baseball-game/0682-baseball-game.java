class Solution {
    public int calPoints(String[] arr) {
         int sum=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("C")){
            ans.remove((ans.size()-1));
        }
        else if(arr[i].equals("D")){
            ans.add(ans.get(ans.size()-1)*2);
        }
        else if(arr[i].equals("+")){
            ans.add(ans.get(ans.size()-1)+(ans.get(ans.size()-2)));
        }
        else{
            ans.add(Integer.parseInt(arr[i]));
        } 

        }
         for(int i=0;i<ans.size();i++){
            sum+=ans.get(i);
         }
           return sum;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
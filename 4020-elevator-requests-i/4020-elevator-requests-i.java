class Solution {
    public int elevatorRequests(int n, int[] arr) {
        int sum=arr[0];
        for(int i=0;i<arr.length-1;i++){
            sum+=Math.abs(arr[i+1]-arr[i]);
        }
        return sum;
    }
}
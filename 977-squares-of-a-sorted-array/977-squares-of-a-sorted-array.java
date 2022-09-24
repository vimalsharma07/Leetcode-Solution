class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[]ans= new int[n];
        int s=0;
        int e=n-1;
        int idx= n-1;
        
        while(e>=s){
            if(Math.abs(nums[s])>=Math.abs(nums[e])){
                ans[idx--]=nums[s]*nums[s];
                s++;
            }else{
                ans[idx--]=nums[e]*nums[e];
                e--;
            }
        }
        return ans;
    }
}
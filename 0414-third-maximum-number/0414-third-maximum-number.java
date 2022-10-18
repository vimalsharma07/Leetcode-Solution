class Solution {
    public int thirdMax(int[] nums) {
       int n= nums.length;
        Arrays.sort(nums);
        if(n<3){
            if(n==1)return nums[0];
            return Math.max(nums[0], nums[1]);
        }
        boolean flag= false;
       int ans1=Integer.MIN_VALUE, ans2=Integer.MIN_VALUE,ans3=Integer.MIN_VALUE; 
         for(int i=n-1; i>=0; i--){
             if(nums[i]>=ans1)ans1=nums[i];
             else if(nums[i]>=ans2)ans2=nums[i];
             else if(nums[i]>=ans3){
                 ans3= nums[i];
                 flag=true;
             }
         }
        if(flag==false)return ans1;
        return ans3;
    }
   
}
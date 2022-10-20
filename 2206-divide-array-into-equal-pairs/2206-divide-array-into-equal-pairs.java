class Solution {
    public boolean divideArray(int[] nums) {
        int n= nums.length;
        if(n%2 !=0 )return false;
        int pair= n/2;
        Arrays.sort(nums);
        int ans=0;
        for(int i=1; i<n; i+=2){
            if(nums[i]==nums[i-1])ans++;
        }
        return ans==pair;
        
    }
}
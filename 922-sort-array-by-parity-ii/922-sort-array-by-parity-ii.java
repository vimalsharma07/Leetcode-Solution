class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int[] ans = new int[nums.length];
    int even = -2, odd = -1;

    for (int  i: nums){
        if (i % 2 == 0) ans[even+=2] = i;
        else ans[odd+=2] = i;
    }

    return ans; 
    }
}
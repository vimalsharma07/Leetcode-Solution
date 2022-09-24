class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        // count the zeros and make nums all positive
        int count_zero=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0)count_zero++;
            if(nums[i]<0){
                nums[i]=nums[i]*(-1);
            }
        }
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            nums[i]= nums[i]*nums[i];
        }
        return nums;
    }
}
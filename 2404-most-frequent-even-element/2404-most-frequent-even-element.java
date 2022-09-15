class Solution {
    public int mostFrequentEven(int[] nums) {
        
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }
        // for(int i: nums){
        //     System.out.print(i+" ");
        // }
        int ans=-1;
        int temp=0;
       
        for(int i : hm.keySet()){
         if(hm.get(i)>temp){
             temp=hm.get(i);
             ans=i;
         }else if(hm.get(i)==temp && i<ans){
             ans=i;
         }
        }
        return ans;
    }
}
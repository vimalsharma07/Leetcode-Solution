class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer > hm= new HashMap<>();
        int n= nums.length;
        for(int i=0; i<n; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
           
        }
           int ans=-1;
            int temp=0;
            
            for(int i:hm.keySet()){
                if(hm.get(i)>temp){
                    temp=hm.get(i);
                    ans= i;
                }
            }
            return ans;
    }
}
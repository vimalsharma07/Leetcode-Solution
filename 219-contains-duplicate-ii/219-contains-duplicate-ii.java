class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      int n= nums.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(hm.containsKey(nums[i])){
                int idx= hm.get(nums[i]);
                int temp= Math.abs(idx-i);
                if(temp<=k){
                    return true;
                }
                else{
                  hm.replace(nums[i],i) ; 
                }
            }else{
                hm.put(nums[i],i);
            }
        }
        return  false;
    }
}
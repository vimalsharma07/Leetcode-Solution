class Solution {
    public int[] singleNumber(int[] nums) {
        int n= nums.length;
        HashMap<Integer,Integer>hm= new HashMap<>();
        
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int[]ans= new int[2];
        int idx=0;
        for(int j:hm.keySet()){
            if(hm.get(j)!=2){
                ans[idx++]=j;
            }
        }
       return ans; 
    }
}
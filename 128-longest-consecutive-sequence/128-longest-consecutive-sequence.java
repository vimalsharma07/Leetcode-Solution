class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        HashMap<Integer, Boolean> hm= new HashMap<>();
        // firstly we are puting all elements in hashmap and putting true that we can make answer fot this
        for(int i : nums){
            hm.put(i,true);
        }
        
        // we shortlist that which elements in hashmap makes oue answer
        for(int k : hm.keySet()){
            if(hm.containsKey(k-1)){
                hm.replace(k,false);
            }
        }
        // finally calculate the answer
        int ans=0;
        
        for(int i:nums){
            if(hm.get(i)){
                int len=1;
                while(hm.containsKey(i+len)){
                    len++;
                }
                if(len>ans){
                    ans=len;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n= nums.length;
        
        // lets make a frequency map about number of occerence for any element 
        for(int i=0; i<n; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        
        int max=0;
        // lets consider max is the maxiume frequency of any element in array and update 
        for(int i:hm.keySet()){
            if(hm.get(i)>max){
                max= hm.get(i);
            }
        }
        
        // now add the every element in list who's frequency is equal to max
        
        // check the maxiume occerunce of any number is more then n/3 or not if not return empty list 
        if(max<=n/3)return list;
        
        for(int i:hm.keySet()){
            if(hm.get(i)>n/3){
                list.add(i);
            }
        }
        return list;
        
    }
}
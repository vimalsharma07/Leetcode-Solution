class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        
        int row= nums.length;
    
        for(int i=0; i<row; i++){
            for(int j=0; j<nums[i].length; j++){
                int val= nums[i][j];
                hm.put(val,hm.getOrDefault(val,0)+1);
            }
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(int i : hm.keySet()){
            if(hm.get(i)==row){
                list.add(i);
            }
        }
        int[]temp=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            temp[i]= list.get(i);
            
        }
        Arrays.sort(temp);
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i : temp){
            ans.add(i);
        }
        return ans;
    }
}
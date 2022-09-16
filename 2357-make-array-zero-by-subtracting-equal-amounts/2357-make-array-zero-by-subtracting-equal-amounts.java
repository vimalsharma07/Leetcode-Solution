class Solution {
    
    public int minimumOperations(int[]arr){
       
     HashSet<Integer> hs= new HashSet<>();
        for(int i: arr){
            if(i!=0){
                hs.add(i);
            }
        }
        return hs.size();
    }
}
class Solution {
    public int singleNumber(int[] arr) {
      int n= arr.length;
        
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        for(int j: hm.keySet()){
            if(hm.get(j)!=3){
                return j;
            }
        }
        return -1;
    }
}
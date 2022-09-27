class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int n= heights.length;
        String[]temp= new String[n];
        
        for(int i=0; i<n; i++){
            hm.put(heights[i],i);
        }
        
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        
        for(int i : hm.keySet()){
            int idx= hm.get(i);
            Pair ans= new Pair(i,idx);
            pq.add(ans);
        }
        int j=0;
        while(!pq.isEmpty()){
            Pair f= pq.remove();
            temp[j++]=names[f.idx];
}
   return temp;     
    }
    class Pair implements Comparable <Pair>{
        int value ;
        int idx;
    
    Pair( int value, int idx){
         this.value=value;
        this.idx=idx;
    }
        public int compareTo(Pair other){
            return other.value-this.value;
        }
    
}
}
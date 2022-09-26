class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int n= nums.length;
        Map<Integer,Integer> hm= new HashMap<>();
        
        for(int i : nums)hm.put(i,hm.getOrDefault(i,0)+1);   // make to store the frequence of number
        
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        
        for(int i : hm.keySet()){
            pq.add(new Pair(i,hm.get(i)));
        }
        int idx=0;
        int[]ans= new int[k];
        while(k!=0){
            Pair t= pq.remove();
           ans[idx++] =t.val;
            k--;
        }
       return ans;
    }
    class Pair implements Comparable<Pair>{
        int val;
        int fre;
        
        Pair(int val, int fre){
            this.val=val;
            this.fre=fre;
        }
        public int compareTo(Pair other){
            return other.fre-this.fre;
        }
    }
}
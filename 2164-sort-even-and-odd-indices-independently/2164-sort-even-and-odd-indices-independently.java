class Solution {
   
    public int[] sortEvenOdd(int[] nums) {
        int n= nums.length;
        
        // firstly make the Priority queue to sort the even index
        PriorityQueue<Pair> pq_even= new PriorityQueue();
        
        
         for(int i=0; i<n; i+=2) {
            Pair pt= new Pair(i,nums[i]);
            pq_even.add(pt);
        }
        int even=0;
        // now update the array and remove the elements from priorty queue
        while(!pq_even.isEmpty()){
            Pair w= pq_even.remove();
            nums[even]=w.val;
            even+=2;
        }
        
        
        
        
        
        // make the Priority queue to sort the odd index
        
        PriorityQueue<Pair> pq= new PriorityQueue();
        
        
        for(int i=1; i<n; i+=2){
            Pair pt= new Pair(i,nums[i]);
            pq.add(pt);
        }
        
        int odd=1;
        while(!pq.isEmpty()){
            Pair w= pq.remove();
            nums[odd]=w.val;
            odd+=2;
        }
        return nums;
    }
    class Pair implements Comparable<Pair>{
        int val;
        int idx;
        
        Pair(int idx, int val){
            this.val=val;
            this.idx=idx;
        }
        public int compareTo(Pair other){
            if(idx%2==0){
              return this.val-other.val;

            }
            return other.val-this.val;
        }
    }
}
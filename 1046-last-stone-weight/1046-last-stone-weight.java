class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        
for(int i: stones)pq.add(i);
        while(pq.size()>1){
            int a= pq.remove();
            int b= pq.remove();
            int diff= a-b;
            if(diff!=0)pq.add(diff);
        }
        
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
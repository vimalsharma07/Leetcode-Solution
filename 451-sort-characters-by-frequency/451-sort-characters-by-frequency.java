class Solution {
    public String frequencySort(String str) {
        int n= str.length();
        StringBuilder ans= new StringBuilder();
        
        Map<Character,Integer> hm= new HashMap<>();
        
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        
        for(char c : hm.keySet()){
            pq.add(new Pair(c,hm.get(c)));
        }
        while(!pq.isEmpty()){
            Pair temp= pq.remove();
            for(int i=0; i<temp.f; i++){
                ans.append(temp.ch);
            }
        }
        return ans.toString();
        }
        
       
    
    class Pair implements Comparable<Pair> {
        char ch;
        int f;
        Pair(char ch, int f){
            this.ch=ch;
            this.f= f;
        }
        public int compareTo(Pair other){
            return other.f-this.f;
        }
    }
}
class Solution {
   public int lengthOfLongestSubstring(String str) {
       int i=0; int j=0;  int max=0;
      HashSet<Character>set=  new HashSet<Character>();
        while(j<str.length()){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j++));
                max= Math.max(set.size(),max);
            }
            else{
                set.remove(str.charAt(i++));
            }
        }
        
       
        return max;
    }
}
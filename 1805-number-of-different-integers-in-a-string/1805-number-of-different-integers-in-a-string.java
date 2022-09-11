class Solution {
    public int numDifferentIntegers(String word) {
        int len = word.length();
        
        //Need to keep track of integers occuring earlier.
        HashSet<String> set = new HashSet<>();
        
        StringBuilder sb = new StringBuilder();
        
        boolean lastWasZero = false;
        
        for(int i = 0; i < len; ++i){
            final char ch = word.charAt(i);
            
            if(ch >= '0' && ch <= '9'){
			//take care of the special case.
                if(!sb.isEmpty() && sb.charAt(0) == '0') sb.delete(0, 1);
                sb.append(ch);
            } else {
                if(!sb.isEmpty()){
                    set.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            }
        }
        
        if(!sb.isEmpty()){
            set.add(sb.toString());
        }
        
        return set.size();
    }
}
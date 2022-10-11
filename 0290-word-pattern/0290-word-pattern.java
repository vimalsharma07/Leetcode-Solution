class Solution {
    public boolean wordPattern(String pattern, String s) {
        
      HashMap<Character,String> hm= new HashMap<>() ;
        
     String[]arr= s.split(" ");
         

        
      if(arr.length!=pattern.length()) return false;
        
        int n= arr.length;
       
        for(int i=0; i<n; i++){
            char ch= pattern.charAt(i);
            String str= arr[i];
            if(hm.containsKey(ch)){
                String temp= hm.get(ch);
                if(!temp.equals(str))return false;
                else continue;
            }else{
               for( char sh : hm.keySet()){
                   String temp= hm.get(sh);
                   if(str.equals(temp))return false;
               }
                hm.put(ch,str);
            }
        }
        
        
       return true; 
    }
}
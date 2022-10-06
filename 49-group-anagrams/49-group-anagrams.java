class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> lists= new ArrayList<>();     // answer list that will return 
       
        
        // map under map to store fre of string and arraylist to ans string 
     HashMap<HashMap<Character,Integer> , ArrayList<String>> bhm= new HashMap<>() ;
        
        
        for( String str: strs){
            HashMap<Character, Integer> hm= new HashMap<>();
            for(int i=0; i<str.length(); i++){
                char ch= str.charAt(i);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            if(bhm.containsKey(hm)){
                ArrayList<String> temp= bhm.get(hm);
                temp.add(str);
            }else{
                ArrayList<String> a= new ArrayList<>();
                a.add(str);
                bhm.put(hm,a);
            }
        }
        
        // put the all values of bhm in answe arraylists 
        
        for(ArrayList<String> b : bhm.values()){
          lists.add(b) ; 
        }
    return lists;
    }
}
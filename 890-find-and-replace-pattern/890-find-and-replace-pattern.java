class Solution {
    public static String Pattern (String str){
        int n= str.length();
        HashMap<Character,Integer> hm= new HashMap<>();
        int ctr=0;
        StringBuilder ans= new StringBuilder ();
        for(int i=0; i<n; i++){
            if(hm.containsKey(str.charAt(i))){
                ans.append(Integer.toString(hm.get(str.charAt(i))));
                ctr++;
            }else{
                hm.put(str.charAt(i),ctr);
                ans.append(Integer.toString(ctr));

                ctr++;
            }
        }
        return ans.toString();
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
       
        List<String> list= new ArrayList<>();
        
        String main_pattern= Pattern(pattern);
        for(String s : words){
            String temp= Pattern(s);
            if(temp.equals(main_pattern)){
                list.add(s);
            }
        }
        return list;
    }
}
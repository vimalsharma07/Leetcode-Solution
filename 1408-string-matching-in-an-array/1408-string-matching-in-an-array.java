class Solution {
    public static boolean Check(String[]ans, String target, int idx){
        int n= ans.length;
        for(int i=0; i<n; i++){
            if(i!=idx && ans[i].contains(target)){
                return true;
            }
        }
        return false;
    }
    public List<String> stringMatching(String[] words) {
        int n= words.length;
        ArrayList<String> list= new ArrayList<>();
        for(int i=0; i<n; i++){
            if(Check(words,words[i],i)){
               list.add(words[i]);
            }
        }
        return list;
    }
}
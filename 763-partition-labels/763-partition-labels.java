class Solution {
    public List<Integer> partitionLabels(String str) {
      int n= str.length();
    int[]fre = new int[26];
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            fre[ch-'a']=i;
        }
       
        int max_length=-1; int min_length=0;
        List<Integer> ans= new ArrayList<>();
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            if(fre[ch-'a']>max_length){
                max_length=fre[ch-'a'];
            }
            if(max_length==i){
                ans.add(max_length-min_length+1);
                min_length=i+1;
            }
             
        }
       return ans; 
    }
}
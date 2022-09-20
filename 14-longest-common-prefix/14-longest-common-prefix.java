class Solution {
    public static String Check(String str, String ans){
        String temp="";
        int i=0; int j=0;
        while(i<str.length()&& j<ans.length()){
            if(str.charAt(i)==ans.charAt(j)){
                temp+=ans.charAt(i);
                i++;
                j++;
            }else{
                break;
            }
        }
        return temp;
    }
    public String longestCommonPrefix(String[] strs) {
       int n= strs.length;
        String ans= strs[0];
        for(int i=0; i<n; i++){
          ans=  Check(strs[i],ans);
        }
        
        return ans;
    }
}
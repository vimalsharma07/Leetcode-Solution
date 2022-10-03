class Solution {
    public String restoreString(String str, int[] indices) {
        int n= str.length();
        char [] ans= new char[n];
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            ans[indices[i]]=ch;
        }
      return  String. valueOf(ans);
    }
}
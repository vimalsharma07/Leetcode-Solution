class Solution {
    public String replaceDigits(String str) {
        int n= str.length();
        
        char[]ans= new char[n];
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            if(ch>='a' && ch<='z'){
                ans[i]=ch;
            }else{
                int ascii=(int) (ch-'0');
                char sh= str.charAt(i-1);
                int fn= (int)(sh)+(ascii);
                ans[i]=(char)(fn);
            }
        }
        StringBuilder temp= new StringBuilder();
        for(char ch :ans){
            temp.append(ch);
        }
        return temp.toString();
    }
}
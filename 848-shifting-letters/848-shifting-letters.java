class Solution {
    public String shiftingLetters(String str, int[] arr) {
        
        int n= arr.length;
        char[]ans= new char[n];
        
        int sum=0;
        for(int i=n-1; i>=0; i--){
            sum= (sum+arr[i])%26;
            
            char ch= str.charAt(i);
            int ascii= (int)ch +sum;
            
           if(ascii>'z'){
               ascii= (ascii%122)+96;
               ans[i]=(char)(ascii);
           }else{
               ans[i]=(char)(ascii);
           }
        }
        
        StringBuilder temp= new StringBuilder();
        for(char ch : ans){
            temp.append(ch);
        }
        return temp.toString();
    } 
}
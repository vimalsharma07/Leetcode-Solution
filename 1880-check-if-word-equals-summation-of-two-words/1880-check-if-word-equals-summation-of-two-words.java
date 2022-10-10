class Solution {
    public static int Summation ( String str){
        int n= str.length();
        int ans=0;
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            int temp=  (int) (ch-'a');
            ans= ans*10 + temp;
        }
        return ans;
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
       int first= Summation(firstWord);
        int second = Summation(secondWord);
        
        int target=  Summation(targetWord);
        
        return (first+second)==target;
    }
}
class Solution {
    public int maxLengthBetweenEqualCharacters(String str) {
        int n= str.length();
        char[]arr= str.toCharArray();
      
        

        
         int max=-1;
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    max= Math.max(max,j-i-1);
                }
                
            }
        }
        return max;
    }
}
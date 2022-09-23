class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n= arr.length;
        Arrays.sort(arr);
        
        if(n==2){
            if(arr[0]!=arr[1]){
                return false;
            }else{
                return true;
            }
        }
        int[]temp= new int[n];
        int idx=0;
        
        int count=1;
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                temp[idx++]=count;
                count=1;
            }
        }
        Arrays.sort(temp);
        for(int i=1; i<n; i++){
            if(temp[i]!=0){
                if(temp[i]==temp[i-1]){
                    return false;
                }
            }
            
                
            
        }
       return true; 
    }
}
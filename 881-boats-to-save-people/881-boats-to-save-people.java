class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n= people.length;
       Arrays.sort(people);
        
        int count=0;
        // lets take two pointors at 0th index and last index 
        int i=0; int j= n-1;
        
        while(j>=i){
            
            if(people[i]+people[j]<=limit){
                count++;
                i++;
                j--;
            }else{
                count++;
                j--;
            }
        }
        
       
        return count;
    }
}
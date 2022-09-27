class Solution {
    public char repeatedCharacter(String s) {
        int n= s.length();
        
        int first_occerence=0;
        int second_occerence=n;
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            for(int j=i+1; j<n; j++){
                char sh= s.charAt(j);
                if(ch==sh){
                    if(j>second_occerence){
                        continue;
                    }else{
                        second_occerence=j;
                        first_occerence=i;
                    }
                   
                   
                }
            }
        }
        return  s.charAt(first_occerence);
    }
}
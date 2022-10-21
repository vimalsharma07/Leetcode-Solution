class Solution {
    static int[]fre= new int[256];
    
    
    public static void Check(String str){
        int n= str.length();
        int[]temp= new int[256];
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            temp[ch]++;
        }
        
        for(int i=0; i<256; i++){
            if(fre[i]>0){
                if(temp[i]==0){
                    fre[i]=0;
                }else{
                int min= Math.min(fre[i],temp[i]);
                    fre[i]=min;
                }
            }
        }
        for(int i =0; i<256; i++ ){
            if(fre[i]<0){
                fre[i]=0;
            }
            
        }
    }
    public List<String> commonChars(String[] words) {
      int n= words.length;
      int m= words[0].length();
     
        for(int i=0; i<m; i++){
            char ch= words[0].charAt(i);
            fre[ch]++;
        }
        for(int i=1; i<n; i++){
            Check(words[i]);
        }
     List<String> ans= new ArrayList<>() ;
        
        for(int i=0; i<256; i++){
            if(fre[i]>0){
              while(fre[i]>0){
                 
             char ch=    (char)(i);
            String a= Character.toString(ch);
            ans.add(a);  
                  fre[i]--;
              }
            }
           
        }
        
        return ans;
}
}
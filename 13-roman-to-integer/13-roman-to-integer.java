class Solution {
    public int romanToInt(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n= str.length();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
       int ans=hm.get(str.charAt(0));
        
        for(int i=1; i<n; i++){
            ans=ans+hm.get(str.charAt(i));
            if((hm.get(str.charAt(i)))>(hm.get(str.charAt(i-1)))){
                ans= ans-( 2*(hm.get(str.charAt(i-1))));
                
            }
        }
        return ans;
        
    }
}
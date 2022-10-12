class Solution {
    public static boolean Check(String target, String[]arr){
        HashMap<String ,Integer> hm= new HashMap<>();
        int n= arr.length;
        for(int i=0; i<n; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        int m= arr[0].length();
        int t= target.length();
        int i=0;
        while(i<=t-m){
            String sb= target.substring(i,i+m);
            if(hm.containsKey(sb)){
                int val= hm.get(sb);
                if(val==0)return false;
                hm.replace(sb,val-1);
            }
            i+=m;
        }
        for(String st:hm.keySet()){
           if(hm.get(st)>0)return false;
        }
        return true;
    }
    public List<Integer> findSubstring(String str, String[] words) {
        
        int n= words.length;
        int m= str.length();
       List<Integer> list= new ArrayList<>() ;
        
        int total= n*words[0].length();
        
        for(int i=0; i<=m-total; i++){
            // boolean flag=true;
            String temp= str.substring(i,i+total);
//             for(int j=0; j<n; j++){
//                 if(temp.contains(words[j])){
                    
//                 }else{
//                     flag=false;
//                 }
//             }
//             if(flag==true && Check(temp,words)==true){
//                 list.add(i);
            if(Check(temp,words)){
                list.add(i);
            }
               
            }
        return list; 
        }
        
       
    }

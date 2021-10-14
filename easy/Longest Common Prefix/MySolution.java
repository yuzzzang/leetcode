class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = "";
        
        int len = 999; 
 
        for(int i=0;i<strs.length;i++){
          if(strs[i].length()<len){
              len = strs[i].length();
          }
        }
        for(int i=1;i<=len;i++){
            pre = strs[0].substring(0,i);
            for(int j=0;j<strs.length;j++){  
             if(!pre.equals(strs[j].substring(0,i))){
                 if(i==1){return "";}
                 else return pre = strs[j].substring(0,i-1);
                }
                else{
                      pre = strs[0].substring(0,i);
                }
            }
    
        }
        return pre;
    }
}
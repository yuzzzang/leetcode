class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        Stack<Character> stack = new Stack<>();
        char[] a = s.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            if(a[i]=='('||a[i]=='{'||a[i]=='['){
                stack.push(a[i]);
                continue;
            } 
            if(!stack.empty()&&(stack.peek()==map.get(a[i]))){
                stack.pop();
                continue;
            }
            return false;
        }
            
        return stack.empty(); 
   
}
 
}
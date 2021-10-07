class Solution {
    public boolean isPalindrome(int x) {
        int y=0; //숫자 역순
        if(x<0) return false; 
            for(int i=x;i!=0;i/=10){
                y=i%10+y*10;
            }
       if(x==y)return true;
       
        return false;
    }
}
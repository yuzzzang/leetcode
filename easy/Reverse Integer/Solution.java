class Solution {
    public int reverse(int x) {
        try{
              String a = Integer.toString(Math.abs(x));
              StringBuffer sb = new StringBuffer(a); 
              String rstr = sb.reverse().toString();
              if(x<0){
                  rstr = "-" + rstr;
              }
            int b = Integer.parseInt(rstr);
            return b;
        }catch(NumberFormatException e){
            return 0;
        }
                
    }
}
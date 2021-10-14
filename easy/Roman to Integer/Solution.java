class Solution {
    public int romanToInt(String s) {
        
     
        int[] num = new int[s.length()];
        int rst = 0;
        for(int i=0;i<s.length();i++){
            num[i]= getInt(s.charAt(i));
        }

        for(int i=0; i<s.length();i++){
            if(i==s.length()-1){
                rst += num[i];
                return rst;
            }
            else if(num[i]<num[i+1]){
                rst += (num[i+1]-num[i]);
                i++;
            }else{
            rst += num[i];
            }
        }
        return rst;
    }
    public int getInt(char c){
        switch (c) {
            case 'I':
                return 1;
           
            case 'V':
                return 5;
              
            case 'X':
                return 10;
            
            case 'L':
                return 50;
            
            case 'C': 
                return 100;
             
            case 'D':
                return 500;
               
            case 'M':
                return 1000;
            default:
                break;
        }
        return 0;
    }

}



/* class Solution {
    public int romanToInt(String s) {
        Map<Character ,Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);
        int result = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2; i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }
        else
            result += map.get(s.charAt(i));
        }
    return result;
        }
    } */
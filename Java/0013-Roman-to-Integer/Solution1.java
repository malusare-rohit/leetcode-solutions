import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num=0;
        for(int i=s.length()-1;i>=0;i--){
            if(i!=s.length()-1){
                if(s.charAt(i)=='I'  && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                    num-=1;
                    continue;
                }else if(s.charAt(i)=='X'  && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                    num-=10;
                    continue;
                }else if(s.charAt(i)=='C'  && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                    num-=100;
                    continue;
                }
            }
            num+=map.get(s.charAt(i));
        }
        return num;
    }
}
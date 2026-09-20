class Solution {
    public int reverseDegree(String s) {
        int result = 0;

        for(int i=0;i<s.length();i++){
            result += (123-s.charAt(i))*(i+1);
        }

        return result;
    }
}
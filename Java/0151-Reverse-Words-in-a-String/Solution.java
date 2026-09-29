class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=strArr.length-1;i>=0;i--){
            sb.append(" "+strArr[i]);
        }

        return sb.toString().trim();

    }
}
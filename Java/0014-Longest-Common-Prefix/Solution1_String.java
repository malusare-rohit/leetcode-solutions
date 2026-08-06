class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prf=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!(strs[i].startsWith(prf))){
                prf=prf.substring(0,prf.length()-1);
            }
            if (prf.isEmpty()) return "";
        }
        return prf;
    }
}
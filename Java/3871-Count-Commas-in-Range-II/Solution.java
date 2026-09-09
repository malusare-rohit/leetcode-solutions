class Solution {
    public long countCommas(long n) {
        if(n<1000000){
            return Math.max(0,n-999);
        }else if(n<1000000000){
            return Math.max(0,n*2-999-1000000)+1;
        }else if(n<1000000000000l){
            return Math.max(0,n*3-999999-999-1000000000)+1;
        }else if(n<1000000000000000l){
            return Math.max(0,n*4-999999999-999-999999-1000000000000l)+1;
        }else{
            return Math.max(0,n*4-999999999-999-999999-1000000000000l)+2;
        }        
        
    }
}
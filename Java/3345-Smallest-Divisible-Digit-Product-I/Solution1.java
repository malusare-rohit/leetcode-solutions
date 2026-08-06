class Solution {
    public int smallestNumber(int n, int t) {
        while(digitProduct(n)%t!=0){
            n++;
        }
        return n;
    }
    public int digitProduct(int n){
        int product = 1;
        int temp = n;
        while(temp>0){
            product*=temp%10;
            temp=temp/10;
        }
        return product;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i-1]>prices[i]){
                maxProfit += prices[i-1]-minPrice;
                minPrice = prices[i];
            }
        }

        if(minPrice<prices[prices.length-1]){
            maxProfit += prices[prices.length-1]-minPrice;
        }
        return maxProfit;
    }
}
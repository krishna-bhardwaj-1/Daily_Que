// Last updated: 12/08/2025, 00:20:01
class Solution {
    public int maxProfit(int[] prices) {
        int curprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                curprofit+=(prices[i]-prices[i-1]);
            }
        }
        return curprofit;
    }
}
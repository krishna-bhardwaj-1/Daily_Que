// Last updated: 12/08/2025, 00:20:02
class Solution {
    public int maxProfit(int[] prices) {
        int minbuy=Integer.MAX_VALUE;
        int maxsell=0;
        if(prices.length==0) return maxsell;
        for(int i=0;i<prices.length;i++){
        if(prices[i]<minbuy)
            minbuy=prices[i];
        else if(prices[i]-minbuy>maxsell)
            maxsell=prices[i]-minbuy;
        }
        return maxsell;

    }
}
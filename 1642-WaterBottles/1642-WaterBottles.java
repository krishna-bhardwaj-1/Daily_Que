// Last updated: 12/08/2025, 00:14:24
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles>=numExchange){
            int newbottle=numBottles/numExchange;
            int rembottle=numBottles%numExchange;
            ans+=newbottle;
            numBottles=newbottle+rembottle;
        }
        return ans;
    }
}
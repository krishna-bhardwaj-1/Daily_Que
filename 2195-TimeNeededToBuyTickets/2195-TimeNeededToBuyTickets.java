// Last updated: 12/08/2025, 00:12:54
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        while(tickets[k]!=0){
            int i=0;
            while(i<tickets.length){
                if(tickets[i]!=0){
                    tickets[i]--;
                    time++;
                }
                if(tickets[k]==0){
                    return time;
                }
                i++;
            }
        }
        return time;
    }
}
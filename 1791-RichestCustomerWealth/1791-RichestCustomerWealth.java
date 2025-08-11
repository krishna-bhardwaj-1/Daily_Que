// Last updated: 12/08/2025, 00:14:06
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int row=0;row<accounts.length;row++){
            int sum=0;
            int j=0;
            while(j<accounts[0].length){
                sum+=accounts[row][j];
                j++;
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}
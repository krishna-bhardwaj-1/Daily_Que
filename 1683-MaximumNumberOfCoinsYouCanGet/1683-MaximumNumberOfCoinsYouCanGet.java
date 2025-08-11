// Last updated: 12/08/2025, 00:14:14
class Solution {
    public int maxCoins(int[] piles) {
        int pile=0;
        Arrays.sort(piles);
        int j=0;
        for(int i=piles.length-2;i>=j;i-=2){
            pile+=piles[i];
            j++;
        }
        return pile;
    }
}
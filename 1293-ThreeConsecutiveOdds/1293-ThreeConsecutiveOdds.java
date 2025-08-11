// Last updated: 12/08/2025, 00:15:24
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int i:arr){
            if(c>=3) return true;
            if(i%2!=0) c++;
            else c=0;
        }
        return c==3;
    }
}